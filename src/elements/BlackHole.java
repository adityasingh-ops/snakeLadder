package src.elements;

public class BlackHole implements BoardElement {
    private int position;

    public BlackHole(int position) {
        this.position = position;
    }

    @Override
    public int getPosition() {
        return position;
    }
}
