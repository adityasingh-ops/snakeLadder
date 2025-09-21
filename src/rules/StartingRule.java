package src.rules;

import src.board.Board;
import src.player.Player;

import java.util.List;

public interface StartingRule extends Rule {
    boolean canStart(List<Player> players, Board board);
}
