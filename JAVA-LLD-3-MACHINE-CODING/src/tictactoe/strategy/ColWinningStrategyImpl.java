package tictactoe.strategy;

import tictactoe.model.Board;
import tictactoe.model.Move;

import java.util.HashMap;
import java.util.Map;

public class ColWinningStrategyImpl implements WinningStrategy {

//    The hashMap to keep a Count.
    private Map<Integer, HashMap<String, Integer>> counts = new HashMap<>();
//    <RowNumber, Map<Symbol, Count>>
//    <0: <K,V>>
//    <1: {<X,1>,<0,2>}>

    @Override
    public boolean checkWinner(Board board, Move move) {
        int colNo = move.getCell().getCol();
        String symbol = move.getPlayer().getSymbol();

        if(!counts.containsKey(colNo)){
            counts.put(colNo,new HashMap<>());
        }

        Map<String,Integer> individualColMap = counts.get(colNo); // get from existing hashmap.

        if(!individualColMap.containsKey(symbol)){
            individualColMap.put(symbol,0);
        }

        individualColMap.put(symbol,individualColMap.get(symbol)+1); // incrementing

        //Win check.
        return individualColMap.get(symbol).equals(board.getSize());
    }

    /*
    *R1: {X:2,O:1}
    *R2: {X:1,O:0}
    */

    @Override
    public void handleUndo(Board board, Move move) {
        int colNo = move.getCell().getCol();
        String symbol = move.getCell().getPlayer().getSymbol();
        Map<String,Integer> internalMap = counts.get(colNo);

        internalMap.put(symbol, internalMap.get(symbol)-1);

    }
}
