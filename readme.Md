classDiagram
    class Game {
        -Board board
        -List<Player> players
        -Dice dice
        -StartingRule startingRule
        -WinningRule winningRule
        -MovementRule movementRule
        +start()
    }

    class GameBuilder {
        +setBoard(Board) GameBuilder
        +addPlayer(Player) GameBuilder
        +setDice(Dice) GameBuilder
        +setStartingRule(StartingRule) GameBuilder
        +setWinningRule(WinningRule) GameBuilder
        +setMovementRule(MovementRule) GameBuilder
        +build() Game
    }

    class Dice {
        -static Dice instance
        -int sides
        +getInstance(int): Dice
        +roll() int
    }

    class Board {
        -int size
        -Map<int,BoardElement> elements
        +addElement(BoardElement)
        +getElementAt(int): BoardElement
    }

    class Coordinate {
        -int position
        +getPosition() int
    }

    class Player {
        -String name
        -int position
        +play()
        +getName()
        +getPosition()
        +setPosition(int)
    }

    Player <|-- HumanPlayer
    Player <|-- BotPlayer

    class Strategy {
        <<interface>>
        +execute(Player)
    }

    Strategy <|.. AggressiveStrategy
    Strategy <|.. DefensiveStrategy

    class BoardElement {
        <<abstract>>
        -Coordinate start
        -Coordinate end
        +interact(int): int
    }

    BoardElement <|-- Snake
    BoardElement <|-- Ladder
    BoardElement <|-- BlackHole

    class Rule {
        <<interface>>
    }

    class StartingRule {
        <<interface>>
        +canStart(List<Player>, Board) boolean
    }

    class WinningRule {
        <<interface>>
        +checkWinCondition(Player, Board) boolean
    }

    class MovementRule {
        <<interface>>
        +move(Player, int, Board)
    }

    WinningRule <|.. StandardWinningRule
    WinningRule <|.. LastManStandingRule
    MovementRule <|.. ClassicMovementRule

    GameBuilder --> Game
    Game --> Board
    Game --> Dice
    Game --> Player
    Game --> Rule


this is the class diagram i used