package HomeWork2.sorts;

import static HomeWork2.loops.arrays.ArraysUtils.arrayFromConsole;
import static HomeWork2.loops.arrays.ArraysUtils.arrayRandom;
import static HomeWork2.sorts.SortUtils.bubble;
import static HomeWork2.sorts.SortUtils.shake;

public class Sorts {

    public static void main(String[] args) {
            int[] arr;

//4.2.2.1. new int[]{1,2,3,4,5,6}
            arr = new int[]{1, 2, 3, 4, 5, 6};
            System.out.println("\n\n"+"Пузырьковая сортировка:");
            bubble(arr);

            arr = new int[]{1, 2, 3, 4, 5, 6};
            System.out.println("\n\n"+"Шейкерная сортировка:");
            shake(arr);

//4.2.2.2. new int[]{1,1,1,1}
            arr = new int[]{1, 1, 1, 1};
            System.out.println("\n\n"+"Пузырьковая сортировка:");
            bubble(arr);

            arr = new int[]{1, 1, 1, 1};
            System.out.println("\n\n"+"Шейкерная сортировка:");
            shake(arr);

//4.2.2.3 {9, 1, 5, 99, 9, 9}
            arr = new int[]{9, 1, 5, 99, 9, 9};
            System.out.println("\n\n"+"Пузырьковая сортировка:");
            bubble(arr);

            arr = new int[]{9, 1, 5, 99, 9, 9};
            System.out.println("\n\n"+"Шейкерная сортировка:");
            shake(arr);

//4.2.2.5 {6,5,4,3,2,1}
            arr = new int[]{};
            System.out.println("\n\n"+"Пузырьковая сортировка:");
            bubble(arr);

            arr = new int[]{};
            System.out.println("\n\n"+"Шейкерная сортировка:");
            shake(arr);

//4.2.2.5 {6,5,4,3,2,1}
            arr = new int[]{6, 5, 4, 3, 2, 1};
            System.out.println("\n\n"+"Пузырьковая сортировка:");
            bubble(arr);

            arr = new int[]{6, 5, 4, 3, 2, 1};
            System.out.println("\n\n"+"Шейкерная сортировка:");
            shake(arr);

// 4.2.2.6 arrayRandom
            arr = arrayRandom(50, 100);
            System.out.println("\n\n"+"Пузырьковая сортировка:");
            bubble(arr);

            arr = arrayRandom(50, 100);
            System.out.println("\n\n"+"Шейкерная сортировка:");
            shake(arr);

//  4.2.3 arrayFromConsole
            arr = arrayFromConsole();
            System.out.println("\n\n"+"Пузырьковая сортировка:");
            bubble(arr);

            arr = arrayFromConsole();
            System.out.println("\n\n"+"Шейкерная сортировка:");
            shake(arr);
        }
}



