package HomeWork1;

import java.util.Scanner;

public class home_work_1_5_1 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String name = in.nextLine();
        String name3 = "Вася";
        String name4 = "Анастасия";

        if (name.equals(name3) ) {
            System.out.println("Привет!");
            System.out.println("Я тебя так долго ждал!");
        }
        if (name.equals(name4)) {
            System.out.println("Я тебя так долго ждал!");
        }
        if (!name.equals(name3) & !name.equals(name4))
        {
            System.out.println("Добрый день, а вы кто?");

    }
}

}
