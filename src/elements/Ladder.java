package src.elements;

public class Ladder implements BoardElement {
    private int position;
    private int endPosition;

    public Ladder(int position, int endPosition) {
        this.position = position;
        this.endPosition = endPosition;
    }

    @Override
    public int getPosition() {
        return position;
    }

    public int getEndPosition() {
        return endPosition;
    }
}