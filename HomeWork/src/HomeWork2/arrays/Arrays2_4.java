package HomeWork2.arrays;

import java.util.Scanner;

import static HomeWork2.utils.ArraysUtils.arrayRandom;

public class Arrays2_4 {
    public static void main(String[] args) {
        int[] arr;
        Scanner console = new Scanner(System.in);
        arr = arrayRandom(50, 100);

        System.out.println("\n"+"Cумма четных положительных элементов массива: " + sumFourElements(arr));
        System.out.println("\n"+"Максимальный из элементов с четными индексами: " + extrElements(arr));
        System.out.println("\n"+"Элементы массива, которые меньше среднего арифметического:" + lowMiddleElements(arr));
        System.out.println("\n"+"Два наименьших элемента (минимальных) элемента массива:");
        System.out.println(lowElements(arr));
        System.out.println("\n"+"Сумма цифр массива:" + sumArray(arr));

        System.out.println("Укажите интервал, в котором удалить эелементы: >");
        int a = console.nextInt();
        System.out.println("> ");
        int b = console.nextInt();

        System.out.println("\n"+"Массив после удаления элементов:" + delArray(arr, a, b));

    }

    public static int sumFourElements(int[] arr) {
        int s = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0 & arr[i] % 2 == 0) {
                s = s + arr[i];
            }
        }
        return s;
    }

    public static int extrElements(int[] arr) {
        int extr;
        extr = 0;
        for (int i = 0; i < arr.length; i += 2) {
            if (arr[i] > extr) {
                extr = arr[i];
            }
        }
        return extr;
    }

    public static String lowMiddleElements(int[] arr) {
        int min;
        int s;
        int var;
        String result = " ";

        s = 0;
        min = 0;

        for (int i = 0; i < arr.length; i++) {
            s = s + arr[i];
        }
        var = s / arr.length;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < var) {
                min = arr[i];
                result = result + " " + min;
            }
        }
        return result;
    }

    public static String lowElements(int[] arr) {
        int one;
        int lowTwo;
        int count;
        String result = " ";

        one = arr[0];
        count = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < one) {
                one = arr[i];
                count = i;
            }
        }
        if (one == arr[0]) {
            lowTwo = arr[1];
        } else {
            lowTwo = arr[0];
        }
        for (int i = 1; i < arr.length; i++) {
            if (i < count | i > count) {
                if (arr[i] < lowTwo) {
                    lowTwo = arr[i];
                }
            }
        }
        result = ("Первое = " + one + "\nВторое = " + lowTwo);

        return result;
    }

    public static String delArray(int[] arr, int a, int b) {
        int[] arr2;

        int c;
        String result;

        arr2 = new int[arr.length];
        c = a;
        result = " ";

        for (int i = 0; i < a; i++) {
            arr2[i] = arr[i];
        }
        for (int i = b + 1; i > b & i < arr.length; i++) {
            arr2[c] = arr[i];
            c++;
        }
        for (int i = 0; i < arr2.length; i++) {
            result = result + " " + arr2[i];
        }
        return result;
    }

    public static int sumArray(int[] arr) {
        int n1;
        int n2;
        int s;
        s = 0;

        for (int i = 0; i < arr.length; i++) {
            n1 = arr[i];
            while (n1 != 0) {
                n2 = n1 % 10;
                s = s + n2;
                n1 = n1 / 10;
            }
        }
        return s;
    }
    }







