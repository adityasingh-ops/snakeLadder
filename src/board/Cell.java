package src.board;
import src.elements.BoardElement;

public class Cell {
    private int position;
    private BoardElement element;

    public Cell(int position) {
        this.position = position;
        this.element = null;
    }

    public int getPosition() {
        return position;
    }

    public BoardElement getElement() {
        return element;
    }

    public void setElement(BoardElement element) {
        this.element = element;
    }
}