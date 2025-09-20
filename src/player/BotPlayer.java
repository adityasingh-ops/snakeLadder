package src.player;
public class BotPlayer implements Player {
    private String name;
    private int currentPosition;

    public BotPlayer(String name) {
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