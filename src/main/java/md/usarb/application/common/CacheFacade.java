package md.usarb.application.common;

import md.usarb.cache.Cache;

// @TODO Facade pattern
public class CacheFacade {
    public static Cache store(String key) {
        Cache cache = (Cache) ServiceContainer.getInstance().get(key);
        System.out.println(key);
        if (cache == null) {
            throw new IllegalArgumentException("service not found: " + key);
        }
        return cache;
    }
}
