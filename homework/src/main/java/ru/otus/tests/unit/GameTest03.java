package ru.otus.tests.unit;

import ru.otus.assertions.Assertions;
import ru.otus.game.DiceImpl;
import ru.otus.game.Game;
import ru.otus.game.GameWinnerConsolePrinter;
import ru.otus.game.Player;

import java.io.ByteArrayOutputStream;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class GameTest03 {
    public void testGameForPrintWinner() {

        String scenario = "Тест на проверку печати победителя";
        try {

            var winnerPrinter = new GameWinnerConsolePrinter();
            var playerOne = new Player("Иван");
            var outputStream = new ByteArrayOutputStream();
            System.setOut(new PrintStream(outputStream));

            winnerPrinter.printWinner(playerOne);

            Assertions.assertEquals(String.format("Победитель: %s%n", playerOne.getName()), outputStream.toString());

            System.setOut(new PrintStream(new FileOutputStream(FileDescriptor.out)));
            System.out.printf("\"%s\" passed %n", scenario);
        } catch (Throwable e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }
}
