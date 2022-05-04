package HomeWork2.loops.additional;

import java.text.DecimalFormat;

public class MultiplyNumbers {
    public  static String multiNumbers (String[] args){
        for (String arg : args) {
            if (arg.matches("\\d*+$")) {

                char[] array = arg.toCharArray(); //Элемент строки разбиваем на массив символов
                if (array.length > 0) {
                    int x = 1;
                    StringBuilder resultString = new StringBuilder();
                    for (int i = 0; i < array.length; i++) { //Перебираем все элементы массива из символов строки

                        if (i == (array.length - 1)) {
                            resultString.append(String.valueOf(array[i]) + " = ");
                        }
                        if (i != (array.length - 1)) {
                            resultString.append(String.valueOf(array[i]) + " * ");
                        }
                        x = Integer.parseInt(String.valueOf(array[i])) * x;
                        if (x <= 0) {
                           return "Произошло переполнение введите иной аргумент";
                        }
                    }
                    String xPattern = new DecimalFormat("###,###,###,###,###").format(x);
                    return resultString + xPattern;
                }
            }
            if (arg.matches("[-]\\d*+$")) {

                char[] array = arg.toCharArray(); //Элемент строки разбиваем на массив символов
                if (array.length > 1) {
                    int x = 1;
                    StringBuilder resultString = new StringBuilder();
                    for (int i = 1; i < array.length; i++) { //Перебираем все элементы массива из символов строки

                        if (i == (array.length - 1)) {
                            resultString.append(String.valueOf(array[i]) + " = ");
                        }
                        if (i != (array.length - 1)) {
                            resultString.append(String.valueOf(array[i]) + " * ");
                        }
                        x = Integer.parseInt(String.valueOf(array[i])) * x;
                        if (x <= 0) {
                            return "Произошло переполнение введите иной аргумент";
                        }
                    }
                    String xPattern = new DecimalFormat("###,###,###,###,###").format(x*-1);
                    return "-"+resultString + xPattern;
                }
            }
            if (arg.matches("\\d*[.,]\\d+$")) {
                return "Введено не целое число";

            }
        }
        return  "Введено не число";
    }
}


