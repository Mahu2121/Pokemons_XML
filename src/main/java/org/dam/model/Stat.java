package org.dam.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Stat {

    @JsonProperty("HP")
    private final int hp;

    @JsonProperty("ATK")
    private final int atk;

    @JsonProperty("DEF")
    private final int def;

    @JsonProperty("SPD")
    private final int spd;

    @JsonProperty("SAT")
    private final int sat;

    @JsonProperty("SDF")
    private final int sdf;

    @JsonCreator
    public Stat(
            @JsonProperty("HP") int hp,
            @JsonProperty("ATK") int atk,
            @JsonProperty("DEF") int def,
            @JsonProperty("SPD") int spd,
            @JsonProperty("SAT") int sat,
            @JsonProperty("SDF") int sdf
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

    @Override
    public String toString() {
        return "Stat [hp=" + hp + ", atk=" + atk + ", def=" + def + ", spd=" + spd + ", sat=" + sat + ", sdf=" + sdf + "]";
    }
}