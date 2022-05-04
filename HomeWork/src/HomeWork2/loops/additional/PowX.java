package HomeWork2.loops.additional;

import java.text.DecimalFormat;

public class PowX {
    /**
     * Получает две строки из цифр и возвращает отформатированную строку где первое число тиа float возводится в натуральную,
     * положительную степень, число типа int и результат возведения
     *
     * @param numberStr
     * @param degree
     * @return
     */
    public static String powX(String numberStr, String degree) {
        float number = 0;
        int index = 0;
        if (degree.matches("\\d+$")) {
            index = Integer.parseInt(degree);
        } else {
            return "Данные некорректны, введите положительную степень возведения!";
        }
        if (numberStr.matches("\\d+$") || numberStr.matches("\\d*[.,]\\d+$") || numberStr.matches("[-]\\d*[.,]\\d+$")) {
            number = Float.parseFloat(numberStr);
            float n = 1f;
            while (index > 0) {
                n *= number;
                index--;
            }
            return number + " ^ " + degree + " = " + new DecimalFormat("###,###,###,###,###.0##").format(n);
        } else {
            return "Введено не число, введите число возведимое в степень!";

        }
    }
}
