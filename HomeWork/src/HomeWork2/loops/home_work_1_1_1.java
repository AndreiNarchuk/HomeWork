package HomeWork2.loops;

import HomeWork2.loops.additional.Factorial;

public class home_work_1_1_1 {
    /* При введении числа через аргумент к исполняемой программе выводися произведение чисел от 1 до введенного числа.
    По условию используется только цикл.
    */
    public static void main(String[] args) {

        String line = args[0];  //В переменную line передаем аргумент

        System.out.println(Factorial.Factorial(line));

    }


}

