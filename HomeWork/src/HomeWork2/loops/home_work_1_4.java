package HomeWork2.loops;

import java.text.DecimalFormat;
import java.util.Scanner;

public class home_work_1_4 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        long a = 1;
        System.out.println("Введите целое число :");
        long num = console.nextLong();

        System.out.println("Значение числа до переполнения:");
        System.out.println(new DecimalFormat("###,###").format(maxMax(num)));
        System.out.println("Значение числа после переполнения:");
        System.out.println(new DecimalFormat("###,###,###,###,###").format(maxMax(num)* num));
    }



    public static long maxMax(long num) {
        long a = 1;
        if (num < 0) {
            int i = 0;
            for (; a <= Long.MAX_VALUE & a * Math.abs(num) > 0; ) {
                a = a * Math.abs(num);
                i++;
            }
            if (i % 2 == 0) {
                return a;
            }else {
                return -a;
            }
        }
        if (num > 0) {
            for (; a <= Long.MAX_VALUE & a * num > 0; ) {
                a = a * num;
            }
            return a;
        }
        return a;
    }
}

