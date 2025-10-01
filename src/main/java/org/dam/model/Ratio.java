package org.dam.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Ratio {

    @JsonProperty("male")
    private final double male;

    @JsonProperty("female")
    private final double female;


    @JsonCreator
    public Ratio(
            @JsonProperty("male") double male,
            @JsonProperty("female") double female
    ) {
        this.male = male;
        this.female = female;
    }


    public Ratio() {
        this.male = 50.0;
        this.female = 50.0;
    }

    public double getMale() {
        return male;
    }

    public double getFemale() {
        return female;
    }
}
