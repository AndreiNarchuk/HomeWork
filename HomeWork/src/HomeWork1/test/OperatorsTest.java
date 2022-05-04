package HomeWork1.test;

import HomeWork1.additional.BinaryNumbers;
import HomeWork1.additional.NamesWith_If;
import HomeWork1.additional.NamesWith_If_Else;
import HomeWork1.additional.PhoneNumbers;
import HomeWork1.api.ICommunicationPrinter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static HomeWork1.home_work_1_4_1.sleepIn;

public class OperatorsTest {

    @Test
    public void sleepIn_Test() {
        ICommunicationPrinter phrase = new NamesWith_If();
        String message1 = "Ура! Мы можем спать дальше";
        String message2 = "Опять работа.";

        String i = sleepIn(true, true);
        String i1 = sleepIn(true, false);
        String i2 = sleepIn(false, true);
        String i3 = sleepIn(false, false);


        Assertions.assertEquals(message1, i);
        Assertions.assertEquals(message1, i2);
        Assertions.assertEquals(message1, i3);
        Assertions.assertEquals(message2, i1);

    }

    @Test
    public void useNamesWith_If_Test() {
        ICommunicationPrinter phrase = new NamesWith_If();
        String message1 = "Привет!" + "\nЯ тебя так долго ждал!";
        String message2 = "Я тебя так долго ждал!";
        String message3 = "Добрый день, а вы кто?";

//        String i = phrase.welcome("Вася");
//        System.out.println(phrase.welcome("Вася"));
//
//        String i1 = phrase.welcome("Анастасия");
//        System.out.println(phrase.welcome("Анастасия"));
//
//        String i2 = phrase.welcome("Витя");
//        System.out.println(phrase.welcome("Витя"));

        Assertions.assertEquals(message1, phrase.welcome("Вася"));
        Assertions.assertEquals(message2, phrase.welcome("Анастасия"));
        Assertions.assertEquals(message3, phrase.welcome("Витя"));
    }

    @Test
    public void useNamesWith_If_Else_Test() {
        ICommunicationPrinter phrase = new NamesWith_If_Else();
        String message1 = "Привет!" + "\nЯ тебя так долго ждал!";
        String message2 = "Я тебя так долго ждал!";
        String message3 = "Добрый день, а вы кто?";

        Assertions.assertEquals(message1, phrase.welcome("Вася"));
        Assertions.assertEquals(message2, phrase.welcome("Анастасия"));
        Assertions.assertEquals(message3, phrase.welcome("Витя"));
    }

    @Test
    public void useNamesWith_Switch_Test() {
        ICommunicationPrinter phrase = new NamesWith_If_Else();
        String message1 = "Привет!" + "\nЯ тебя так долго ждал!";
        String message2 = "Я тебя так долго ждал!";
        String message3 = "Добрый день, а вы кто?";

        Assertions.assertEquals(message1, phrase.welcome("Вася"));
        Assertions.assertEquals(message2, phrase.welcome("Анастасия"));
        Assertions.assertEquals(message3, phrase.welcome("Витя"));
    }

    @Test
    public void usePhoneNumber_Test() {
        ICommunicationPrinter phrase = new PhoneNumbers();
        String message1 = "(012) 345-6789";
        String message2 = "Номер введен некорректно, повторите ввод";

        Assertions.assertEquals(message1, phrase.welcome("0123456789"));
        Assertions.assertEquals(message2, phrase.welcome("012345678q"));
        Assertions.assertEquals(message2, phrase.welcome("01234567q9"));
        Assertions.assertEquals(message2, phrase.welcome("0123456q89"));
        Assertions.assertEquals(message2, phrase.welcome("0123456q89"));
        Assertions.assertEquals(message2, phrase.welcome("012345q789"));
        Assertions.assertEquals(message2, phrase.welcome("01234q6789"));
        Assertions.assertEquals(message2, phrase.welcome("0123q56789"));
        Assertions.assertEquals(message2, phrase.welcome("012q456789"));
        Assertions.assertEquals(message2, phrase.welcome("01q3456789"));
        Assertions.assertEquals(message2, phrase.welcome("0q23456789"));
        Assertions.assertEquals(message2, phrase.welcome("q123456789"));
        Assertions.assertEquals(message2, phrase.welcome("01234"));
        Assertions.assertEquals(message2, phrase.welcome("В3555"));
        Assertions.assertEquals(message2, phrase.welcome("012 3456789"));
        Assertions.assertEquals(message2, phrase.welcome("Вова"));
    }

    @Test
    public void useBinaryNumbers_Test() {

        String message1 = "01011001";//89
        String message2 = "11110110";//-10
        String message3 = "10000000";//-128
        String message4 = "01111111";//127
        String message5 = "10000001";//-127
        String message6 = "10000001";//129 (-127)

        String m1 = BinaryNumbers.BinaryNumbers((byte) 89);
        String m2 = BinaryNumbers.BinaryNumbers((byte) -10);
        String m3 = BinaryNumbers.BinaryNumbers((byte) -128);
        String m4 = BinaryNumbers.BinaryNumbers((byte) 127);
        String m5 = BinaryNumbers.BinaryNumbers((byte) -127);
        String m6 = BinaryNumbers.BinaryNumbers((byte) 129);

        Assertions.assertEquals(message1, m1);
        Assertions.assertEquals(message2, m2);
        Assertions.assertEquals(message3, m3);
        Assertions.assertEquals(message4, m4);
        Assertions.assertEquals(message5, m5);
        Assertions.assertEquals(message6, m6);

    }
}
