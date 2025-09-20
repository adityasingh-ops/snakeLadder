package src.game;
public class Dice {
    private static final int MAX = 6;
    private static final int MIN = 1;
    private volatile static Dice instance = null;

    private static Dice getInstance() {
        if (instance == null) {
            synchronized (Dice.class) {
                if (instance == null) {
                    return new Dice();
                }
            }
        }
        return instance;
    }
    
    private Dice() {}

    public static int roll() {
        return (int)(Math.random() * (MAX - MIN + 1)) + MIN;
    }
}