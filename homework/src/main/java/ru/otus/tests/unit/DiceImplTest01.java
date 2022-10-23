package ru.otus.tests.unit;

import ru.otus.assertions.Assertions;
import ru.otus.game.DiceImpl;

public class DiceImplTest01 {
    public void testDiceImplForNegativeNumber() {
        String scenario = "Тест на выпадение числа меньше 1";
        var dice = new DiceImpl();
        try {
            int minimalValue = 1;
            int actual = dice.roll();
            Assertions.assertMore(minimalValue, actual);

            actual = dice.roll();
            Assertions.assertMore(minimalValue, actual);

            actual = dice.roll();
            Assertions.assertMore(minimalValue, actual);

            actual = dice.roll();
            Assertions.assertMore(minimalValue, actual);

            actual = dice.roll();
            Assertions.assertMore(minimalValue, actual);

            actual = dice.roll();
            Assertions.assertMore(minimalValue, actual);

            System.out.printf("\"%s\" passed %n", scenario);
        } catch (Throwable e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }
}
