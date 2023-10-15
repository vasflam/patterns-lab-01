package md.usarb.application.common;

import java.util.HashMap;

//@TODO Singleton pattern
public class ServiceContainer {
    private static ServiceContainer instance;
    private final HashMap<String, Object> services;

    private ServiceContainer() {
        services = new HashMap<>();
    }

    public static ServiceContainer getInstance() {
        if (instance == null) {
            System.out.println("Create instance");
            instance = new ServiceContainer();
        }
        return instance;
    }

    public void add(String key, Object object) {
        services.put(key, object);
    }

    public Object get(String key) {
        return services.get(key);
    }
}
