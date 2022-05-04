package HomeWork2.loops;

import HomeWork2.loops.additional.PowX;

import java.util.Scanner;

public class home_work_1_3 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("Введите число возводимое в степень:");
        String number = console.nextLine();

        System.out.println("Введите степень возведения:");
        String degree = console.nextLine();

        System.out.println(PowX.powX(number,degree));

    }
}

