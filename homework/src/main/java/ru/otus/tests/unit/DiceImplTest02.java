package ru.otus.tests.unit;

import ru.otus.assertions.Assertions;
import ru.otus.game.DiceImpl;

public class DiceImplTest02 {
    public void testDiceImplForGreaterThanNumber() {
        String scenario = "Тест на выпадение числа, больше 6";
        var dice = new DiceImpl();
        try {
            int maximalValue = 6;
            int actual = dice.roll();
            Assertions.assertLess(maximalValue, actual);

            actual = dice.roll();
            Assertions.assertLess(maximalValue, actual);

            actual = dice.roll();
            Assertions.assertLess(maximalValue, actual);

            actual = dice.roll();
            Assertions.assertLess(maximalValue, actual);

            actual = dice.roll();
            Assertions.assertLess(maximalValue, actual);

            actual = dice.roll();
            Assertions.assertLess(maximalValue, actual);

            System.out.printf("\"%s\" passed %n", scenario);
        } catch (Throwable e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }
}
