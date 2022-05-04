package HomeWork1.additional;

import HomeWork1.api.ICommunicationPrinter;

public class PhoneNumbers implements ICommunicationPrinter {

    @Override
    public String welcome(String arr) {

        char[] arg = arr.toCharArray();
        if ( !arr.matches("-?\\d+") || arg.length != 10) {
            return "Номер введен некорректно, повторите ввод";
        } else {
            return CreatePhoneNumber(arg);
        }
    }


    private final String CreatePhoneNumber(char[] arr) {

        for (int i = 0; i < arr.length; i++) {

        }
        String e = String.valueOf(arr[0]);
        String e1 = String.valueOf(arr[1]);
        String e2 = String.valueOf(arr[2]);
        String e3 = String.valueOf(arr[3]);
        String e4 = String.valueOf(arr[4]);
        String e5 = String.valueOf(arr[5]);
        String e6 = String.valueOf(arr[6]);
        String e7 = String.valueOf(arr[7]);
        String e8 = String.valueOf(arr[8]);
        String e9 = String.valueOf(arr[9]);

        String ex = "("+e+e1+e2+") "+e3+e4+e5+"-"+e6+e7+e8+e9;
        return ex;

    }
}
