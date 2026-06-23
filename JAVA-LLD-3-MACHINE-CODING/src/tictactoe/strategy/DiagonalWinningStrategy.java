package tictactoe.strategy;

import tictactoe.model.Board;
import tictactoe.model.Move;

import java.util.HashMap;
import java.util.Map;

public class DiagonalWinningStrategy implements WinningStrategy{
    private Map<String,Integer> leftDiagonal = new HashMap<>();
    private Map<String,Integer> rightDiagonal = new HashMap<>();

    @Override
    public boolean checkWinner(Board board, Move move) {
        int row = move.getCell().getRow();
        int col = move.getCell().getRow();
        String symbol = move.getPlayer().getSymbol();
        //Check left Diagonal
        if(row == col){
            leftDiagonal.putIfAbsent(symbol,0);
            leftDiagonal.put(symbol, leftDiagonal.get(symbol) + 1);

            if(leftDiagonal.get(symbol).equals(board.getSize())){
                return true;
            }
        }

        //Check right Diagonal
        if(row + col == board.getSize()-1){
            rightDiagonal.putIfAbsent(symbol,0);
            rightDiagonal.put(symbol, rightDiagonal.get(symbol) + 1);

            if(rightDiagonal.get(symbol).equals(board.getSize())){
                return true;
            }
        }
        return false;
    }

    @Override
    public void handleUndo(Board board, Move move) {

    }
}
