package org.dam;

import org.dam.model.Pokemon;
import org.dam.storage.PokemonStorageJson;

import java.io.File;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        PokemonStorageJson pokemonStorageJson = new PokemonStorageJson();

        List<Pokemon> pokemons = pokemonStorageJson.readFromFile(new File("data/pokedex.json"));

        pokemons.stream().forEach(System.out::println);

    }
}