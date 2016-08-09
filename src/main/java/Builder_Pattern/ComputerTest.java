package Builder_Pattern;

import org.testng.annotations.Test;

/**
 * Created by MacBook on 05/08/16.
 */
public class ComputerTest {

    @Test
    public static void main(String[] args) {
        Computer comp1 = new Computer.ComputerBuilder("Intel i7-6700k @4.00 GHz", "Kingston HyperX FURY",32,"SSD")
                .graphics("GeForce GTX 1080")
        .build();
        System.out.println(comp1);

        Computer comp2 = new Computer.ComputerBuilder("Intel i5-6600k @3.90 GHz", "ADATA",4,"HDD")
                .build();

        System.out.println(comp2);
    }

}