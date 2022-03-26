package HomeWork1;

import java.util.Scanner;

public class home_work_1_5_3 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String name = in.nextLine();
        String name3 = "Вася";
        String name4 = "Анастасия";

        int a = !name.equals(name3) & !name.equals(name4) ?  1 : 0;
        int b = name.equals(name3) ?  2 : 0;
        int c = name.equals(name4) ?  3 : 0;
        int d = a + b + c;

        switch (d) {
            case 1:
                System.out.println("Добрый день, а вы кто?");
                break;
            case 2:
                System.out.println("Привет!");
                System.out.println("Я тебя так долго ждал");
                break;
            case 3:
                System.out.println("Я тебя так долго ждал");
                break;
        }



    }
}