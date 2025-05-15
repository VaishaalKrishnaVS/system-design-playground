package lld.creationaldesignpattern.singleton;

public class Client {
    public static void main(String[] args) {
        var eagerSingleton = EagerSingleton.getInstance();
        var eagerSingleton2 = EagerSingleton.getInstance();
        System.out.println(eagerSingleton2==eagerSingleton);

        System.out.println("****************************");

        var lazySingleton = LazySingleton.getInstance();
        var lazySingleton2 = LazySingleton.getInstance();

        System.out.println(lazySingleton2==lazySingleton);

        System.out.println("****************************");

        var lazySingletonInitializationHolder = LazySingletonInitializationHolder.getInstance();
        var lazySingletonInitializationHolder2 = LazySingletonInitializationHolder.getInstance();


        System.out.println(lazySingletonInitializationHolder2==lazySingletonInitializationHolder);

        System.out.println("**************************");

        var singletonEnum = SingletonEnum.INSTANCE;
        var singletonEnum2 = SingletonEnum.INSTANCE;

        System.out.println(singletonEnum2==singletonEnum);

        System.out.println("************************");

    }
}
