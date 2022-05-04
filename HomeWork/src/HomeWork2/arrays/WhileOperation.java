package HomeWork2.arrays;

import HomeWork2.arrays.api.IArraysOperation;

public class WhileOperation implements IArraysOperation {

    @Override
    public String allElements(int[] arr) {
        StringBuilder stringArr = new StringBuilder();
        int i = 0;
        while(i < arr.length) {
            stringArr.append(arr[i]).append(" ");
            i++;
        }
        return String.valueOf(stringArr);
    }

    @Override
    public String everySecondElements(int[] arr) {
        StringBuilder stringArr = new StringBuilder();
        int i = 0;
        while(i < arr.length) {
            if(i % 2 != 0) {
                stringArr.append(arr[i]).append(" ");
            }
            i++;
        }
        return String.valueOf(stringArr);
    }

    @Override
    public String reverseOrderElements(int[] arr) {
        StringBuilder stringArr = new StringBuilder();
        int i = arr.length - 1;
        while(i>=0) {
            stringArr.append(arr[i]).append(" ");
            i--;
        }
        return String.valueOf(stringArr);
    }
}
