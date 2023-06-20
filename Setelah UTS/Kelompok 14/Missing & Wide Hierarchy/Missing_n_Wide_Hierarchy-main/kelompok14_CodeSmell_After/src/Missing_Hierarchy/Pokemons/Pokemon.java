package Missing_Hierarchy.Pokemons;

import Missing_Hierarchy.Entity;
import Missing_Hierarchy.Move;
import Missing_Hierarchy.Types.Fire;
import Missing_Hierarchy.Types.Grass;
import Missing_Hierarchy.Types.Water;

import java.util.ArrayList;
import java.util.Random;

public abstract class Pokemon extends Entity {
    private int health;
    private Entity type;
    private int speed;
    private ArrayList<Move> moveSet;

    public Pokemon(String name, int health, Entity type, int speed) {
        super(name, "");
        this.health = health;
        this.type = type;
        this.speed = speed;
        this.moveSet = makeMoveSet();
    }

    public void attack(Entity target, Move move) {
        if (target instanceof Pokemon) {
            Pokemon targetPokemon = (Pokemon) target;
            Entity targetType = targetPokemon.getType();
            int damageMultiplier = 2;

            if (targetType.getWeakness().contains(move.getTypeName())) {
                damageMultiplier = 3;
                System.out.println(getName() + " used " + move.getName() + " its super effective");
            } else if (targetType.getEffectives().contains(move.getTypeName())) {
                damageMultiplier = 1;
                System.out.println(getName() + " used " + move.getName() + " its not effective");
            }

            targetPokemon.setHealth(targetPokemon.getHealth() - move.getDamage() * damageMultiplier);
        }
    }

    public static ArrayList<Move> makeMoveSet(ArrayList<Move> learnableMoves) {
        ArrayList<Move> newMoveSet = new ArrayList<>();

        Random random = new Random();
        for (int i = 0; i < 4; i++) {
            int randomIndex = random.nextInt(learnableMoves.size());
            Move move = learnableMoves.get(randomIndex);
            newMoveSet.add(move);
        }

        return newMoveSet;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public Entity getType() {
        return type;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public ArrayList<Move> getMoveSet() {
        return moveSet;
    }

    public void setMoveSet(ArrayList<Move> moveSet) {
        this.moveSet = moveSet;
    }
}