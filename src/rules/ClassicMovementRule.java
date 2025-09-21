package src.rules;

import src.board.Board;
import src.elements.BoardElement;
import src.player.Player;

public class ClassicMovementRule implements MovementRule {
    @Override
    public void move(Player player, int diceRoll, Board board) {
        int newPos = player.getPosition() + diceRoll;
        if (newPos > board.getSize()) {
            newPos = board.getSize(); // clamp
        }

        BoardElement element = board.getElementAt(newPos);
        if (element != null) {
            newPos = element.interact(newPos);
        }

        player.setPosition(newPos);
        System.out.println(player.getName() + " moved to position " + newPos);
    }
}
