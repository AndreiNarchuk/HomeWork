package HomeWork2.loops;

public class home_work_1_1_2 {
    public static void main(String[] args) {
        for (String arg : args) {

            int a = Integer.parseInt(String.valueOf(arg));
            if (factor(a) < 0) {
                System.out.print("Произошло переполнение введите иной аргумент!");
            } else {
                System.out.println(factor(a));
            }
        }
    }

    public static long factor(int n) {

        long r = n;
        if (n < 0) {
            System.out.println("Ошибка ввода данных введен отрицательный аргумент");
        }
        if (n == 0) {
            System.out.print(" = ");
            return r;
        }
        if (n == 1) {
            System.out.print(" * 1  = ");
            return r;
        }
        System.out.print(n);
        if (n != 2) {
            System.out.print(" * ");
        }
        r = n * factor(n - 1);

        return r;
    }

}






