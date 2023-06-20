package Missing_Hierarchy.Pokemons;

import java.util.ArrayList;

import Missing_Hierarchy.Move;
import Missing_Hierarchy.Types.Fire;

public class Charmander extends Pokemon {
    public Charmander(String name) {
        super(name, 39, new Fire(), 65);
    }

    public static ArrayList<Move> learnableMoves() {
        ArrayList<Move> learnableMoves = new ArrayList<>();
        learnableMoves.add(new Move("Ember", 40, 100, "fire"));
        return learnableMoves;
    }
}