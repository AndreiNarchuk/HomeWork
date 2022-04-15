package HomeWork3.calcs.additional;


import HomeWork3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoComposite {
    /*
    7. Создать класс CalculatorWithCounterAutoComposite
     */
    private long counter;
    CalculatorWithOperator calc = new CalculatorWithOperator();

    /**
     * Возвращает сумму предаваемых аргументов типа double, исользуя объект CalculatorWithOperator.
     * @param  a первый аргумент double
     * @param  b второй аргумент double
     * @return summa (double)
     */
    public double plus(double a, double b) {
        counter++;
        return calc.plus(a, b);
    }

    /**
     * Возвращает разность предаваемых аргументов типа double, исользуя объект CalculatorWithOperator.
     * @param a уменьшаемый аргумент double
     * @param b вычитаемый аргумент double
     * @return разность (double)
     */
    public double minus(double a, double b) {
        counter++;
        return calc.minus(a, b);

    }
    /**
     * Возвращает частное двух аргументов типа double, исользуя объект CalculatorWithOperator.
     * @param a делимое double
     * @param b делитель double
     * @return частное
     */
    public double div(double a, double b) {
        counter++;
        return calc.div(a, b);
    }

    /**
     * Возвращает произведение аргументов типа double, исользуя объект CalculatorWithOperator.
     * @param a первый множитель double
     * @param b второй множитель double
     * @return произведение
     */
    public double times(double a, double b) {
        counter++;
        return calc.times(a, b);
    }

    /**
     * Возвращает модуль переданного аргумента типа double, исользуя объект CalculatorWithOperator.
     * @param a аргумент;
     * @return значение модуля аргумента.
     */
    public double abs(double a, double b) {
        counter++;
        return calc.abs(a);
    }

    /**
     *Возвращает значение квадратного корня из аргумента типа double с точностью до 14 знаков после запятой, исользуя объект CalculatorWithOperator.
     * @param a значение аргумента типа double;
     * @return квадратный корень из переданного аргумента с точностью до 14 знаков.
     */
    public double sqrt(double a, double b) {
        counter++;
        return calc.sqrt(a);
    }

    /**
     * Возвращает значение возведенного аргумена а типа double в целочисленную степень типа int, исользуя объект CalculatorWithOperator.
     * @param a возводимый аргумент
     * @param b степень возведения типа int
     * @return аргумент в заданной степени
     */
    public double pow(double a, int b) {
        counter++;
        return calc.pow(a, b);
    }
    public long getCountOperation(){
        return counter;
    }
}
