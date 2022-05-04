package HomeWork2.loops;

import HomeWork2.loops.additional.FactorialRecursion;

/* При введении числа через аргумент к исполняемой программе выводися произведение чисел от 1 до введенного числа.
        По условию используется рекурсию.
        */
public class home_work_1_1_2 {
    public static void main(String[] args) {
        String line = args[0];

           System.out.println(FactorialRecursion.fact(line));
        }
    }









