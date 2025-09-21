package src.player;

import src.strategy.Strategy;

public class BotPlayer extends Player {
    private Strategy strategy;

    public BotPlayer(String name, Strategy strategy) {
        super(name);
        this.strategy = strategy;
    }

    @Override
    public void play() {
        strategy.execute(this);
    }
}
