package ru.otus.tests.unit;

import ru.otus.assertions.Assertions;
import ru.otus.game.Game;
import ru.otus.game.Player;
import ru.otus.tests.unit.utils.GameWinnerPrinterForTest;
import ru.otus.tests.unit.utils.MyMockDiceImplRealisationForWinSecondTest;

public class GameTest05 {
    public void testGameForWinner() {

        String scenario = "Тест на проверку победителя по объекту";
        try {

            var diceForTest = new MyMockDiceImplRealisationForWinSecondTest();
            var winnerPrinter = new GameWinnerPrinterForTest();
            var game = new Game(diceForTest, winnerPrinter);
            var playerOne = new Player("Иван");
            var playerTwo = new Player("Артем");

            game.playGame(playerOne, playerTwo);
            var winner = winnerPrinter.getWinner();

            Assertions.assertEquals(playerOne, winner);

            System.out.printf("\"%s\" passed %n", scenario);
        } catch (Throwable e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }
}
