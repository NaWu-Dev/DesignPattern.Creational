package eagerlyInitializedSingleton;

public class EagerSingleton {

    // Instance of class is created at the time of Class Loading.
    // Disadvantage: It will have performance implication if the object allocates a large amount of system resources

    int count = 0;

    private EagerSingleton(){}

    private static final EagerSingleton instance = new EagerSingleton();

    public static EagerSingleton getInstance() {
        System.out.println("Eager Singleton Instance");
        return instance;
    }

    public void displayCount() {
        System.out.println("Count : " + count++);
    }

}
