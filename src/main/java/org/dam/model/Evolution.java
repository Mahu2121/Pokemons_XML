package org.dam.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Evolution {

    @JsonProperty("id")
    private final int id;

    @JsonProperty("name")
    private final String name;

    @JsonProperty("level")
    private final Integer level;

    @JsonCreator
    public Evolution(
            @JsonProperty("id") int id,
            @JsonProperty("name") String name,
            @JsonProperty("level") Integer level
    ) {
        this.id = id;
        this.name = name;
        this.level = level;
    }


    public Evolution(int id, String name) {
        this.id = id;
        this.name = name;
        this.level = null;
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
}
