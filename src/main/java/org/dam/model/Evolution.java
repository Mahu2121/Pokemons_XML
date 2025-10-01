package org.dam.model;

import java.util.List;

public class Evolution {

    private int id;
    private String name;
    private Integer level;
    private List<Evolution> evolutions;
    private double maleRatio;
    private double femaleRatio;
    private List<String> eggGroups;

    public Evolution(int id, String name, Integer level, List<Evolution> evolutions, double maleRatio, double femaleRatio, List<String> eggGroups) {
        this.id = id;
        this.name = name;
        this.level = level;
        this.evolutions = evolutions;
        this.maleRatio = maleRatio;
        this.femaleRatio = femaleRatio;
        this.eggGroups = eggGroups;
    }


}
