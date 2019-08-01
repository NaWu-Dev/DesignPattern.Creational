package eagerlyInitializedSingleton;

public class LazilyDoubleCheckedLockingSingleton {

    // Lazily initialized singleton means delaying the initialization of something until the first time it is needed.

    // It is an optimized version of lazily initialized singleton. Instead of synchronize the whole method, it creates a synchronized block

    int count = 0;

    private static LazilyDoubleCheckedLockingSingleton instance;

    private LazilyDoubleCheckedLockingSingleton() {}

    public static LazilyDoubleCheckedLockingSingleton getInstance() {
        if (instance == null) {
            synchronized (LazilyDoubleCheckedLockingSingleton.class) {
                instance = new LazilyDoubleCheckedLockingSingleton();
                System.out.println("Lazy singleton instance created.");
            }
        }

        return instance;
    }

    public void displayCount() {
        System.out.println("Lazy Singleton : " + count++);
    }

}
