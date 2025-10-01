package org.dam.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Move {

    @JsonProperty("type")
    private final String type;

    @JsonProperty("name")
    private final String name;

    @JsonProperty("machine")
    private final String machine;

    @JsonProperty("level")
    private final Integer level;


    @JsonCreator
    public Move(
            @JsonProperty("type") String type,
            @JsonProperty("name") String name,
            @JsonProperty("machine") String machine,
            @JsonProperty("level") Integer level
    ) {
        this.type = type;
        this.name = name;
        this.machine = machine;
        this.level = level;
    }


    public Move(String type, String name) {
        this.type = type;
        this.name = name;
        this.machine = null;
        this.level = null;
    }


    public String getType() {
        return type;
    }
    public String getName() {
        return name;
    }
    public String getMachine() {
        return machine;
    }
    public Integer getLevel() {
        return level;
    }
}