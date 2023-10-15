package md.usarb.application;

import md.usarb.application.common.Application;
import md.usarb.application.common.CacheFactory;
import md.usarb.application.common.ServiceContainer;
import md.usarb.application.console.ConsoleApplication;
import md.usarb.application.web.WebApplication;
import md.usarb.cache.Cache;

//@TODO Builder pattern
public class ApplicationBuilder {
    public enum ApplicationType {
        CONSOLE,
        WEB,
    }

    private ApplicationType type;
    private String messageOfTheDay;
    private ServiceContainer container;

    public ApplicationBuilder() {
        Cache noopCache = new CacheFactory().createCache("noop");
        Cache simpleCache = new CacheFactory().createCache("simple");
        container = ServiceContainer.getInstance();
        container.add("noopCache", noopCache);
        container.add("simpleCache", simpleCache);
    }

    public ApplicationBuilder setType(ApplicationType type) {
        this.type = type;
        return this;
    }

    public ApplicationBuilder setMessageOfTheDay(String messageOfTheDay) {
        this.messageOfTheDay = messageOfTheDay;
        return this;
    }

    public Application build() {
        Application app = switch (type) {
            case CONSOLE -> new ConsoleApplication();
            case WEB -> new WebApplication();
        };
        app.setContainer(container);
        app.setMessageOfTheDay(messageOfTheDay);
        return app;
    }
}
