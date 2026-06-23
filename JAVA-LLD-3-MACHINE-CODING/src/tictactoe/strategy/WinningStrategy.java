package tictactoe.strategy;

import tictactoe.model.Board;
import tictactoe.model.Move;

public interface WinningStrategy {
    public boolean checkWinner(Board board, Move move);

    //handling undo's
    void handleUndo(Board board, Move move);
}
