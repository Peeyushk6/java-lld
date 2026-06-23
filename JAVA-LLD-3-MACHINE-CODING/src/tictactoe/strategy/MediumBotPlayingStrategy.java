package tictactoe.strategy;

import tictactoe.Exception.NoValidCellFoundException;
import tictactoe.model.Board;
import tictactoe.model.Move;
import tictactoe.model.Player;

public class MediumBotPlayingStrategy implements BotPlayingStrategy{
    @Override
    public Move makeMove(Board p, Player player) throws NoValidCellFoundException {
        throw new UnsupportedOperationException("Unimplemented method makeMove");
    }
}
