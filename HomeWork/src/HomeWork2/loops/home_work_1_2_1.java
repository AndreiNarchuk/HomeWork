package HomeWork2.loops;

import java.text.DecimalFormat;

public class home_work_1_2_1 {
    public static void main(String[] args) {
        for (String arg : args) {
            System.out.println("Введен аргумент: " + arg);
            System.out.println(numChek(arg));
            if (numChek(arg) == " ") {
                char[] array = arg.toCharArray();

                if (array.length > 0) {
                    int x = 1;
                    for (int i = 0; i < array.length; i++) {

                        if (i == (array.length - 1)) {
                            System.out.print(String.valueOf(array[i]) + " = ");
                        }
                        if (i != (array.length - 1)) {
                            System.out.print(String.valueOf(array[i]) + " * ");
                        }

                        x = Integer.parseInt(String.valueOf(array[i])) * x;
                        if (x <= 0) {
                            System.out.println("Ошибка ввода данных");
                            System.out.println("Произошло переполнение введите иной аргумент");
                        }
                    }
                    System.out.println(new DecimalFormat("###,###,###,###,###").format(x));

                }

            }
        }

    }

    private static String numChek(String s) {
        String a;
        if (s.matches("\\d*+$")) {
            return " ";
        } else if (s.matches("\\d*[.,]\\d+$")) {
            a = "Введен дробный аргумент";
            return a;
        } else {
            a = "Введено не числовое значение";
            return a;
        }
    }
}








