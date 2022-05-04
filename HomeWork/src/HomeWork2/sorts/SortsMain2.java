package HomeWork2.sorts;

import HomeWork2.utils.SortUtils2;

import java.util.Arrays;

public class SortsMain2 {

    public static void main(String[] args) {
            int[] arr;
            System.out.println("До сортировки" +
                    "\n{1,2,3,4,5,6}"+"\n{1,1,1,1}"+"\n{9, 1, 5, 99, 9, 9}"+"\n{}"+"\n{6, 5, 4, 3, 2, 1}");

            System.out.println("После сортировки bubble");

            SortUtils2 arr1 = new SortUtils2(new int[]{1, 2, 3, 4, 5, 6});
            SortUtils2.bubble(arr1.getArr());

            System.out.println(Arrays.toString(arr1.getArr()));

            SortUtils2 arr2 = new SortUtils2(new int[]{1, 1, 1, 1});
            SortUtils2.bubble(arr2.getArr());

            System.out.println(Arrays.toString(arr2.getArr()));

            SortUtils2 arr3 = new SortUtils2(new int[]{9, 1, 5, 99, 9, 9});
            SortUtils2.bubble(arr3.getArr());

            System.out.println(Arrays.toString(arr3.getArr()));

            SortUtils2 arr4 = new SortUtils2(new int[]{});
            SortUtils2.bubble(arr4.getArr());

            System.out.println(Arrays.toString(arr4.getArr()));

            SortUtils2 arr5 = new SortUtils2(new int[]{6, 5, 4, 3, 2, 1});
            SortUtils2.bubble(arr5.getArr());

            System.out.println(Arrays.toString(arr5.getArr()));

            System.out.println("После сортировки shake");

            SortUtils2 arr6 = new SortUtils2(new int[]{1, 2, 3, 4, 5, 6});
            SortUtils2.shake(arr6.getArr());

            System.out.println(Arrays.toString(arr6.getArr()));

            SortUtils2 arr7 = new SortUtils2(new int[]{1, 1, 1, 1});
            SortUtils2.bubble(arr7.getArr());

            System.out.println(Arrays.toString(arr7.getArr()));

            SortUtils2 arr8 = new SortUtils2(new int[]{9, 1, 5, 99, 9, 9});
            SortUtils2.bubble(arr8.getArr());

            System.out.println(Arrays.toString(arr8.getArr()));

            SortUtils2 arr9 = new SortUtils2(new int[]{});
            SortUtils2.bubble(arr9.getArr());

            System.out.println(Arrays.toString(arr9.getArr()));

            SortUtils2 arr10 = new SortUtils2(new int[]{6, 5, 4, 3, 2, 1});
            SortUtils2.bubble(arr10.getArr());

            System.out.println(Arrays.toString(arr10.getArr()));


    }
}



