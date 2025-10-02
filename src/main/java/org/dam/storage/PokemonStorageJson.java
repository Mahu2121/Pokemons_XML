package org.dam.storage;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.dam.model.Pokedex;
import org.dam.model.PokedexWrapper;
import org.dam.model.Pokemon;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class PokemonStorageJson implements PokemonStorage {

    @Override
    public List<Pokemon> readFromFile(File file) {
        try {
            ObjectMapper mapper = new ObjectMapper();

            PokedexWrapper wrapper = mapper.readValue(file, PokedexWrapper.class);
            return wrapper.getPokedex().getPokemon();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return List.of();
    }

    @Override
    public void writeFromFile(File file, List<Pokemon> pokemons) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            mapper.writeValue(file,pokemons);
        } catch (IOException e) {
            System.out.println(e);

        }
    }
}
