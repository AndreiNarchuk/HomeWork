package HomeWork3.calcs.additional;

import HomeWork3.calcs.api.ICalculator;

public class CalculatorWithMemoryDecorator implements ICalculator {
    /*
   11
	*/
    private int counter;
    private double memory;
    private double temporaryMemory;

    ICalculator iCalculator;

    public CalculatorWithMemoryDecorator(ICalculator iCalculator) {
        this.iCalculator = iCalculator;
    }

    public ICalculator getiCalculator() {
        return iCalculator;
    }

    /**
     * Возвращает временно сохраненное в памяти значение выполненного математического действия, результат которого присвоен полю temporaryMemory и присваивает полю memory значение 0.
     * @return temporaryMemory - double
     */
    public double getMemory() {
        temporaryMemory = memory;
        memory=0;
        return temporaryMemory;
    }

    /**
     * Возвращает значение текущего математического действия, результат которого присвоен полю memory и переопределяет поле temporaryMemory.
     * @return
     */
    public double memorization() {
        memory = temporaryMemory;
        return temporaryMemory;
    }

    /**
     * Возвращает произведение аргументов типа double, исользуя объект CalculatorWithOperator.
     * @param a первый множитель double
     * @param b второй множитель double
     * @return произведение
     */
    public double times(double a, double b) {
        temporaryMemory = iCalculator.times(a, b);
        return temporaryMemory;
    }

    /**
     * Возвращает частное двух аргументов типа double, исользуя объект CalculatorWithOperator.
     * @param a делимое double
     * @param b делитель double
     * @return частное
     */
    public double div(double a, double b) {
        temporaryMemory = iCalculator.div(a, b);
        return temporaryMemory;
    }

    /**
     * Возвращает сумму предаваемых аргументов типа double, исользуя объект CalculatorWithOperator.
     * @param  a первый аргумент double
     * @param  b второй аргумент double
     * @return summa (double)
     */
    public double plus(double a, double b) {

        temporaryMemory = iCalculator.plus(a, b);
        return temporaryMemory;
    }

    /**
     * Возвращает разность предаваемых аргументов типа double, исользуя объект CalculatorWithOperator.
     * @param a уменьшаемый аргумент double
     * @param b вычитаемый аргумент double
     * @return разность (double)
     */
    public double minus(double a, double b) {
        temporaryMemory = iCalculator.minus(a, b);
        return temporaryMemory;
    }

    /**
     * Возвращает значение возведенного аргумена а типа double в целочисленную степень типа int, исользуя объект CalculatorWithOperator.
     * @param a возводимый аргумент
     * @param b степень возведения типа int
     * @return аргумент в заданной степени
     */
    public double pow(double a, int b) {

        temporaryMemory = iCalculator.pow(a, b);
        return temporaryMemory;
    }

    /**
     * Возвращает модуль переданного аргумента типа double, исользуя объект CalculatorWithOperator.
     * @param a аргумент;
     * @return значение модуля аргумента.
     */
    public double abs(double a) {

        temporaryMemory = iCalculator.abs(a);
        return temporaryMemory;
    }

    /**
     *Возвращает значение квадратного корня из аргумента типа double с точностью до 14 знаков после запятой, исользуя объект CalculatorWithOperator.
     * @param a значение аргумента типа double;
     * @return квадратный корень из переданного аргумента с точностью до 14 знаков.
     */
    public double sqrt(double a) {

        temporaryMemory = iCalculator.sqrt(a);
        return temporaryMemory;
    }



}
