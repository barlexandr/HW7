package ru.otus.tests.unit;

import ru.otus.assertions.Assertions;
import ru.otus.game.DiceImpl;
import ru.otus.game.Game;
import ru.otus.game.GameWinnerConsolePrinter;
import ru.otus.game.Player;

public class GameTest02 {
    public void testGameForNotNullPlayerName() {

        String scenario = "Тест на передачу null в качестве имени игрока";
        try {

            var dice = new DiceImpl();
            var winnerPrinter = new GameWinnerConsolePrinter();
            var game = new Game(dice, winnerPrinter);
            var playerOne = new Player(null);
            var playerTwo = new Player("22213");

            Assertions.assertNotNull(playerOne.getName());

            game.playGame(playerOne, playerTwo);

            System.out.printf("\"%s\" passed %n", scenario);
        } catch (Throwable e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }
}
