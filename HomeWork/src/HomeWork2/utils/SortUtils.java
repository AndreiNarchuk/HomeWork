package HomeWork2.utils;

public class SortUtils {


    public static void bubble(int[] arr) {
        boolean sorted;
        int k;
        String r;

        System.out.print("\n"+"Введенный массив:    ");
        r = " ";
        for (int i = 0; i < arr.length; i++) {
            r += arr[i] + " ";
        }
        System.out.printf("["+r+"]");

        sorted = false;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    k = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = k;
                    sorted = false;
                }
            }
        }
        System.out.print("\n"+"Массив отсортирован: ");
        r = " ";
        for (int i = 0; i < arr.length; i++) {
            r += arr[i] + " ";
        }
        System.out.printf("["+r+"]");
    }

    public static void shake(int[] arr) {
        int right;
        int left;
        int k;
        String r;

        System.out.print("\n"+"Введенный массив:    ");
        r = " ";
        for (int i = 0; i < arr.length; i++) {
            r += arr[i] + " ";
        }
        System.out.printf("["+r+"]");

        right = arr.length - 1;
        left = 0;

        while (left < right) {
            for (int i = left; i < right; i++) {
                if (arr[i] > arr[i + 1]) {
                    k = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = k;
                }
            }
            right--;
            for (int i = right; i > left; i--) {
                if (arr[i] < arr[i - 1]) ;
                k = arr[i];
                arr[i] = arr[i - 1];
                arr[i - 1] = k;
            }
        }
        left++;

        System.out.print("\n"+"Массив отсортирован: ");
        r = " ";
        for (int i = 0; i < arr.length; i++) {
            r += arr[i] + " ";
        }
        System.out.printf("["+r+"]");
    }
}
