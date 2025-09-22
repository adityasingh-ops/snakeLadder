package src;

import src.board.Board;
import src.board.Coordinate;
import src.elements.Ladder;
import src.elements.Snake;
import src.elements.BlackHole;
import src.factory.PlayerFactory;
import src.game.Dice;
import src.game.Game;
import src.game.GameBuilder;
import src.player.Player;
import src.strategy.AggressiveStrategy;
import src.strategy.DefensiveStrategy;
import src.rules.ClassicMovementRule;
import src.rules.StandardWinningRule;
import src.rules.StartingRule;
import src.rules.WinningRule;
import src.rules.MovementRule;

import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {
        // Create Board
        Board board = new Board(100);

        // Add Snakes
        board.addElement(new Snake(new Coordinate(14), new Coordinate(7)));
        board.addElement(new Snake(new Coordinate(98), new Coordinate(79)));

        // Add Ladders
        board.addElement(new Ladder(new Coordinate(3), new Coordinate(22)));
        board.addElement(new Ladder(new Coordinate(8), new Coordinate(30)));

        // Add BlackHole
        board.addElement(new BlackHole(new Coordinate(50), new Coordinate(1)));

        // Create Players using Factory
        Player p1 = PlayerFactory.createHumanPlayer("Alice");
        Player p2 = PlayerFactory.createBotPlayer("BotX", new AggressiveStrategy());
        Player p3 = PlayerFactory.createBotPlayer("BotY", new DefensiveStrategy());

        List<Player> players = Arrays.asList(p1, p2, p3);

        // Create Dice (Singleton, 6 sides)
        Dice dice = Dice.getInstance(6);

        // Rules
        StartingRule startingRule = (pl, b) -> true; 
        WinningRule winningRule = new StandardWinningRule();
        MovementRule movementRule = new ClassicMovementRule();

        // Build Game using Builder
        Game game = new GameBuilder()
                .setBoard(board)
                .addPlayer(p1)
                .addPlayer(p2)
                .addPlayer(p3)
                .setDice(dice)
                .setStartingRule(startingRule)
                .setWinningRule(winningRule)
                .setMovementRule(movementRule)
                .build();

        // Start Game
        game.start();
    }
}
