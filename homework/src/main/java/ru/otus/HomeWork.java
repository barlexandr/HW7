package ru.otus;


import ru.otus.tests.unit.DiceImplTest01;
import ru.otus.tests.unit.DiceImplTest02;
import ru.otus.tests.unit.GameTest01;
import ru.otus.tests.unit.GameTest02;

public class HomeWork {

    /*
        Заготовка для ДЗ представляет собой игру в кости.
        При вызове game.playGame(), два игрока кидают кости.
        Выигрывает игрок, у кого результат (1-6) больше

        Написать тесты (минимум 4) на классы DiceImpl и Game.
        Тесты должны найти не менее двух ошибок.

        Информацию о пройденном тесте предлагается выводить в System.out, а об упавшем в System.err
     */
    public static void main(String[] args) {

        System.out.println("\n\n----------------------\n\n");

        new DiceImplTest01().testDiceImplForNegativeNumber();
        System.out.println("\n\n----------------------\n\n");

        new DiceImplTest02().testDiceImplForGreaterThanNumber();
        System.out.println("\n\n----------------------\n\n");

        new GameTest01().testGameForCorrectPlayerName();
        System.out.println("\n\n----------------------\n\n");

        new GameTest02().testGameForNotNullPlayerName();
        System.out.println("\n\n----------------------\n\n");
    }
    
}