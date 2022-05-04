package HomeWork2.arrays;

import HomeWork2.arrays.api.IArraysOperation;

public class ForEachOperation implements IArraysOperation {

    @Override
    public String allElements(int[] arr) {
        StringBuilder stringArr = new StringBuilder();
        int i = 0;
        for (int number : arr) {
            stringArr.append(arr[i]).append(" ");
            i++;
        }
        return String.valueOf(stringArr);
    }

    @Override
    public String everySecondElements(int[] arr) {
        StringBuilder stringArr = new StringBuilder();
        int i = 0;
        for (int number : arr) {
            if (i % 2 != 0) {
                stringArr.append(arr[i]).append(" ");
            }
            i++;
        }
        return String.valueOf(stringArr);
    }

    @Override
    public String reverseOrderElements(int[] arr) {
        StringBuilder stringArr = new StringBuilder();
        int i = arr.length-1;
        for (int number : arr) {
            stringArr.append(arr[i]).append(" ");
            i--;
        }
        return String.valueOf(stringArr);
    }
}
