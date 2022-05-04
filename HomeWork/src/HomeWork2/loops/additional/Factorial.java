package HomeWork2.loops.additional;

public class Factorial {


    public static String Factorial(String line) {
        for (int i = 0; i < line.length(); i++) {
            char q = line.charAt(i);
            if (!Character.isDigit(q)) {
                return "Тут похоже ошибка ввода данных, введите положительный целочисленный аргумент!";
            } else continue;
        }
        int number = Integer.parseInt(line);

        if (number == 0 || number == 1) {
            return number + " = 1";
        }
        if (number < 16) {
            StringBuilder resultStr = new StringBuilder();
            long result = 1;
            for (int i = 1; i < number; i++) {
                if (i <number) {
                    resultStr.append(i + " * ");
                }
                if (i == number-1) {
                    resultStr.append((i+1) + " = ");
                }
                result *= (i + 1);
            }
            return resultStr.toString() + result;
        }
        return "Ошибка ввода данных. Необходимо ввести меньший аргумент!";
    }
}
