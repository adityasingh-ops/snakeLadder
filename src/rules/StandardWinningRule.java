package src.rules;

import src.board.Board;
import src.player.Player;

public class StandardWinningRule implements WinningRule {
    @Override
    public boolean checkWinCondition(Player player, Board board) {
        return player.getPosition() >= board.getSize();
    }
}
