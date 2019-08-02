package eagerlyInitializedSingleton;

public class LazilyInnerClassSingleton {


    // Inner class SingletonHelp is loaded only after getINstance() is called.
    // It is the most efficient singleton design pattern implement.

    private LazilyInnerClassSingleton() {}

    private static class SingletonHelper {
        private static final LazilyInnerClassSingleton INSTANCE = new LazilyInnerClassSingleton();
    }

    public static LazilyInnerClassSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }

}
