package src.rules;
interface Rule{
    boolean isValidMove(int currentPosition, int diceValue);
    int getNewPosition(int currentPosition, int diceValue);
    boolean isWinningMove(int currentPosition);
    int getWinningPosition();
    boolean isLadder(int position);
    boolean isSnake(int position);
    int getLadderTop(int position);
    int getSnakeTail(int position);     
}