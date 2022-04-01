package HomeWork2.loops;

public class home_work_1_1_1version {

    public static void main(String[] args) {

        for (String arg : args) {

            int a = Integer.parseInt(String.valueOf(arg));
            System.out.println(fact(a));
        }
    }

    private static long fact(int a) {
        if (a < 0) {
            System.out.println("Ошибка ввода данных");
            return 0;
        }
        long result = 1;
        if (a == 0) {
            return result;
        }

        for (int i = 1; i <= a; i++) {
            result = result * i;

            if (result == Long.MAX_VALUE || result <= 0) {
                System.out.println("Ошибка ввода данных");
                return 0;
            }
        }
        return result;
    }
}