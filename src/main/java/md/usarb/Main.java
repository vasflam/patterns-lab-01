package md.usarb;

import md.usarb.application.ApplicationBuilder;
import md.usarb.application.common.Application;
import md.usarb.application.common.CacheFacade;

public class Main {
    public static void main(String[] args) {
        ApplicationBuilder builder = new ApplicationBuilder();
        builder.setType(ApplicationBuilder.ApplicationType.CONSOLE);
        if (args.length > 0) {
            if ("web".equals(args[1])) {
                builder.setType(ApplicationBuilder.ApplicationType.WEB);
            }
        }
        Application app = builder.setMessageOfTheDay("Hello application!").build();
        // getHeader - factory method
        app.getHeader().show();

        //
        String cacheKey = "key";
        String cacheValue = "object to cache";

        CacheFacade.store("noopCache").set(cacheKey, cacheValue, 100L);
        assert CacheFacade.store("noopCache").get(cacheKey) != null;

        CacheFacade.store("simpleCache").set(cacheKey, cacheValue, 100L);
        assert cacheValue.equals(CacheFacade.store("simpleCache").get(cacheKey));
    }
}