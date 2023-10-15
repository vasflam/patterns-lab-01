package md.usarb.application;

import md.usarb.application.common.CacheFactory;
import md.usarb.application.common.ServiceContainer;
import md.usarb.cache.Cache;

public class BaseApplication {
    public static void bootstrap() {
        ServiceContainer container = ServiceContainer.getInstance();
        Cache noopCache = new CacheFactory().createCache("noop");
        Cache simpleCache = new CacheFactory().createCache("simple");
        container.add("noopCache", noopCache);
        container.add("simpleCache", simpleCache);
    }
}
