package Singleton_Pattern;

import org.testng.annotations.Test;

/**
 * Created by MacBook on 05/08/16.
 */
public class SingletonTest {

    @Test
    public static void main(String[] args) {
        Singleton tmp = Singleton.getInstance( );
        tmp.testMethod( );
    }

}