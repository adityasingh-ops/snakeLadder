package src.game;

import src.board.Board;
import src.player.Player;
import src.rules.MovementRule;
import src.rules.StartingRule;
import src.rules.WinningRule;

import java.util.List;

public class Game {
    private Board board;
    private List<Player> players;
    private Dice dice;
    private StartingRule startingRule;
    private WinningRule winningRule;
    private MovementRule movementRule;

    // Constructor is private (only builder can create Game)
    Game(Board board, List<Player> players, Dice dice,
            StartingRule startingRule, WinningRule winningRule, MovementRule movementRule) {
        this.board = board;
        this.players = players;
        this.dice = dice;
        this.startingRule = startingRule;
        this.winningRule = winningRule;
        this.movementRule = movementRule;
    }

    public void start() {
        System.out.println("Game Started!");
        boolean started = startingRule.canStart(players, board);
        if (!started) {
            System.out.println("Start conditions not met!");
            return;
        }

        boolean gameOver = false;
        while (!gameOver) {
            for (Player player : players) {
                int roll = dice.roll();
                System.out.println(player.getName() + " rolled: " + roll);
                movementRule.move(player, roll, board);

                if (winningRule.checkWinCondition(player, board)) {
                    System.out.println(player.getName() + " has won!");
                    gameOver = true;
                    break;
                }
            }
        }
    }
}
