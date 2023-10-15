package md.usarb.cache;

import java.time.Instant;
import java.util.HashMap;
import java.util.Optional;

/**
 * Cache in hashmap
 */
public class SimpleCache implements Cache {
    private final HashMap<String, CacheItem> cache;

    public SimpleCache() {
        cache = new HashMap<>();
    }

    @Override
    public void set(String key, Object object, Long seconds) {
        synchronized (this) {
            cache.put(key, new CacheItem(object, seconds));
        }
    }

    @Override
    public Object get(String key) {
        synchronized (this) {
            return Optional.of(cache.get(key).getObject()).orElse(null);
        }
    }

    @Override
    public void delete(String key) {
        synchronized (this) {
            cache.remove(key);
        }
    }

    @Override
    public void evict() {
        synchronized (this) {
            cache.forEach((key, value) -> {
                if (Instant.now().compareTo(value.getExpireAt()) > 0) {
                    cache.remove(key);
                }
            });
        }
    }
}
