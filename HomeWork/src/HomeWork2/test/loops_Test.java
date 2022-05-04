package HomeWork2.test;

import HomeWork2.loops.additional.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class loops_Test {

    @Test
    public void useLoops1_1_1_Test() {

        String message1 = "Тут похоже ошибка ввода данных, введите положительный целочисленный аргумент!";
        String message2 = "Ошибка ввода данных. Необходимо ввести меньший аргумент!";
        String message3 = "0 = 1";
        String message4 = "1 = 1";
        String message5 = "1 * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10 * 11 * 12 = 479001600";//12
        String message6 = "1 * 2 * 3 * 4 * 5 * 6 = 720";
        String message7 = "1 * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10 * 11 * 12 * 13 * 14 * 15 = 1307674368000";
        String m1 = Factorial.Factorial("w");
        String m1_2 = Factorial.Factorial("-10");
        String m1_3 = Factorial.Factorial("10.0");
        String m2 = Factorial.Factorial("89");
        String m2_1 = Factorial.Factorial("21");
        String m3 = Factorial.Factorial("0");
        String m4 = Factorial.Factorial("1");
        String m5 = Factorial.Factorial("12");
        String m6 = Factorial.Factorial("6");
        String m7 = Factorial.Factorial("15");
        Assertions.assertEquals(message1, m1);
        Assertions.assertEquals(message1, m1_2);
        Assertions.assertEquals(message1, m1_3);
        Assertions.assertEquals(message2, m2);
        Assertions.assertEquals(message2, m2_1);
        Assertions.assertEquals(message3, m3);
        Assertions.assertEquals(message4, m4);
        Assertions.assertEquals(message5, m5);
        Assertions.assertEquals(message6, m6);
        Assertions.assertEquals(message7, m7);
    }

    @Test
    public void factorial_Test() {

        long num = 720;
        long num2 = 5040;
        long num3 = 1;
        long num4 = 1;

        Assertions.assertEquals(num, FactorialRecursion.factorial(6));
        Assertions.assertEquals(num2, FactorialRecursion.factorial(7));
        Assertions.assertEquals(num3, FactorialRecursion.factorial(0));
        Assertions.assertEquals(num4, FactorialRecursion.factorial(1));
    }

    @Test
    public void fact_Test() {

        String message1 = "Тут похоже ошибка ввода данных, введите положительный целочисленный аргумент!";
       String message2 = "Ошибка ввода данных. Необходимо ввести меньший аргумент!";
       String message3 = "0 = 1";
        String message4 = "20 * 19 * 18 * 17 * 16 * 15 * 14 * 13 * 12 * 11 * 10 * 9 * 8 * 7 * 6 * 5 * 4 * 3 * 2 * 1 = 2432902008176640000";//20
        String message5 = "14 * 13 * 12 * 11 * 10 * 9 * 8 * 7 * 6 * 5 * 4 * 3 * 2 * 1 = 87178291200";//14
        String message6 = "1 = 1";//1

        String m1 = FactorialRecursion.fact("w");
        String m2 = FactorialRecursion.fact("89");
        String m3 = FactorialRecursion.fact("0");
        String m4 = FactorialRecursion.fact("20");
        String m5 = FactorialRecursion.fact("14");
        String m6 = FactorialRecursion.fact("1");
        String m7 = FactorialRecursion.fact("-10");
        String m8 = FactorialRecursion.fact("10.0");
        String m9 = FactorialRecursion.fact("22");

        Assertions.assertEquals(message1, m1);
        Assertions.assertEquals(message1, m7);
        Assertions.assertEquals(message1, m8);
        Assertions.assertEquals(message2, m2);
        Assertions.assertEquals(message2, m9);
        Assertions.assertEquals(message3, m3);
        Assertions.assertEquals(message4, m4);
        Assertions.assertEquals(message5, m5);
        Assertions.assertEquals(message6, m6);

   }
    @Test
    public void multiNumbers_Test() {

        String message1 = "1 * 8 * 1 * 2 * 3 * 2 * 3 * 7 * 5 = 10 080";
        String message2 = "Введено не целое число";
        String message3 = "Введено не число";
        String message4 = "Произошло переполнение введите иной аргумент";
        String message5 = "-1 * 8 * 1 * 2 * 3 * 2 * 3 * 7 * 5 = -10 080";

        String m1 = MultiplyNumbers.multiNumbers(new String[]{"181232375"});
        String m2 = MultiplyNumbers.multiNumbers(new String[]{"8.9"});
        String m3 = MultiplyNumbers.multiNumbers(new String[]{"8,9"});
        String m4 = MultiplyNumbers.multiNumbers(new String[]{"2,0,"});
        String m5 = MultiplyNumbers.multiNumbers(new String[]{"35k"});
        String m6 = MultiplyNumbers.multiNumbers(new String[]{"y"});
        String m7 = MultiplyNumbers.multiNumbers(new String[]{"99999999999999999999999999999"});
        String m8 = MultiplyNumbers.multiNumbers(new String[]{"-9999999999999999999999999999999"});
        String m9 = MultiplyNumbers.multiNumbers(new String[]{"-181232375"});

        Assertions.assertEquals(message1, m1);
        Assertions.assertEquals(message2, m2);
        Assertions.assertEquals(message2, m3);
        Assertions.assertEquals(message3, m4);
        Assertions.assertEquals(message3, m5);
        Assertions.assertEquals(message3, m6);
        Assertions.assertEquals(message4, m7);
        Assertions.assertEquals(message4, m8);
        Assertions.assertEquals(message5, m9);
    }
    @Test
    public void powX_Test() {
        String message1 = "2.0 ^ 2 = 4,0";
        String message2 = "18.0 ^ 5 = 1 889 568,0";
        String message3 = "7.5 ^ 2 = 56,25";
        String message4 = "Данные некорректны, введите положительную степень возведения!";
        String message5 = "Введено не число, введите число возведимое в степень!";
        String m1 = PowX.powX("2","2");
        String m2 = PowX.powX("18","5");
        String m3 = PowX.powX("7.5","2");
        String m4 = PowX.powX("5.5","-6");
        String m5 = PowX.powX("5.5","-t");
        String m6 = PowX.powX("y.5","2");


        Assertions.assertEquals(message1, m1);
        Assertions.assertEquals(message2, m2);
        Assertions.assertEquals(message3, m3);

        Assertions.assertEquals(message4, m4);
        Assertions.assertEquals(message4, m5);

        Assertions.assertEquals(message5, m6);
    }
    @Test
    public void maxMax_Test() {

        String numSet1 = OverflowEx.maxMax(3);
        String result1 = "[4052555153018976267, -6289078614652622815]";

        String numSet2 = OverflowEx.maxMax(188);
        String result2 = "[1560496482665168896, -1774566438301073408]";

        String numSet3 = OverflowEx.maxMax(-19);
        String result3 = "[799006685782884121, -3265617043834753317]";

        String numSet4 = OverflowEx.maxMax(-1);
        String result4 = "Бесконечность не предел!";

        String numSet5 = OverflowEx.maxMax(1);
        String result5 = "Бесконечность не предел!";

        String numSet6 = OverflowEx.maxMax(0);
        String result6 = "Бесконечность не предел!";


        Assertions.assertEquals(result1,numSet1);
        Assertions.assertEquals(result2,numSet2);
        Assertions.assertEquals(result3,numSet3);
        Assertions.assertEquals(result4,numSet4);
        Assertions.assertEquals(result5,numSet5);
        Assertions.assertEquals(result6,numSet6);
    }
}
