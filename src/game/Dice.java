package src.game;

// Singleton Dice
public class Dice {
    private static Dice instance;
    private int sides;

    private Dice(int sides) {
        this.sides = sides;
    }

    public static Dice getInstance(int sides) {
        if (instance == null) {
            instance = new Dice(sides);
        }
        return instance;
    }

    public int roll() {
        return 1 + (int) (Math.random() * sides);
    }
}
