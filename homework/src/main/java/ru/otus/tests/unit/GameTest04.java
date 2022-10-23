package ru.otus.tests.unit;

import ru.otus.assertions.Assertions;
import ru.otus.game.Game;
import ru.otus.game.GameWinnerConsolePrinter;
import ru.otus.game.Player;
import ru.otus.tests.unit.utils.MyMockDiceImplRealisationForTest;

import java.io.ByteArrayOutputStream;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class GameTest04 {
    public void testGameForWinner() {

        String scenario = "Тест на проверку определения победителя";
        try {

            var diceForTest = new MyMockDiceImplRealisationForTest();
            var winnerPrinter = new GameWinnerConsolePrinter();
            var game = new Game(diceForTest, winnerPrinter);
            var playerOne = new Player("Иван");
            var playerTwo = new Player("Артем");

            var outputStream = new ByteArrayOutputStream();
            System.setOut(new PrintStream(outputStream));
            game.playGame(playerOne, playerTwo);

            Assertions.assertEquals(String.format("Победитель: %s%n", playerTwo.getName()), outputStream.toString());

            System.setOut(new PrintStream(new FileOutputStream(FileDescriptor.out)));
            System.out.printf("\"%s\" passed %n", scenario);
        } catch (Throwable e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }
}
