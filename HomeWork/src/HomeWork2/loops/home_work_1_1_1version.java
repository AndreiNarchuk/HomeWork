package HomeWork2.loops;

public class home_work_1_1_1version {

    /* При введении числа через аргумент к исполняемой программе выводися произведение чисел от 1 до введенного числа.
        По условию используется цикл.
        */
    public static void main(String[] args) {

        String line = args[0];  //В переменную line передаем аргумент
        int times = Integer.parseInt(line); //В переменную line представляем как переменную типа int
        if (times < 0) {
            System.out.println("Ошибка ввода данных. Введен отрицательный аргумент");
        }else if (fact(times) <= 0) {
            System.out.println("Ошибка ввода данных. Произошло переполнение, введите меньший аргумент");
        } else {
            for (int i = 0; i <= times; i++) {
                if (i != times) {
                    System.out.print(i + " * ");
                }
                if (i == times) {
                    System.out.print(i + " = ");
                }
            }
            System.out.println(fact(times)); // Выводим результат работы метода fact(int a)
        }
    }
    /**
     * Метод принимает положительную переменную типа int и вычисляет факториал для введенного целочисленного числа.
     * Принимая отрицательное число, или при переполнении возвращает 0
     *
     * @param a
     * @return пременную типа long
     */
    private static long fact(int a) {
        if (a < 0) {
            return 0;
        }
        long result = 1;
        if (a == 0) {
            return result;
        }
        for (int i = 1; i <= a; i++) {
            result *= i;
            if (result == Long.MAX_VALUE || result <= 0) {
                return 0;
            }
        }
        return result;
    }
}

