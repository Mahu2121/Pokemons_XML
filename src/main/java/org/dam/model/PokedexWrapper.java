package org.dam.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PokedexWrapper {

    private final Pokedex pokedex;

    @JsonCreator
    public PokedexWrapper(@JsonProperty("pokedex") Pokedex pokedex) {
        this.pokedex = pokedex;
    }

    public Pokedex getPokedex() {
        return pokedex;
    }
}


