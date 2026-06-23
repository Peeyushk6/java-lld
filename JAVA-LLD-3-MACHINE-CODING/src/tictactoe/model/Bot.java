package tictactoe.model;

public class Bot extends Player{
    private DifficultyLevel botDifficultyLevel;

    public Bot(Long id , String name, String symbol, PlayerType playerType, DifficultyLevel difficultyLevel){
        super(id, name, symbol, playerType);
        this.botDifficultyLevel = difficultyLevel;
    }

    @Override
    public DifficultyLevel getDifficultyLevel() {
        return botDifficultyLevel;
    }

    public void setBotDifficultyLevel(DifficultyLevel botDifficultyLevel){
        this.botDifficultyLevel = botDifficultyLevel;
    }
}
