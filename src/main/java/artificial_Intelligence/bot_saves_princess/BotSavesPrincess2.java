package artificial_Intelligence.bot_saves_princess;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class BotSavesPrincess2 {

    public static final String BOT_CHARACTER = "m";
    public static final String PRINCESS_CHARACTER = "p";
    public static final String SPLIT_BY_WHITESPACE_REGEX = "\\s+";

    public static Integer sizeOfGrid;
    public static BufferedReader bufferedReader;

    public static void main(String[] args) throws IOException {
        playBotSavesPrincess();
    }

    public static void playBotSavesPrincess() throws IOException {
        bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        List<String> grid = initializeGrid();

        Character bot = new Character(grid, BOT_CHARACTER).getCharacterPosition();
        Character princess = new Character(grid, PRINCESS_CHARACTER).getCharacterPosition();

        while (bot.areCharactersNotOnTheSamePosition(princess)) {

            if (bot.isCharacterUpperThanSecond(princess)) {
                System.out.println("DOWN");
                bot.moveDown();
            } else if (bot.isCharacterLowerThanSecond(princess)) {
                System.out.println("UP");
                bot.moveUp();
            }

            if (bot.isCharacterLefterThanSecond(princess)) {
                System.out.println("RIGHT");
                bot.moveRight();
            } else if (bot.isCharacterRighterThanSecond(princess)) {
                System.out.println("LEFT");
                bot.moveLeft();
            }

        }

    }

    private static List<String> initializeGrid() throws IOException {

        setSizeOfGrid(Integer.parseInt(bufferedReader.readLine()));

        String[] arrayOfBotInputCoordinatesYX = bufferedReader.readLine().split(SPLIT_BY_WHITESPACE_REGEX);
        //Integer botYPositionFromInput = Integer.valueOf(arrayOfBotInputCoordinatesYX[0]);
        //Integer botXPositionFromInput = Integer.valueOf(arrayOfBotInputCoordinatesYX[1]);

        List<String> grid = new ArrayList<>();

        for (int i = 0; i < sizeOfGrid; i++) {
            grid.add(bufferedReader.readLine());
        }

        return grid;
    }

    public static void setSizeOfGrid(Integer sizeOfGrid) {
        BotSavesPrincess2.sizeOfGrid = sizeOfGrid;
    }

}
