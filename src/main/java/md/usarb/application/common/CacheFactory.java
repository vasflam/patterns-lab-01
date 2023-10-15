package md.usarb.application.common;

import md.usarb.cache.Cache;
import md.usarb.cache.NoopCache;
import md.usarb.cache.SimpleCache;

// @TODO Factory pattern
public class CacheFactory {
    public Cache createCache(String type) {
        return switch (type) {
            case "noop" -> new NoopCache();
            case "simple" -> new SimpleCache();
            default -> throw new IllegalArgumentException("unknown cache type");
        };
    }
}
