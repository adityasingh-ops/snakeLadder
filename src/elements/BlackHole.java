package src.elements;

import src.board.Coordinate;

public class BlackHole extends BoardElement {
    public BlackHole(Coordinate start, Coordinate end) {
        super(start, end);
    }

    @Override
    public int interact(int currentPosition) {
        System.out.println("Oh no! Black Hole! Back to start...");
        return end.getPosition();
    }
}
