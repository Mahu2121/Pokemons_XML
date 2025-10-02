package org.dam.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Evolution {

    @JsonProperty("@id")
    private final int id;

    @JsonProperty("name")
    private final String name;

    @JsonProperty("lvl")
    private final Integer level;

    @JsonCreator
    public Evolution(
            @JsonProperty("@id") int id,
            @JsonProperty("name") String name,
            @JsonProperty("lvl") Integer level
    ) {
        this.id = id;
        this.name = name;
        this.level = level;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getLevel() {
        return level;
    }

    @Override
    public String toString() {
        return "Evolution [id=" + id + ", name=" + name + ", level=" + level + "]";
    }
}