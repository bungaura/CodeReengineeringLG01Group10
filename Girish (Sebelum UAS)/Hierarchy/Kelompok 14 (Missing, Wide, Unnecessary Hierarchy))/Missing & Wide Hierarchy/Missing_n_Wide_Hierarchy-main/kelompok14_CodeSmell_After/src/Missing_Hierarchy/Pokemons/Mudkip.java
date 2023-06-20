package Missing_Hierarchy.Pokemons;

import java.util.ArrayList;

import Missing_Hierarchy.Move;
import Missing_Hierarchy.Types.Water;

public class Mudkip extends Pokemon {
    public Mudkip(String name) {
        super(name, 40, new Water(), 70);
    }

    public static ArrayList<Move> learnableMoves() {
        ArrayList<Move> learnableMoves = new ArrayList<>();
        learnableMoves.add(new Move("Absorb", 20, 100, "water"));
        return learnableMoves;
    }
}