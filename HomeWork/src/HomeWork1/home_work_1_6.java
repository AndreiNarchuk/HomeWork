package HomeWork1;

import java.util.Scanner;

public class home_work_1_6 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите цифры номера от 0 до 9: ");

        String arr;
        arr = console.nextLine();

        char[] arg = arr.toCharArray();
        if (arg.length != 10) {
            System.out.println("Номер введен некорректно, повторите ввод");

        } else {

            System.out.println(CreatePhoneNumber(arg));
        }
    }


    private static String CreatePhoneNumber(char[] arr) {

        for (int i = 0; i < arr.length; i++) {

        }
        String ex = ("(" + arr[0] + arr[1] + arr[2] + ") " + arr[3] + arr[4] + arr[5] + "-" + arr[6] + arr[7] + arr[8] + arr[9]);
        return ex;

        //String e = String.valueOf(arr[0]);
        //String e1 = String.valueOf(arr[1]);
        //String e2 = String.valueOf(arr[2]);
        //String e3 = String.valueOf(arr[3]);
        //String e4 = String.valueOf(arr[4]);
        //String e5 = String.valueOf(arr[5]);
        //String e6 = String.valueOf(arr[6]);
        //String e7 = String.valueOf(arr[7]);
        //String e8 = String.valueOf(arr[8]);
        //String e9 = String.valueOf(arr[9]);
        //String ex = "("+e+e1+e2+")  "+e3+e4+e5+"-"+e6+e7+e8+e9;
        //return ex;

    }
}


