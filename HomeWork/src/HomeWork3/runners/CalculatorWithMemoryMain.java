package HomeWork3.runners;


import HomeWork3.calcs.additional.CalculatorWithCounterAutoAgregationInterface;
import HomeWork3.calcs.additional.CalculatorWithMemory;
import HomeWork3.calcs.api.ICalculator;
import HomeWork3.calcs.simple.CalculatorWithOperator;

import java.util.Arrays;


public class CalculatorWithMemoryMain {
    public static void main(String[] args) {
        /*
       10. Создать класс CalculatorWithMemoryMain и посчитать следующие выражение:
        4.1 + 15 * 7 + (28 / 5) ^ 2 = 4.1 + 105 + 31.36 = 140.46

        10.7 Вывести в консоль результат. В мэйне запрещается использование переменных для хранения значений участвующих
        в просчёте, а также результатов работы методов калькулятора, можно использовать только литералы и метод получения
        из памяти записанного значения.
         */


        CalculatorWithMemory calc = new CalculatorWithMemory(new CalculatorWithOperator());

        calc.div(28,5);
        calc.memorization();
        System.out.println("Результат первого действия в памяти: " + calc.memorization());
        calc.pow(calc.getMemory(), 2);
        calc.memorization();
        System.out.println("Результат второго действия в памяти: " + calc.memorization());
        calc.plus(calc.getMemory(), calc.times(15, 7));
        calc.memorization();
        System.out.println("Результат третьего и четвертого действия в памяти: " + calc.memorization()); // для корректной демонстрации работы метода необходимо нарушить условие задания и
        // ввести переменную, поэтому результат третьего действиявыводится выведен совместно с четвертым
        calc.plus(4.1, calc.getMemory());
        calc.memorization();
        System.out.println("Результат пятого действия в памяти: " +calc.memorization());

        System.out.println("\n" + "4.1 + 15 * 7 + (28 / 5) ^ 2 = " + calc.getMemory());
        System.out.println("\n" + "Количество выполненных операций при запуске CalculatorWithMemoryMain: " + calc.getCountOperation());

    }


}
