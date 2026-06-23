package tictactoe.strategy;

import tictactoe.Exception.NoValidCellFoundException;
import tictactoe.model.*;

import java.util.List;

public class EasyBotPlayingStrategy implements BotPlayingStrategy{
    @Override
    public Move makeMove(Board board, Player player) throws NoValidCellFoundException {
        for(List<Cell> cell: board.getBoard()){
            for(Cell c : cell){
                if(c.getCellState().equals(CellState.EMPTY)){
                    return  new Move(c,player);
                }
            }
        }
        throw new NoValidCellFoundException("No Empty Cell Found !");
    }
}
