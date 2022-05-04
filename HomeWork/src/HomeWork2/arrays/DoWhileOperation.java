package HomeWork2.arrays;

import HomeWork2.arrays.api.IArraysOperation;

public class DoWhileOperation implements IArraysOperation {

    public String allElements(int[] arr) {
        StringBuilder stringArr = new StringBuilder();
        if (arr.length == 0) {
            return "";
        }
        int i = 0;
        do {
            stringArr.append(arr[i]).append(" ");
            i++;
        } while (i < arr.length);
        return String.valueOf(stringArr);
    }

    public String everySecondElements(int[] arr) {
        StringBuilder stringArr = new StringBuilder();
        if (arr.length == 0) {
            return "";
        }
        int i = 0;
        do {
            if (i % 2 != 0) {
                stringArr.append(arr[i]).append(" ");
            }
            i++;
        } while (i < arr.length);
        return String.valueOf(stringArr);
    }

    public String reverseOrderElements(int[] arr) {
        StringBuilder stringArr = new StringBuilder();
        if (arr.length == 0) {
            return "";
        }
        int i = arr.length - 1;
        do {
            stringArr.append(arr[i]).append(" ");
            i--;
        } while (i >= 0);
        return String.valueOf(stringArr);
    }

}
