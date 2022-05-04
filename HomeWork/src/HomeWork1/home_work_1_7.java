package HomeWork1;


import HomeWork1.additional.BinaryNumbers;

import java.util.Scanner;

public class home_work_1_7 {
    public static void main(String[] args) {

        Scanner cons = new Scanner(System.in);

        byte numbers;
        System.out.println("Введите целое число в диапазоне от -128 до 127");
        numbers = cons.nextByte();

        String by = BinaryNumbers.BinaryNumbers(numbers);
        System.out.println("Число в двоичном исчислении: " + by);
    }

}

