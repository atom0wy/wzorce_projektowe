package wzorce_projektowe.singleton;

public class Application {
    public static void main(String[] args) {
        EagerSingleton eagerSingleton = EagerSingleton.getInstance();
        EagerSingleton eagerSingleton2 = EagerSingleton.getInstance();

        System.out.println(eagerSingleton);
        System.out.println(eagerSingleton2);

        LazySingleton lazySingleton = LazySingleton.getInstance();
        LazySingleton lazySingleton2 = LazySingleton.getInstance();

        System.out.println(lazySingleton);
        System.out.println(lazySingleton2);

        BillPughSingleton billPughSingleton = BillPughSingleton.getInstance();
        BillPughSingleton billPughSingleton2 = BillPughSingleton.getInstance();

        System.out.println(billPughSingleton);
        System.out.println(billPughSingleton2);
    }
}