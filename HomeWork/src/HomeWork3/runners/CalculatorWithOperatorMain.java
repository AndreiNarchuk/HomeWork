package HomeWork3.runners;

import HomeWork3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithOperatorMain {
    public static void main(String[] args) {
        /*
        2. Создать класс CalculatorWithOperator и посчитать следующие выражение:
        4.1 + 15 * 7 + (28 / 5) ^ 2 = 4.1 + 105 + 31.36 = 140.46
        при помощи калькулятора.
         */
        double a = 4.1;
        double b = 15;
        double c = 7;
        double d = 28;
        double e = 5;
        int f = 2;
        double equals;

        CalculatorWithOperator calc = new CalculatorWithOperator();

        equals = calc.plus(calc.plus(a, calc.times(b, c)), (calc.pow(calc.div(d,e), f)));
        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + equals);


    }
}
