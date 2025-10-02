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

        System.out.println("\n Pokemons con menos de 60 de hp:");

        pokemons.stream().map(Pokemon::getStats).filter(s -> s.getHp() < 60).forEach(System.out::println);

        System.out.println("\n Pokemons de tipo fuego");

        pokemons.stream().filter(s -> s.getType().contains("Fire")).forEach(System.out::println);

        System.out.println("\n Pokemons con la habilidad Overgrow");

        pokemons.stream().filter(s -> s.getAbility().equals("Overgrow")).forEach(System.out::println);
    }
}