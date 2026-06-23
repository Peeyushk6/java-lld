package tictactoe.strategy;

import tictactoe.model.Board;
import tictactoe.model.Move;

import java.util.HashMap;
import java.util.Map;

public class RowWinningStrategyImpl implements WinningStrategy{
    /**
     *
     * Creating a hashmap...
     *
     * For every row in my system, I will have a hashmap.
     *
     * <3: <>>
     *
     *
     *
     *
     * If any of the symbol in hashmp has a count == size of row >
     * can I say that player has won the game...?
     */

    private Map<Integer, HashMap<String,Integer>> counts = new HashMap<>();

    @Override
    public boolean checkWinner(Board board, Move move) {
        int rowNo = move.getCell().getRow();
        String symbol = move.getCell().getPlayer().getSymbol();

        if(!counts.containsKey(rowNo)){
            counts.put(rowNo,new HashMap<>());
        }

        Map<String,Integer> internalMap = counts.get(rowNo);
        if(!internalMap.containsKey((symbol))){
            internalMap.put(symbol,0);
        }

        internalMap.put(symbol, internalMap.get(symbol)+1);

        return internalMap.get(symbol).equals(board.getSize());
    }

    /**
     *
     * Reducing the count for that specific row whenever UNDO is done.
     */
    @Override
    public void handleUndo(Board board, Move move) {
        int rowNo = move.getCell().getRow();
        String symbol = move.getCell().getPlayer().getSymbol();
        Map<String,Integer> internalMap = counts.get(rowNo);
        System.out.println("Internal Map: "+ internalMap);

        internalMap.put(symbol, internalMap.get(symbol)-1);
    }
}
