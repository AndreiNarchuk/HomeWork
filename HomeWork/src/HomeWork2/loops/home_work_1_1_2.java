package HomeWork2.loops;

/* При введении числа через аргумент к исполняемой программе выводися произведение чисел от 1 до введенного числа.
        По условию используется рекурсию.
        */
public class home_work_1_1_2 {
    public static void main(String[] args) {
        String line = args[0];                                                       //В переменную line передаем аргумент
        int times = Integer.parseInt(line);                                          //В переменную line представляем как переменную типа int
        if (times < 0) {                                                             //Ограничеваем диапазон вводимых аргументов от 0
            System.out.println("Ошибка ввода данных. Введен отрицательный аргумент");
        } else if (times >= 21) {                                                    //Ограничеваем диапазон вводимых аргументов до 20, для исключения переполнения
            System.out.print("Произошло переполнение введите иной аргумент!");
        } else {
            System.out.println(factor(times));
        }
    }

    public static long factor(int n) {
        long r = n;
        for (; n != 1; n--) {
            System.out.print(r + " * ");
            r = n * factor(n - 1);
            return r;
        }
        if (n == 1) {
            System.out.print("1  = ");
            return r;
        }
        if (n == 0) {
            return r;
        }
        return r;
    }
}








