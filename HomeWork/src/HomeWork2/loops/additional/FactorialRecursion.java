package HomeWork2.loops.additional;

public class FactorialRecursion {


    public static long factorial(long number) {
        if (number == 1 || number == 0) {
            return 1;
        }
        long x = number * factorial(number - 1);
        return x;
    }

    public static String fact(String line) {
        for (int i = 0; i < line.length(); i++) {
            char q = line.charAt(i);
            if (!Character.isDigit(q)) {
                return "Тут похоже ошибка ввода данных, введите положительный целочисленный аргумент!";
            }
        }
//        if (!line.matches("-?\\d+")) {
//            return "Тут похоже ошибка ввода данных, введите положительный целочисленный аргумент!";
//        }
        long number = Long.parseLong(line);
        long factor = factorial(number);
        if (number > 21) {
            return "Ошибка ввода данных. Необходимо ввести меньший аргумент!";
        } if (number == 0) {
            return "0 = 1";
        }
        if (number < 21) {
            StringBuilder resultString = new StringBuilder();

            for (; number != 0; number--) {

                if (number != 1) {
                    resultString.append(number + " * ");
                }
                if (number == 1) {
                    resultString.append(number + " = ");
                }
            }
            return resultString.toString() + factor;
        }
        return null;
    }
}
