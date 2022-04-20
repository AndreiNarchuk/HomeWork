package HomeWork3.runners;


import HomeWork3.calcs.additional.CalculatorWithCounterAutoDecorator;
import HomeWork3.calcs.additional.CalculatorWithMemoryDecorator;
import HomeWork3.calcs.api.ICalculator;
import HomeWork3.calcs.simple.CalculatorWithMathExtends;



public class CalculatorDecoratorMain {
    public static void main(String[] args) {
        /*
     11.
         */

        ICalculator calc = new CalculatorWithCounterAutoDecorator(new CalculatorWithMemoryDecorator(new CalculatorWithMathExtends()));


        double equal = calc.plus(calc.plus(calc.pow(calc.div(28, 5), 2), calc.times(15, 7)), 4.1);

        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = "+ equal);

        if (calc instanceof CalculatorWithCounterAutoDecorator) {
            CalculatorWithCounterAutoDecorator calcWithCounter = (CalculatorWithCounterAutoDecorator) calc;

            System.out.println("Число использований калькулятора: " + calcWithCounter.getCountOperation());

            if (calcWithCounter.getCalculator() instanceof CalculatorWithMemoryDecorator && calcWithCounter.getCalculator() != null) {
                CalculatorWithMemoryDecorator calcWithMemory = (CalculatorWithMemoryDecorator) calcWithCounter.getCalculator();
                calcWithMemory.memorization();

                System.out.println("Последнее запомненное значение: " + calcWithMemory.getMemory());

            }
        }
    }
}
