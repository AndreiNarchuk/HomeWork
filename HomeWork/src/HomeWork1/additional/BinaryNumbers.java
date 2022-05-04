package HomeWork1.additional;

public class BinaryNumbers {

    public static String BinaryNumbers(byte number) {

        String b = "";
        int[] x;
        x = new int[8];
        if (number > 0) {
            for (int i = x.length - 1; i >= 0; i--) {
                x[i] = number % 2;
                number /= 2;
            }
        } else if (number == 0) {
            return "00000000";
        } else {
            number = (byte) (128 - Math.abs(number));
            for (int i = x.length - 1; i >= 0; i--) {
                x[i] = number % 2;
                number /= 2;
            }
            x[0] = 1;
        }
        for (int i = 0; i < x.length; i++) {
            b += x[i];
        }
        return b;
    }
}

