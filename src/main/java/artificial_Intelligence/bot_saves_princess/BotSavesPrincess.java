package artificial_Intelligence.bot_saves_princess;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class BotSavesPrincess {

    public static final String BOT_CHARACTER = "m";
    public static final String PRINCESS_CHARACTER = "p";

    public static Integer sizeOfGrid;

    public static void main(String[] args) throws IOException {
        playBotSavesPrincess();
    }

    public static void playBotSavesPrincess() throws IOException {
        List<String> grid = initializeGrid();

        Character bot = new Character(grid, BOT_CHARACTER).getCharacterPosition();
        Integer botYPosition = bot.getCharacterXPosition();
        Integer botXPosition = bot.getCharacterYPosition();

        Character princess = new Character(grid, PRINCESS_CHARACTER).getCharacterPosition();
        Integer princessYPosition = princess.getCharacterYPosition();
        Integer princessXPosition = princess.getCharacterXPosition();

        while (!botYPosition.equals(princessYPosition) && !botXPosition.equals(princessXPosition)) {
            if (botYPosition <= princessYPosition && botYPosition <= sizeOfGrid) {
                System.out.println("DOWN");
                botYPosition++;
            } else {
                System.out.println("UP");
                botYPosition--;
            }

            if (botXPosition <= princessXPosition && botXPosition <= sizeOfGrid) {
                System.out.println("RIGHT");
                botXPosition--;
            } else {
                System.out.println("LEFT");
                botXPosition++;
            }

        }

    }

    private static List<String> initializeGrid() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        setSizeOfGrid(Integer.parseInt(bufferedReader.readLine()));

        List<String> grid = new ArrayList<>();

        for (int i = 0; i < sizeOfGrid; i++) {
            grid.add(bufferedReader.readLine());
        }

        return grid;
    }

    public static void setSizeOfGrid(Integer sizeOfGrid) {
        BotSavesPrincess.sizeOfGrid = sizeOfGrid;
    }

}
