package HomeWork2.loops;

import java.text.DecimalFormat;
import java.util.Scanner;

public class home_work_1_3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("Введите число возводимое в степень:");
        String numStr = console.nextLine();
        float num = Float.parseFloat(numStr);

        System.out.println("Введите степень возведения:");
        String degree = console.nextLine();
        Integer i = Integer.parseInt(degree);

        if (i<0){
            System.out.println("Данные некорректные, введите положительную степень возведения!");
        }else {
            float n = 1f;

            while (i > 0) {
                n = n * num;
                i--;
            }

            System.out.println(num+" ^ "+degree+" = " +new DecimalFormat("###,###,###,###,###.0##").format(n));
        }
    }

}

