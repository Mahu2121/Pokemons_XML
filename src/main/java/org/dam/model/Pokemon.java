package org.dam.model;

import java.util.List;

public class Pokemon {

    private int id;
    private String name;
    private List<String> types;
    private String ability;
    private int exp;
    private int hp;
    private int atk;
    private int def;
    private int spd;
    private int sat;
    private int sdf;

    public Pokemon(int id, String name, List<String> types, String ability, int exp, int hp, int atk, int def, int spd, int sat, int sdf) {
        this.id = id;
        this.name = name;
        this.types = types;
        this.ability = ability;
        this.exp = exp;
        this.hp = hp;
        this.atk = atk;
        this.def = def;
        this.spd = spd;
        this.sat = sat;
        this.sdf = sdf;
    }




}
