package src.rules;

import src.board.Board;
import src.player.Player;

import java.util.List;

public class LastManStandingRule implements WinningRule {
    private List<Player> players;

    public LastManStandingRule(List<Player> players) {
        this.players = players;
    }

    @Override
    public boolean checkWinCondition(Player player, Board board) {
        long activePlayers = players.stream().filter(p -> p.getPosition() < board.getSize()).count();
        return activePlayers == 1;
    }
}
