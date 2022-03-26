package HomeWork1;

import java.util.Scanner;

public class home_work_1_4_1 {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        System.out.println("Сегодня weekday? Введите true/false :");
        Boolean weekday = console.nextBoolean();


        System.out.print("Сегодня vacation? Введите true/false :");
        Boolean vacation = console.nextBoolean();

        if (sleepIn(weekday, vacation))
            System.out.println("Ура! Мы можем спать дальше");
            System.out.println("Опять работа.");
    }


    private static boolean sleepIn(boolean weekday,boolean vacation) {

        if (!weekday || vacation) {
            return true;
            }
            return false;}





}
