package artificial_Intelligence.bot_saves_princess;

import java.util.List;

class Character {
    private final String characterType;
    private List<String> grid;
    private Integer characterXPosition;
    private Integer characterYPosition;

    public Character(List<String> grid, String characterType) {
        this.grid = grid;
        this.characterType = characterType;
    }

    public static boolean areCharactersNotOnTheSamePosition(Character firstCharacter, Character secondCharacter) {
        return firstCharacter.getCharacterYPosition().equals(secondCharacter.getCharacterYPosition()) &&
                firstCharacter.getCharacterXPosition().equals(secondCharacter.getCharacterXPosition());
    }

    public boolean areCharactersOnTheSamePosition(Character secondCharacter) {
        return isCharacterOnTheSameHorizontalLineAsSecond(secondCharacter) && isCharacterOnTheSameVerticalLineAsSecond(secondCharacter);
    }

    public boolean areCharactersNotOnTheSamePosition(Character secondCharacter) {
        return !areCharactersOnTheSamePosition(secondCharacter);
    }

    public boolean isCharacterUpperThanSecond(Character secondCharacter) {
        return this.getCharacterYPosition() < secondCharacter.getCharacterYPosition();
    }

    public boolean isCharacterLowerThanSecond(Character secondCharacter) {
        return this.getCharacterYPosition() > secondCharacter.getCharacterYPosition();
    }

    public boolean isCharacterRighterThanSecond(Character secondCharacter) {
        return this.getCharacterXPosition() > secondCharacter.getCharacterXPosition();
    }

    public boolean isCharacterLefterThanSecond(Character secondCharacter) {
        return this.getCharacterXPosition() < secondCharacter.getCharacterXPosition();
    }

    public boolean isCharacterOnTheSameVerticalLineAsSecond(Character secondCharacter) {
        return this.getCharacterYPosition() == secondCharacter.getCharacterYPosition();
    }

    public boolean isCharacterOnTheSameHorizontalLineAsSecond(Character secondCharacter) {
        return this.getCharacterXPosition() == secondCharacter.getCharacterXPosition();
    }

    public boolean isCharacterLowerOrOnTheSameLine(Character secondCharacter) {
        return this.isCharacterLowerThanSecond(secondCharacter) || this.isCharacterOnTheSameVerticalLineAsSecond(secondCharacter);
    }

    public boolean isCharacterHasReachedWallOfGrid() {
        return characterXPosition == grid.size() || characterYPosition == grid.size();
    }

    public boolean isCharacterHasReachedMaxXPosition() {
        return this.characterXPosition == grid.size();
    }

    public boolean isCharacterHasReachedMaxYPosition() {
        return this.characterYPosition == grid.size();
    }


    public Integer getCharacterXPosition() {
        return characterXPosition;
    }

    public Integer getCharacterYPosition() {
        return characterYPosition;
    }

    public Character getCharacterPosition() {
        characterXPosition = 0;
        characterYPosition = 0;

        for (String line : grid
                ) {
            if (line.contains(characterType)) {
                characterXPosition = line.indexOf(characterType);
                break;
            }
            characterYPosition++;
        }
        return this;
    }

    public void moveUp() {
        characterYPosition--;
    }

    public void moveDown() {
        characterYPosition++;
    }

    public void moveLeft() {
        characterXPosition--;
    }

    public void moveRight() {
        characterXPosition++;
    }

}