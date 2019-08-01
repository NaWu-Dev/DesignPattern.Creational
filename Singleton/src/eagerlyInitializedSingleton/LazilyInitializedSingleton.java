package eagerlyInitializedSingleton;

public class LazilyInitializedSingleton {

    // Lazily initialized singleton means delaying the initialization of something until the first time it is needed.

    int count = 0;

    private static LazilyInitializedSingleton instance;

    private LazilyInitializedSingleton() {}

    public static synchronized LazilyInitializedSingleton getInstance() {
        if (instance == null) {
            instance = new LazilyInitializedSingleton();
            System.out.println("Lazy singleton instance created.");
        }

        return instance;
    }

    public void displayCount() {
        System.out.println("Lazy Singleton : " + count++);
    }

}
