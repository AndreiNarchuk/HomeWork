package HomeWork2.test;

import HomeWork2.utils.SortUtils2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static HomeWork2.utils.SortUtils2.bubble;
import static HomeWork2.utils.SortUtils2.shake;

class SortUtilsTest {


    @Test
    public void bubbleSort_Test() {

        SortUtils2 arr1 = new SortUtils2(new int[]{1,2,3,4,5,6});
        int[] result1 = {1,2,3,4,5,6};
        bubble(arr1.getArr());
        Assertions.assertArrayEquals(result1, arr1.getArr());

        SortUtils2 arr2 = new SortUtils2(new int[]{1,1,1,1});
        int[] result2 = new int[]{1,1,1,1};
        bubble(arr2.getArr());
        Assertions.assertArrayEquals(result2, arr2.getArr());

        SortUtils2 arr3 = new SortUtils2(new int[]{9,1,5,99,9,9});
        int[] result3 = {1,5,9,9,9,99};
        bubble(arr3.getArr());
        Assertions.assertArrayEquals(result3,arr3.getArr());

        SortUtils2 arr4 = new SortUtils2(new int[]{});
        int[] result4 = {};
        bubble(arr4.getArr());
        Assertions.assertArrayEquals(result4,arr4.getArr());

        SortUtils2 arr5 = new SortUtils2(new int[]{6,5,4,3,2,1});
        int[] result5 = {1,2,3,4,5,6};
        bubble(arr5.getArr());
        Assertions.assertArrayEquals(result5,arr5.getArr());

        SortUtils2 arr6 = new SortUtils2(new int[]{200,100,50,-3,12,1});
        int[] result6 = {-3,1,12,50,100,200};
        bubble(arr6.getArr());
        Assertions.assertArrayEquals(result6,arr6.getArr());

        SortUtils2 arr7 = new SortUtils2(new int[]{-9,-7545,0,1,-13,3, 77, -1, 8579});
        int[] result7 = {-7545, -13, -9, -1, 0, 1, 3, 77, 8579};
        bubble(arr7.getArr());
        Assertions.assertArrayEquals(result7,arr7.getArr());
    }
    @Test
    public void shakeSort_Test() {

        SortUtils2 arr1 = new SortUtils2(new int[]{1,2,3,4,5,6});
        int[] result1 = {1,2,3,4,5,6};
        shake(result1);
        Assertions.assertArrayEquals(result1,arr1.getArr());

        SortUtils2 arr2 = new SortUtils2(new int[]{1,1,1,1});
        int[] result2 = {1,1,1,1};
        shake(arr2.getArr());
        Assertions.assertArrayEquals(result2, arr2.getArr());

        SortUtils2 arr3 = new SortUtils2(new int[]{9,1,5,99,9,9});
        int[] result3 = {1,5,9,9,9,99};
        shake(arr3.getArr());
        Assertions.assertArrayEquals(result3,arr3.getArr());

        SortUtils2 arr4 = new SortUtils2(new int[]{});
        int[] result4 = {};
        shake(arr4.getArr());
        Assertions.assertArrayEquals(result4,arr4.getArr());

        SortUtils2 arr5 = new SortUtils2(new int[]{6,5,4,3,2,1});
        int[] result5 = {1,2,3,4,5,6};
        shake(arr5.getArr());
        Assertions.assertArrayEquals(result5,arr5.getArr());

        SortUtils2 arr6 = new SortUtils2(new int[]{200,100,50,-3,12,1});
        int[] result6 = {-3,1,12,50,100,200};
        shake(arr6.getArr());
        Assertions.assertArrayEquals(result6,arr6.getArr());

        SortUtils2 arr7 = new SortUtils2(new int[]{-9,-7545,0,1,-13,3, 77, -1, 8579});
        int[] result7 = {-7545, -13, -9, -1, 0, 1, 3, 77, 8579};
        shake(arr7.getArr());
        Assertions.assertArrayEquals(result7,arr7.getArr());
    }

}
