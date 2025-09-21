package src.strategy;

import src.player.Player;

public class AggressiveStrategy implements Strategy {
    @Override
    public void execute(Player player) {
        System.out.println(player.getName() + " plays aggressively!");
    }
}
