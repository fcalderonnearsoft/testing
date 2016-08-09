
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

/**
 * Created by MacBook on 29/07/16.
 */
public class FahrenheitCelciusConverterTest{
    @Test
    public void toCelcius() throws Exception {
        assertEquals(20, FahrenheitCelciusConverter.toCelcius(68));
    }

    @Test
    public void toFahrenheit() throws Exception {
        assertEquals(68, FahrenheitCelciusConverter.toFahrenheit(20));
    }
}