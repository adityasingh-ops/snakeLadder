package src.strategy;

import src.player.Player;

public class DefensiveStrategy implements Strategy {
    @Override
    public void execute(Player player) {
        System.out.println(player.getName() + " plays defensively!");
    }
}
