package HomeWork3.runners;

public class WithoutCalculatorMain {
    public static void main(String[] args) {
        /*
        1.1 посчитать следующие выражение: 4.1 + 15 * 7 + (28 / 5) ^ 2 = 4.1 + 105 + 31.36 = 140.46
         */
        double a = 4.1;
        double b = 15;
        double c = 7;
        double d = 28;
        double e = 5;
        double f = 2;
        double equals;

        equals = (a + b * c + Math.pow( d/e, f));

        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = "+ equals);

    }

}
