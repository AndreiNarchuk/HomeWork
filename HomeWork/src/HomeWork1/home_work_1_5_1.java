package HomeWork1;

import HomeWork1.additional.NamesWith_If;
import HomeWork1.api.ICommunicationPrinter;

import java.util.Scanner;

public class home_work_1_5_1 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String name = in.nextLine();

        ICommunicationPrinter phrase = new NamesWith_If();
        System.out.println(phrase.welcome(name));



}


}
