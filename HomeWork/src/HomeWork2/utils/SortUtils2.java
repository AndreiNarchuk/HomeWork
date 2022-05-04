package HomeWork2.utils;

import java.util.Arrays;

public class SortUtils2 {

    private int[] arr;

    public SortUtils2(int[] arr) {
        this.arr = arr;
    }

    public int[] getArr() {
        return this.arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    /**
     * Сортирует массив при помощи пузырьковой сортировки:
     * @param arr сортируемый массив
     */

    public static void bubble (int[] arr) {
        for(int i = 0; i < arr.length-1; i++) {
            for(int j = 0; j < arr.length -1 -i; j++) {
                if(arr[j] > arr[j+1]) {
                    int sorted = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = sorted;
                }
            }
        }
    }
    /**
     * Cортирует массив при помощи шейкерной сортировки:
     * @param arr сортируемый массив
     */

    public static void shake (int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        boolean sorted = true;
        while(left < right && sorted) {
            sorted = false;
            for(int i = left; i < right; i++) {
                if(arr[i] > arr[i+1]) {
                    int swap = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = swap;
                    sorted = true;
                }
            }
            right--;
            for(int i = right; i > left; i--) {
                if(arr[i-1] > arr[i]) {
                    int swap = arr[i];
                    arr[i] = arr[i-1];
                    arr[i-1] = swap;
                    sorted = true;
                }
            }
            left++;
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SortUtils2 that = (SortUtils2) o;
        return Arrays.equals(this.arr, that.getArr());
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(this.arr);
    }

    @Override
    public String toString() {
        return "SortsUtils2{" +
                "arr=" + Arrays.toString(this.arr) +
                '}';
    }
}
