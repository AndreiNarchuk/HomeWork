package HomeWork2.loops.arrays;

import static HomeWork2.loops.arrays.ArraysUtils.arrayFromConsole;

public class ArraysIteration {
    public static void main(String[] args) {
        int[] container;

        container = arrayFromConsole();

        allElements(container);
        System.out.println();

        everySecondElements(container);
        System.out.println();

        reverseOrderElements(container);
        System.out.println();
    }

        public static int[] allElements(int[] container) {
            int len;
            int i;
            String result;
            len = container.length;

            System.out.println("\n"+"Вывод всех элементов при помощи do....while");
            result = " ";
            i = 0;
            do {
                result += container[i] + " ";
                i++;

            } while (i < len);
            System.out.println("{"+result+"}");

            System.out.println("\n"+"Вывод всех элементов при помощи for");
            result = " ";
            for (i = 0; i < len; i++) {
                result += container[i] + " ";
            }
            System.out.println("{"+result+"}");

            System.out.println("\n"+"Вывод всех элементов при помощи while");
            result = " ";
            i = 0;
            while (i < len) {
                result += container[i] + " ";
                i++;
            }
            System.out.println("{"+result+"}");

            System.out.println("\n"+"Вывод всех элементов при помощи foreach");
            result = " ";
            for (int x : container) {
                result += x + " ";
            }
            System.out.println("{"+result+"}");
            return container;
        }

        public static int[] everySecondElements(int[] container) {
            int len2;
            int i = 0;
            String r;

            len2 = container.length;

            System.out.println("\n"+"Вывод каждого второго элемента при помощи for");
            r = " ";
            for (i = 1; i < len2; i += 2) {
                r += container[i] + " ";
            }
            System.out.println("{"+r+"}");

            System.out.println("\n"+"Вывод каждого второго элемента при помощи while");
            r = " ";
            i = 1;
            while (i < len2) {
                r += container[i] + " ";
                i += 2;
            }
            System.out.println("{"+r+"}");

            System.out.println("\n"+"Вывод каждого второго элемента при помощи do...while");
            r = " ";
            i = 1;
            do {
                r += container[i] + " ";
                i += 2;
            } while (i < len2);
            System.out.println("{"+r+"}");

            System.out.println("\n"+"Вывод каждого второго элемента при помощи foreach");
            r = " ";
            i = 0;
            for (int i1 : container) {
                if (i % 2 != 0) {
                    r += i1 + " ";
                }
                i++;
            }
            System.out.println("{"+r+"}");


            return container;
        }

        public static int[] reverseOrderElements(int[] container) {
            int len;
            int i = 0;
            String result;

            len = container.length;

            System.out.println("\n"+"Вывод в обратном порядке при помощи for");
            result = " ";
            for (i = len - 1; i >= 0; i--) {
                result += container[i] + " ";
            }
            System.out.println("{"+result+"}");

            System.out.println("\n"+"Вывод в обратном порядке при помощи while");
            result = " ";
            i = len - 1;
            while (i >= 0) {
                result += container[i] + " ";
                i--;
            }
            System.out.println("{"+result+"}");

            System.out.println("\n"+"Вывод в обратном порядке при помощи do...while");
            result = " ";
            i = len - 1;
            do {
                result += container[i] + " ";
                i--;
            } while (i >= 0);
            System.out.println("{"+result+"}");

            System.out.println("\n"+"Вывод в обратном порядке при помощи foreach");
            result = " ";
            for (int i1 : container) {
                result = " "+i1 + result;
            }
            System.out.println("{"+result+"}");

            return container;
        }


    }







