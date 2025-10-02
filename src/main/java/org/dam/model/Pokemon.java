package org.dam.model;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Pokemon {


    @JsonProperty("@id")
    private final int id;

    @JsonProperty("name")
    private final String name;

    @JsonProperty("type")
    @JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
    private final List<String> type;

    @JsonProperty("ability")
    private final String ability;

    @JsonProperty("exp")
    private final int exp;

    @JsonProperty("stats")
    private final Stat stats;

    @JsonProperty("evolutions")
    private final Evolutions evolutions;

    @JsonProperty("ratio")
    private final Ratio ratio;

    @JsonProperty("egg-group")
    @JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
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
    private final Moves moves;

    @JsonCreator
    public Pokemon(
            @JsonProperty("@id") int id,
            @JsonProperty("name") String name,
            @JsonProperty("type") List<String> type,
            @JsonProperty("ability") String ability,
            @JsonProperty("exp") int exp,
            @JsonProperty("stats") Stat stats,
            @JsonProperty("evolutions") Evolutions evolutions,
            @JsonProperty("ratio") Ratio ratio,
            @JsonProperty("egg-group") List<String> eggGroups,
            @JsonProperty("species") String species,
            @JsonProperty("height") double height,
            @JsonProperty("weight") double weight,
            @JsonProperty("description") String description,
            @JsonProperty("moves") Moves moves
    ) {
        this.id = id;
        this.name = name;
        this.type = type != null ? type : List.of();
        this.ability = ability;
        this.exp = exp;
        this.stats = stats;
        this.evolutions = evolutions ;
        this.ratio = ratio;
        this.eggGroups = eggGroups != null ? eggGroups : List.of();
        this.species = species;
        this.height = height;
        this.weight = weight;
        this.description = description;
        this.moves = moves != null ? moves : new Moves(List.of());
    }

    public Pokemon(int id, String name) {
        this.id = id;
        this.name = name;
        this.type = List.of("Unknown");
        this.ability = "Unknown";
        this.exp = 0;
        this.stats = new Stat(0,0,0,0,0,0);
        this.evolutions = new Evolutions(List.of());
        this.ratio = new Ratio(50.0, 50.0);
        this.eggGroups = List.of();
        this.species = "Unknown";
        this.height = 0.0;
        this.weight = 0.0;
        this.description = "No description";
        this.moves = new Moves(List.of());
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<String> getType() {
        return type;
    }

    public String getAbility() {
        return ability;
    }

    public int getExp() {
        return exp;
    }

    public Stat getStats() {
        return stats;
    }

    public Evolutions getEvolutions() {
        return evolutions;
    }

    public Ratio getRatio() {
        return ratio;
    }

    public List<String> getEggGroups() {
        return eggGroups;
    }

    public String getSpecies() {
        return species;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public String getDescription() {
        return description;
    }

    public Moves getMoves() {
        return moves;
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", type=" + getType() +
                ", ability='" + getAbility() + '\'' +
                ", exp=" + getExp() +
                ", stats=" + getStats() +
                ", evolutions=" + getEvolutions() +
                ", ratio=" + getRatio() +
                ", eggGroups=" + getEggGroups() +
                ", species='" + getSpecies() + '\'' +
                ", height=" + getHeight() +
                ", weight=" + getWeight() +
                ", description='" + getDescription() + '\'' +
                ", moves=" + getMoves() +
                '}';
    }


}
