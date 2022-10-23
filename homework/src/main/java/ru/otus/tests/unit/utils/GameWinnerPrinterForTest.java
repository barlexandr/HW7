package ru.otus.tests.unit.utils;

import ru.otus.game.GameWinnerPrinter;
import ru.otus.game.Player;

public class GameWinnerPrinterForTest implements GameWinnerPrinter {
    private Player winner;

    @Override
    public void printWinner(Player winner) {
        this.winner = winner;
    }

    public Player getWinner() {
        return winner;
    }
}
