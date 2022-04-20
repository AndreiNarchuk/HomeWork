package HomeWork3.calcs.simple;


import HomeWork3.calcs.api.ICalculator;

public class CalculatorWithMathCopy implements ICalculator {
        /*
        3. Все методы объявленные в данном классе НЕ статические (не имеют модификатор static).
        Методы pow, abs, sqrt должны содержать в своём теле вызов библиотеки Math и возврат полученного результата.
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
       return Math.pow(a, b);
    }

    /**
     * Возвращает модуль переданного аргумента типа double.
     * @param a аргумент;
     * @return значение модуля аргумента.
     */
    public double abs(double a) {

        return Math.abs(a);
    }

    /**
     *Возвращает значение квадратного корня из аргумента типа double.
     * @param a значение аргумента типа double;
     * @return квадратный корень из переданного аргумента.
     */
    public double sqrt(double a) {
        return Math.sqrt(a);
    }

   }
