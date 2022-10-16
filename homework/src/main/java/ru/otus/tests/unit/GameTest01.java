package ru.otus.tests.unit;

import ru.otus.assertions.Assertions;
import ru.otus.game.*;

public class GameTest01 {
    public void testGameForCorrectPlayerName() {

        String scenario = "Тест с проверкой на корректность имени игрока";
        try {

            var dice = new DiceImpl();
            var winnerPrinter = new GameWinnerConsolePrinter();
            var game = new Game(dice, winnerPrinter);
            var playerOne = new Player("123");
            var playerTwo = new Player("22213");

            Assertions.assertStringNotNumeric(playerOne.getName());

            game.playGame(playerOne, playerTwo);

            System.out.printf("\"%s\" passed %n", scenario);
        } catch (Throwable e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }
}
