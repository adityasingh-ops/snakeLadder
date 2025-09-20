package src.player;
public class HumanPlayer implements Player {
    private String name;
    private int currentPosition;

    public HumanPlayer(String name) {
        this.name = name;
        this.currentPosition = 0; 
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getCurrentPosition() {
        return currentPosition;
    }

    @Override
    public void setCurrentPosition(int position) {
        this.currentPosition = position;
    }
}