package Singleton_Pattern;

/**
 * Created by MacBook on 05/08/16.
 */

/** I don't understand completly this pattern, I thinks that's the way to limit the number of instance per class, for example, a DataBase
 * that only allow one connection to them at the same time, avoid the new connections when previously exist another connection
 * if I am wrong, can you explain me?, please*/

public class Singleton {
    private static Singleton singleton = new Singleton( );

    private Singleton(){ }

    public static Singleton getInstance( ) {
        return singleton;
    }

    protected static void testMethod( ) {
        System.out.println("Test for singleton");
    }
}
