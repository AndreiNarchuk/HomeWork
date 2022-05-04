package HomeWork2.arrays;

import HomeWork2.utils.ArraysUtils;


public class ArraysIterationMain_I {
    public static void main(String[] args) {
        int[] container;

        container = ArraysUtils.arrayFromConsole();

        DoWhileOperation elem1 =new DoWhileOperation ();
        System.out.println("\n"+"DoWhileOperation");
        System.out.println (elem1.allElements(container));
        System.out.println (elem1.reverseOrderElements(container));
        System.out.println (elem1.everySecondElements(container));

        WhileOperation elem2 =new WhileOperation();
        System.out.println("\n"+"WhileOperation");

        System.out.println (elem2.allElements(container));
        System.out.println (elem2.reverseOrderElements(container));
        System.out.println (elem2.everySecondElements(container));

        ForOperation elem3= new ForOperation();
        System.out.println("\n"+"ForOperation");
        System.out.println (elem3.allElements(container));
        System.out.println (elem3.reverseOrderElements(container));
        System.out.println (elem3.everySecondElements(container));

        ForEachOperation elem4 =new ForEachOperation();
        System.out.println("\n"+"ForEachOperation");
        System.out.println (elem4.allElements(container));
        System.out.println (elem4.reverseOrderElements(container));
        System.out.println (elem4.everySecondElements(container));

    }

    }







