package org.dam.model;

import java.util.List;

public class Move {

    private String type;
    private String name;
    private String machine;
    private Integer level;
    private List<Move> moves;

    public Move(String type, String name, String machine, Integer level, List<Move> moves) {
        this.type = type;
        this.name = name;
        this.machine = machine;
        this.level = level;
        this.moves = moves;
    }



}
