package src.rules;

import src.board.Board;
import src.player.Player;

public interface WinningRule extends Rule {
    boolean checkWinCondition(Player player, Board board);
}
