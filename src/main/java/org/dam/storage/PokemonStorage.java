package org.dam.storage;

import java.io.File;
import java.util.List;

public interface PokemonStorage {
    List<Pokemon>readFromFile(File file);
    void writeFromFile(File file, List<Pokemon> pokemons)
}
