package src.player;

public class HumanPlayer extends Player {
    public HumanPlayer(String name) {
        super(name);
    }

    @Override
    public void play() {
        System.out.println(name + " is playing (Human).");
    }
}
