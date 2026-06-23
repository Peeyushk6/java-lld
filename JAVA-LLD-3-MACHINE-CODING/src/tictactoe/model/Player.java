package tictactoe.model;

import tictactoe.Exception.NoValidCellFoundException;
import tictactoe.factory.BotDifficultyFactory;
import tictactoe.strategy.BotPlayingStrategy;

import java.util.Scanner;

public class Player {
    private String symbol;
    private String name;
    private Long id;
    private PlayerType playerType;
    private Scanner scanner;
    private DifficultyLevel difficultyLevel;

    public Player(Long id, String name, String symbol, PlayerType type){
        this.id = id;
        this.playerType = type;
        this.name = name;
        this.symbol = symbol;
        this.scanner = new Scanner(System.in);
        this.difficultyLevel = DifficultyLevel.EASY;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public PlayerType getPlayerType() {
        return playerType;
    }

    public void setPlayerType(PlayerType playerType) {
        this.playerType = playerType;
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    public DifficultyLevel getDifficultyLevel() {
        return difficultyLevel;
    }

    public void setDifficultyLevel(DifficultyLevel difficultyLevel) {
        this.difficultyLevel = difficultyLevel;
    }

    /*
     * For making the move we need to take Input from the player.
     * @param board
     * @return
     * @throws NoValidCellFoundException
     */

    public Move getInputAndMakeMove(Board board) throws NoValidCellFoundException{
//        /*
//         *
//         * S1. check for playerType
//         *    - get the difficulty level and according to that, get object
//         *        of the strategy (EASY/MEDIUM/HARD) and fetch the input.
//         *
//         * S2. If the player type is HUMAN
//         *    - Take R and C input.
//         *
//         */
//
        if(playerType.equals(PlayerType.BOT)){
            BotPlayingStrategy botPlayingStrategy = BotDifficultyFactory.getBotPlayingStrategyByDifficultyLevel(difficultyLevel);
            return botPlayingStrategy.makeMove(board,this);
        }
        System.out.println("Please input the row number");
        int row = scanner.nextInt();
        System.out.println("Please input the col number");
        int col = scanner.nextInt();

        return new Move(new Cell(row,col),this);
    }

}
