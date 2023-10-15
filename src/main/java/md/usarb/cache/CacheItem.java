package md.usarb.cache;

import java.time.Instant;

public class CacheItem {
    private final Object object;
    private final Instant expireAt;

    public CacheItem(Object object, Long duration) {
        this.object = object;
        this.expireAt = Instant.now().plusSeconds(duration);
    }

    public Object getObject() {
        return object;
    }

    public Instant getExpireAt() {
        return expireAt;
    }
}
