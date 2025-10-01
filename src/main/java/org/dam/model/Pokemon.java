package org.dam.model;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Pokemon {

    @JsonProperty("id")
    private final int id;

    @JsonProperty("name")
    private final String name;

    @JsonProperty("types")
    private final List<String> types;

    @JsonProperty("ability")
    private final String ability;

    @JsonProperty("exp")
    private final int exp;

    @JsonProperty("stats")
    private final Stat stats;

    @JsonProperty("evolutions")
    private final List<Evolution> evolutions;

    @JsonProperty("ratio")
    private final Ratio ratio;

    @JsonProperty("eggGroups")
    private final List<String> eggGroups;

    @JsonProperty("species")
    private final String species;

    @JsonProperty("height")
    private final double height;

    @JsonProperty("weight")
    private final double weight;

    @JsonProperty("description")
    private final String description;

    @JsonProperty("moves")
    private final List<Move> moves;

    @JsonCreator
    public Pokemon(
            @JsonProperty("id") int id,
            @JsonProperty("name") String name,
            @JsonProperty("types") List<String> types,
            @JsonProperty("ability") String ability,
            @JsonProperty("exp") int exp,
            @JsonProperty("stats") Stat stats,
            @JsonProperty("evolutions") List<Evolution> evolutions,
            @JsonProperty("ratio") Ratio ratio,
            @JsonProperty("eggGroups") List<String> eggGroups,
            @JsonProperty("species") String species,
            @JsonProperty("height") double height,
            @JsonProperty("weight") double weight,
            @JsonProperty("description") String description,
            @JsonProperty("moves") List<Move> moves
    ) {
        this.id = id;
        this.name = name;
        this.types = types != null ? types : List.of();
        this.ability = ability;
        this.exp = exp;
        this.stats = stats;
        this.evolutions = evolutions != null ? evolutions : List.of();
        this.ratio = ratio;
        this.eggGroups = eggGroups != null ? eggGroups : List.of();
        this.species = species;
        this.height = height;
        this.weight = weight;
        this.description = description;
        this.moves = moves != null ? moves : List.of();
    }

    public Pokemon(int id, String name) {
        this.id = id;
        this.name = name;
        this.types = List.of("Normal");
        this.ability = "Unknown";
        this.exp = 0;
        this.stats = new Stat(0,0,0,0,0,0);
        this.evolutions = List.of();
        this.ratio = new Ratio(50.0, 50.0);
        this.eggGroups = List.of();
        this.species = "Unknown";
        this.height = 0.0;
        this.weight = 0.0;
        this.description = "No description";
        this.moves = List.of();
    }
}
