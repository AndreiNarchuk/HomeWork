package HomeWork3.runners;

import HomeWork3.calcs.additional.CalculatorWithCounterAutoSuper;

public class CalculatorWithCounterAutoSuperMain {
    public static void main(String[] args) {

        /*
        6. Посчитать следующие выражение: 4.1 + 15 * 7 + (28 / 5) ^ 2 = 4.1 + 105 + 31.36 = 140.46
        вызывая CalculatorWithCounterAutoSuper.
        Вывести в консоль результаты посчитанных выражений и результат метода getCountOperation() и количество раз использования методов
         */
        double a = 4.1;
        double b = 15;
        double c = 7;
        double d = 28;
        double e = 5;
        int f = 2;
        double equals;

        CalculatorWithCounterAutoSuper calc = new CalculatorWithCounterAutoSuper();

        equals = calc.plus(calc.plus(a, calc.times(b, c)), (calc.pow(calc.div(d, e), f)));

        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + equals);
        System.out.println("\n"+"Число использований калькулятора = " + calc.getCountOperation());

    }
}

