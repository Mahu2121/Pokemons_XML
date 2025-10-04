package org.dam.storage;

import org.dam.model.Pokedex;
import org.dam.model.Pokemon;

import java.io.File;
import java.util.List;

public interface PokemonStorage {
    List<Pokemon> readFromFile(File file);
}
