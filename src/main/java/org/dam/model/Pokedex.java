package org.dam.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;


public class Pokedex {

    @JsonProperty("pokemon")
    private final List<Pokemon> pokemon;

    @JsonCreator
    public Pokedex(@JsonProperty("pokemon") List<Pokemon> pokemon) {
        this.pokemon = pokemon != null ? pokemon : List.of();
    }

    public List<Pokemon> getPokemon() {
        return pokemon;
    }
}
