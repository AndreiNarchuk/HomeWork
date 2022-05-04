package HomeWork2.arrays;

import HomeWork2.arrays.api.IArraysOperation;

public class ForOperation implements IArraysOperation {

    @Override
    public String allElements(int[] arr) {
        StringBuilder stringArr = new StringBuilder();
        for(int i = 0; i < arr.length; i++) {
            stringArr.append(arr[i]).append(" ");
        }
        return String.valueOf(stringArr);
    }

    @Override
    public String everySecondElements(int[] arr) {
        StringBuilder stringArr = new StringBuilder();
        for(int i = 0; i< arr.length; i++) {
            if(i % 2 != 0) {
                stringArr.append(arr[i]).append(" ");
            }
        }
        return String.valueOf(stringArr);
    }

    @Override
    public String reverseOrderElements(int[] arr) {
        StringBuilder stringArr = new StringBuilder();
        for(int i = arr.length - 1; i >= 0 ; i--) {
            stringArr.append(arr[i]).append(" ");
        }
        return String.valueOf(stringArr);
    }
}
