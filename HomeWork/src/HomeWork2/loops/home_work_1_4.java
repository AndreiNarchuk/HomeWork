package HomeWork2.loops;

import HomeWork2.loops.additional.OverflowEx;

import java.util.Scanner;

public class home_work_1_4 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        long a = 1;
        System.out.println("Введите целое число :");
        long num = console.nextLong();

        System.out.println("Значение числа до и после переполнения:");
        System.out.println(OverflowEx.maxMax(num));

    }


}

