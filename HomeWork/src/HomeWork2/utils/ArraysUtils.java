package HomeWork2.loops.arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class ArraysUtils {
    public static void main(String[] args) {

    }

    public static int[] arrayFromConsole() {
        Scanner console = new Scanner(System.in);

        int n;
        System.out.println("\n\n"+"Введите размерность массива");
        n = console.nextInt();

        int[] container;
        container = new int[n];

        if (container.length != 0 & container.length > 0) {
            System.out.println("\n"+"Введите значение " + n + " элементов массива");
            for (int i = 0; i < container.length; i++) {
                if (n != 0) {
                    container[i] = console.nextInt();
                } else if (!console.hasNextInt()) {
                    System.out.println("Введены некорректные данные.");
                    console.next();
                } else {
                    System.out.println("Введены некорректные данные.");
                }
            }
        }
        if (container.length == 0) {
            System.out.println("В массиве отсутствуют элементы.");
        }
        return container;
    }

    public static int[] arrayRandom(int size, int maxValueExclusion) {
        Scanner in = new Scanner(System.in);

        System.out.println("\n\n"+"Введите размер создаваемого массива:");
        size = in.nextInt();

        System.out.println("Введите число, до какого будут перебираться элементы создаваемого массива:");
        maxValueExclusion = in.nextInt();

        if (size != 0 & size > 0) {
            int[] container = new int[size];
            Random r = new Random();

            for (int i = 0; i < container.length; i++) {
                int x = r.nextInt(maxValueExclusion);
                container[i] = x;
            }
            System.out.println(Arrays.toString(container));
            return container;

        } else {
            System.out.println("Введены некорректные данные, введите целое, положительное число");
        }
        return new int[]{0};
    }
}




