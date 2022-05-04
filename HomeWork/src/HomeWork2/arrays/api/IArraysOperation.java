package HomeWork2.arrays.api;

public interface IArraysOperation {
    /**
     * Выводит все лементы массива
     * @param arr печатуемый массив
     */
    String allElements(int[] arr);

    /**
     * Выводит каждый второй элемент массива
     * @param arr массив каждый второй элемент которого печатуем
     */
    String everySecondElements(int [] arr);

    /**
     * Выводит элементы массива в обратном порядке
     * @param arr печатуемый массив
     */
    String reverseOrderElements(int [] arr);

}
