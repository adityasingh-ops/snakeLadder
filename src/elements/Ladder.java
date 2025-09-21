package src.elements;

import src.board.Coordinate;

public class Ladder extends BoardElement {
    public Ladder(Coordinate start, Coordinate end) {
        super(start, end);
    }

    @Override
    public int interact(int currentPosition) {
        System.out.println("Yay! Ladder! Going up...");
        return end.getPosition();
    }
}
