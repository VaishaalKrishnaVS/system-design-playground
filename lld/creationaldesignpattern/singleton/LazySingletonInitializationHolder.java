package lld.creationaldesignpattern.singleton;

public class LazySingletonInitializationHolder {
    private LazySingletonInitializationHolder(){
        System.out.println("Inside lazy singleton Initialization Holder");
    }
     private static class RegistryHolder {
        static LazySingletonInitializationHolder INSTANCE = new LazySingletonInitializationHolder();
    }
    public static LazySingletonInitializationHolder getInstance(){
        return RegistryHolder.INSTANCE;
    }
}
