package HomeWork2.loops;

public class home_work_1_1_1 {

    public static void main(String[] args) {

        for (String arg : args) {

            int a = Integer.parseInt(String.valueOf(arg));
            long i = 1;
            long x = 1;
            if (a >= 0) {
                while (i != a + 1) {
                    x = i * x;
                    if (i != a) {
                        System.out.print(i + " * ");
                    } else {
                        System.out.print(i + " = ");
                    }
                    i++;
                }

                if (x == Long.MAX_VALUE || x < 0) {
                    System.out.println("Ошибка ввода данных");
                    System.out.println("Произошло переполнение введите иной аргумент");
                } else {
                    System.out.print(x);
                }
            } else {
                System.out.println("Тут похоже ошибка ввода данных");
            }

        }
    }
}
