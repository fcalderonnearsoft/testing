package Factory_Pattern;

/**
 * Created by MacBook on 05/08/16.
 */
public class FactoryPokemon {

    public Pokemon getPokemon(String pokemon){
        if(pokemon == null){
            return null;
        }
        if(pokemon.equalsIgnoreCase("Charmander")){
            return new Charmander();

        } else if(pokemon.equalsIgnoreCase("Squirtle")){
            return new Squirtle();

        } else if(pokemon.equalsIgnoreCase("Bulbasaur")){
            return new Bulbasaur();
        }
        else{
            System.out.println("Choose another Pokémon ");
            return null;
        }
    }
}
