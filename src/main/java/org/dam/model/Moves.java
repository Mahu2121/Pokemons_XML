package org.dam.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Moves {

    @JsonProperty("move")
    private final List<Move> move;

    @JsonCreator
    public Moves(@JsonProperty("move") List<Move> move) {
        this.move = move != null ? move : List.of();
    }

    public List<Move> getMove() {
        return move;
    }

    @Override
    public String toString() {
        return "Move [move=" + move + "]";
    }

}
