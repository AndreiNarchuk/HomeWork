package HomeWork2.loops;

public class home_work_1_1_1 {
    /* При введении числа через аргумент к исполняемой программе выводися произведение чисел от 1 до введенного числа.
    По условию используется только цикл.
    */
    public static void main(String[] args) {

        String line = args[0];  //В переменную line передаем аргумент
        int times = Integer.parseInt(line); //В переменную line представляем как переменную типа int
        long result = 1;

        if (times < 0) {
            System.out.println("Тут похоже ошибка ввода данных, введите положительный целочисленный аргумент!");
        }
        if (times == 0) {
            System.out.print(times + " = 1");
        }
        if (times >= 21) {
            System.out.println("Ошибка ввода данных. Произошло переполнение, введите меньший аргумент!");
        }
        if (times > 0 & times < 21) {
            for (int i = 1; i <= times; i++) {
                result *= i;
                if (i != times) {
                    System.out.print(i + " * ");
                } else {
                    System.out.print(i + " = ");
                    System.out.println(result);
                }
            }
        }
    }
}


