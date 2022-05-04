package HomeWork2.loops.additional;

import java.util.Arrays;

public class OverflowEx {


    public static String maxMax(long num) {
        long a = 1;

        if (num < 0 && num != -1) {
            int i = 0;
            for (; a <= Long.MAX_VALUE & a * Math.abs(num) > 0; ) {
                a = a * Math.abs(num);
                i++;
            }
            if (i % 2 == 0) {
                long[] result = {a, (a * Math.abs(num))};
                return Arrays.toString(result);
            } else {
                long[] result = {-a, (-a * Math.abs(num))};
                return Arrays.toString(result);
            }
        }
        if (num > 0 && num != 1) {
            for (; a <= Long.MAX_VALUE & a * num > 0; ) {
                a = a * num;
            }
            long[] result = {a, (a * Math.abs(num))};
            return Arrays.toString(result);
        }
        if (num == -1 || num == 1 ||num == 0) {
            return "Бесконечность не предел!";
        }
        return null;
    }
}
