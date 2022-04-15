package HomeWork3.runners;

import HomeWork3.calcs.additional.CalculatorWithCounterAutoAgregation;
import HomeWork3.calcs.additional.CalculatorWithCounterAutoComposite;
import HomeWork3.calcs.simple.CalculatorWithMathCopy;
import HomeWork3.calcs.simple.CalculatorWithMathExtends;
import HomeWork3.calcs.simple.CalculatorWithOperator;


public class CalculatorWithCounterDelegateMain {

    public static void main(String[] args) {
        /*
           7. Используя методы из классов CalculatorWithCounterAutoComposite и CalculatorWithCounterAutoAgregation посчитать задание 1
        */
        double a = 4.1;
        double b = 15;
        double c = 7;
        double d = 28;
        double e = 5;
        int f = 2;

        double equals;
        double equals2;

        CalculatorWithCounterAutoComposite calc = new CalculatorWithCounterAutoComposite();

        equals = calc.plus(calc.plus(a, calc.times(b, c)), (calc.pow(calc.div(d, e), f)));
        System.out.println("При использовании класса CalculatorWithCounterAutoComposite:");
        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + equals);
        System.out.println("\n" + "Количество выполненных операций при запуске CalculatorWithCounterAutoComposite: " + calc.getCountOperation());


        CalculatorWithCounterAutoAgregation calculator = new CalculatorWithCounterAutoAgregation(new CalculatorWithOperator(), new CalculatorWithMathCopy(), new CalculatorWithMathExtends());

        equals2 = calculator.plus(calculator.plus(a, calculator.times(b, c)), (calculator.pow(calculator.div(d, e), f)));
        System.out.println("\n"+"При использовании класса CalculatorWithCounterAutoAgregation:");
        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + equals2);
        System.out.println("\n" + "Количество выполненных операций при запуске CalculatorWithCounterAutoAgregation: " + calculator.getCountOperation());

    }
}
