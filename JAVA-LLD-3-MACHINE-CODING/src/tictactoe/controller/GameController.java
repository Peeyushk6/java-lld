package tictactoe.controller;

import tictactoe.Exception.InvalidMoveException;
import tictactoe.Exception.NoValidCellFoundException;
import tictactoe.model.Game;
import tictactoe.model.GameState;
import tictactoe.model.Player;

import java.util.List;

public class GameController {
    public Game startGame(int dimension, List<Player> players){
        return new Game(dimension, players);
    }

    public GameState checkGameState(Game game){
        return game.getGameState();
    }

    public void makeMove(Game game) throws NoValidCellFoundException, InvalidMoveException{
        game.makeMove();
    }

    public void undo(Game game) throws InvalidMoveException{
        game.undo();
    }

    public void displayBoard(Game game){
        game.printBoard();
    }
    /**
     *
     * | - | - | - |
     * | - | X | - |
     * | - | - | O |
     *
     */

    public Player getWinner(Game game){
        return game.getWinner();
    }
}

