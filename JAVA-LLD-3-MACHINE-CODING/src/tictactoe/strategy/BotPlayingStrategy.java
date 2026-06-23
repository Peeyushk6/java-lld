package tictactoe.strategy;

import tictactoe.Exception.NoValidCellFoundException;
import tictactoe.model.Board;
import tictactoe.model.Move;
import tictactoe.model.Player;

public interface BotPlayingStrategy {
    Move makeMove(Board p, Player player) throws NoValidCellFoundException;
}
