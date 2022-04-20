package HomeWork3.calcs.simple;

import HomeWork3.calcs.api.ICalculator;

public class CalculatorWithOperator implements ICalculator{
    /*
    2. Все методы объявленные в данном классе НЕ статические (не имеют модификатор static).
     */

    /**
     * Возвращает сумму предаваемых аргументов типа double.
     * @param  a первый аргумент double
     * @param  b второй аргумент double
     * @return summa (double)
     */
    public double plus(double a, double b) {
        return a + b;
    }

    /**
     * Возвращает разность предаваемых аргументов типа double.
     * @param a уменьшаемый аргумент double
     * @param b вычитаемый аргумент double
     * @return разность
     */
    public double minus(double a, double b) {

        return a - b;
    }

    /**
     * Возвращает частное двух аргументов типа double
     * @param a делимое double
     * @param b делитель double
     * @return частное
     */
    public double div(double a, double b) {

        return a / b;
    }

    /**
     * Возвращает произведение аргументов типа double
     * @param a первый множитель double
     * @param b второй множитель double
     * @return произведение
     */
    public double times(double a, double b) {
        return a * b;
    }

    /**
     * Возвращает значение возведенного аргумена а типа double в целочисленную степень типа int
     * @param a возводимый аргумент
     * @param b степень возведения типа int
     * @return аргумент в заданной степени
     */
    public double pow(double a, int b) {
        double result = 1;
        for (int i = 1; i <= b; i++) {
            result = result * a;
        }
        return result;
    }

    /**
     * Возвращает модуль переданного аргумента типа double.
     * @param a аргумент;
     * @return значение модуля аргумента.
     */
    public double abs(double a) {
        double b = (a <= 0.0F) ? 0.0F - a : a;
        return b;
    }

    /**
     *Возвращает значение квадратного корня из аргумента типа double с точностью до 14 знаков после запятой.
     * @param a значение аргумента типа double;
     * @return квадратный корень из переданного аргумента с точностью до 14 знаков.
     */
    public double sqrt(double a){
        sqrtNew(a);
        return a;
    }



    /**
     * Возвращает значение квадратного корня из числа с точностью до 14 знаков после запятой.
     * В методе используется конатенация цифр определенных в методе digit(long r2, long r1).
     * @param a значение аргумента;
     * @return квадратный корень из переданного аргумента.
     */
    public final static double sqrtNew(double a){

        long b = (long) (a * 10000);
        double c;
        double x = 1000000000000d;
        long result = 0;
        long rest;
        long y;
        long z;

        for (int j = 0; (j * j) <= b; j++) {
            result = j;
        }

        rest = (b - (result * result)) * 100;

        y = result;
        z = rest;
        for (int i = 0; i < 10; i++) {
            long res4;
            long res5 = digit(z, y);
            String q1 = (Long.toString(y * 2));
            String q2 = (Long.toString(res5));
            res4 = Long.parseLong(q1 + q2);
            String q3 = (Long.toString(y));
            String q4 = (Long.toString(res5));
            y = Long.parseLong(q3 + q4);
            z = (z - res4 * res5) * 100;
        }
        c = y / x;
        return c;
    }

    /**
     * Возвращает значение цифр (после запятой), при извлечении корня из остатка, после изввлеченияя целой части.
     * Используется как вспомогательный метод для метода sqrtNew.
     * @param r2 остаток после извлечения целочисленного значения квадратного корня из аргумента;
     * @param r1 целочисленное значение квадратного корня из заданного аргумента;
     * @return цифры после запятой.
     */
    public final static long digit(long r2, long r1) {
        long r3;
        long r5 = 0;

        for (int i = 0; i <= 11; i++) {
            String q1 = (Long.toString(r1 * 2));
            String q2 = (Long.toString(i));
            r3 = Long.parseLong(q1 + q2);
            if ((i <= 10) && (r3 * i > r2)) {
                long r4 = i - 1;
                return r4;
            } else if (i > 10) {
                return 0;
            }
        }
        return r5;
    }

    /*
    Второй метод извлечения корня sqrt2 работает, но он просто насилует оперативку и при попытке извлечь корень из 146459-это вечность!!!
    На что у первого метода уходит мгновение!!!!
     */
//    public static double sqrt2(double a){
//        double b = 0.000_1;
//        while (b * b <= a){
//            b += 0.000_1;
//            System.out.println(b);
//        }
//        return b;
//    }

}