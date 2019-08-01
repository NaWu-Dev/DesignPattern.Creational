package eagerlyInitializedSingleton;

public class Main {

    public static void main(String[] arggs) {
        LazilyInitializedSingleton instance = LazilyInitializedSingleton.getInstance();
        instance.displayCount();
        LazilyInitializedSingleton instance1 = LazilyInitializedSingleton.getInstance();
        instance1.displayCount();
    }

}
