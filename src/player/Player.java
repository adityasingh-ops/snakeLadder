package src.player;

public abstract class Player {
    protected String name;
    protected int position = 0;

    public Player(String name) {
        this.name = name;
    }

    public abstract void play();

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
}
