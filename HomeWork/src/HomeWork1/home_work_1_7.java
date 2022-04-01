package HomeWork1;


import java.util.Scanner;

public class home_work_1_7 {
    public static void main(String[] args) {

        Scanner cons = new Scanner(System.in);

        byte num;
        String b;

        System.out.println("Введите целое число в диапазоне от -128 до 127");
        num = cons.nextByte();

        b = toBinaryString(num);

        System.out.println("Число в двоичном исчислении: " + b);
    }

    public static String toBinaryString(int num) {
        String b = "";
        int[] x;
        x = new int[8];
        if (num > 0) {
            for (int i = x.length - 1; i >= 0; i--) {
                x[i] = num % 2;
                num /= 2;
            }
        } else if (num == 0) {
            return "00000000";
        } else {
            num = 128 - Math.abs(num);
            for (int i = x.length - 1; i >= 0; i--) {
                x[i] = num % 2;
                num /= 2;
            }
            x[0] = 1;
        }
        for (int i = 0; i < x.length; i++) {
            b += x[i];
        }
        return b;
    }

}

