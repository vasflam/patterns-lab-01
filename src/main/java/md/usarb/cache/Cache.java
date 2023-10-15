package md.usarb.cache;

public interface Cache {
    public void set(final String key, Object object, Long seconds);
    public Object get(final String key);
    public void delete(final String key);
    public void evict();
}