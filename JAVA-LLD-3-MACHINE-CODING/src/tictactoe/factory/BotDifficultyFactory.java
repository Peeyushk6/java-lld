package tictactoe.factory;

import tictactoe.model.DifficultyLevel;
import tictactoe.strategy.BotPlayingStrategy;
import tictactoe.strategy.EasyBotPlayingStrategy;
import tictactoe.strategy.HardBotPlayingStrategy;
import tictactoe.strategy.MediumBotPlayingStrategy;

public class BotDifficultyFactory {
    public static BotPlayingStrategy getBotPlayingStrategyByDifficultyLevel(DifficultyLevel difficultyLevel){
        return switch (difficultyLevel) {
            case MEDIUM -> new MediumBotPlayingStrategy();
            case HARD -> new HardBotPlayingStrategy();
            default -> new EasyBotPlayingStrategy();
        };
    }
}