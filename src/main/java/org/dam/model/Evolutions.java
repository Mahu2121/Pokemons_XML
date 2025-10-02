package org.dam.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Evolutions {
    @JsonProperty("evolution")
    private final List<Evolution> evolution;

    @JsonCreator
    public Evolutions(@JsonProperty("evolution") List<Evolution> evolution) {
        this.evolution = evolution != null ? evolution : List.of();
    }

    public List<Evolution> getEvolution() {
        return evolution;
    }

    @Override
    public String toString() {
        return "Evolutions [evolution=" + evolution + "]";
    }
}