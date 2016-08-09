package Factory_Pattern;

import org.testng.annotations.Test;

/**
 * Created by MacBook on 05/08/16.
 */
public class FactoryPokemonTest {
    @Test
    public void getPokemon() throws Exception {
        FactoryPokemon FactoryPokemon = new FactoryPokemon();

        Pokemon Choose = FactoryPokemon.getPokemon("Charmander");
        Choose.get();

    }
}