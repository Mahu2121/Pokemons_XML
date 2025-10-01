package org.dam.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Stat {

    @JsonProperty("hp")
    private final int hp;

    @JsonProperty("atk")
    private final int atk;

    @JsonProperty("def")
    private final int def;

    @JsonProperty("spd")
    private final int spd;

    @JsonProperty("sat")
    private final int sat;

    @JsonProperty("sdf")
    private final int sdf;


    @JsonCreator
    public Stat(
            @JsonProperty("hp") int hp,
            @JsonProperty("atk") int atk,
            @JsonProperty("def") int def,
            @JsonProperty("spd") int spd,
            @JsonProperty("sat") int sat,
            @JsonProperty("sdf") int sdf
    ) {
        this.hp = hp;
        this.atk = atk;
        this.def = def;
        this.spd = spd;
        this.sat = sat;
        this.sdf = sdf;
    }

    public Stat() {
        this.hp = 0;
        this.atk = 0;
        this.def = 0;
        this.spd = 0;
        this.sat = 0;
        this.sdf = 0;
    }


    public int getHp() {
        return hp;
    }

    public int getAtk() {
        return atk;
    }

    public int getDef() {
        return def;
    }

    public int getSpd() {
        return spd;
    }

    public int getSat() {
        return sat;
    }

    public int getSdf() {
        return sdf;
    }
}