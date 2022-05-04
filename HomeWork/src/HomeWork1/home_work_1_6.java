package HomeWork1;

import HomeWork1.additional.PhoneNumbers;
import HomeWork1.api.ICommunicationPrinter;

import java.util.Scanner;

public class home_work_1_6 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите 10 цифр номера от 0 до 9: ");

        String arr;
        arr = console.nextLine();

        ICommunicationPrinter phrase = new PhoneNumbers();
        System.out.println(phrase.welcome(arr));

    }
}


