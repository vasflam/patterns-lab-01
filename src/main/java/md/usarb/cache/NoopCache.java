package md.usarb.cache;

/**
 * Dummy cache
 * @TODO Null object pattern
 */
public class NoopCache implements Cache {
    @Override
    public void set(String key, Object object, Long seconds) {

    }

    @Override
    public Object get(String key) {
        return null;
    }

    @Override
    public void delete(String key) {

    }

    @Override
    public void evict() {

    }
}
