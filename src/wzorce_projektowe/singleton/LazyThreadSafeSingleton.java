package wzorce_projektowe.singleton;

public class LazyThreadSafeSingleton {
    private static LazyThreadSafeSingleton instance;

    private LazyThreadSafeSingleton() {}

    public static synchronized LazyThreadSafeSingleton getInstance() {
        if (instance == null) {
            instance = new LazyThreadSafeSingleton();
        }

        return instance;
    }
}