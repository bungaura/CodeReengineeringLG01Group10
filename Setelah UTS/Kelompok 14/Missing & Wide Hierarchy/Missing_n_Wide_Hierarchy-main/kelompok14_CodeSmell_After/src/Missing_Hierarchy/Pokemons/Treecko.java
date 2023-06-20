package Missing_Hierarchy.Pokemons;

import java.util.ArrayList;

import Missing_Hierarchy.Move;
import Missing_Hierarchy.Types.Grass;

public class Treecko extends Pokemon {
    public Treecko(String name) {
        super(name, 40, new Grass(), 70);
    }

    public static ArrayList<Move> learnableMoves() {
        ArrayList<Move> learnableMoves = new ArrayList<>();
        learnableMoves.add(new Move("Water Gun", 20, 100, "grass"));
        return learnableMoves;
    }
}