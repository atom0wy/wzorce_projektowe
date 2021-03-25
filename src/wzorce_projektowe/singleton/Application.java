package wzorce_projektowe.singleton;

import wzorce_projektowe.singleton.exercise.LEVEL;
import wzorce_projektowe.singleton.exercise.LoggerBillPugh;
import wzorce_projektowe.singleton.exercise.LoggerLazy;

public class Application {
    public static void main(String[] args) {

        LoggerLazy loggerLazy = LoggerLazy.getInstance();
        loggerLazy.log(LEVEL.ERROR, "test lazy error");

        LoggerBillPugh loggerBillPugh = LoggerBillPugh.getInstance();
        loggerBillPugh.log(LEVEL.INFO, "test bill pugh info");

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