package HomeWork3.calcs.additional;

import HomeWork3.calcs.api.ICalculator;

public class CalculatorWithMemory implements ICalculator {
    /*
    Создать CalculatorWithMemory используя аналогичные принципы построения класса CalculatorWithCounterAutoAgregationInterface.
	10.1 Данный калькулятор предназначен для того чтобы расширить возможности калькулятора и обеспечить его дополнительной функцией
	 памяти. В принципе работает как калькулятор из реальной жизни.
	10.2 Все методы объявленные в данном классе НЕ статические (не имеют модификатор static).
	10.3 В данном классе должен быть только конструктор принимающий объект типа ICalculator
	10.4 Данный класс напрямую не умеет считать математику, он умеет делегировать расчёт математики калькулятору который передали в конструктор
	10.5 В классе должны присутствовать математические методы:
		10.5.1 4 базовых математических метода (деление, умножение, вычитание, сложение).
		10.5.2 3 метода (Возведение в целую степень дробного положительного числа, Модуль числа, Корень из числа).
	10.6 Функция памяти работает через методы:
		10.6.1 Записать в память результат выполнения последнего вызванного метода. У данного метода не должно быть параметров. Данный
		метод вызывается непосредтвенно пользователем, а не автоматический.
		10.6.2 Получить из памяти записанное значение. При получении записи из памяти память стирается, при записи нового значения память
		перезаписывается. Данный метод вызывается непосредтвенно пользователем, а не автоматический.
	*/
    private int counter;
    private double memory;
    private double temporaryMemory;

    ICalculator iCalculator;

    public CalculatorWithMemory(ICalculator iCalculator) {
        this.iCalculator = iCalculator;
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
        counter++;
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
        counter++;
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
        counter++;
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
        counter++;
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
        counter++;
        temporaryMemory = iCalculator.pow(a, b);
        return temporaryMemory;
    }

    /**
     * Возвращает модуль переданного аргумента типа double, исользуя объект CalculatorWithOperator.
     * @param a аргумент;
     * @return значение модуля аргумента.
     */
    public double abs(double a) {
        counter++;
        temporaryMemory = iCalculator.abs(a);
        return temporaryMemory;
    }

    /**
     *Возвращает значение квадратного корня из аргумента типа double с точностью до 14 знаков после запятой, исользуя объект CalculatorWithOperator.
     * @param a значение аргумента типа double;
     * @return квадратный корень из переданного аргумента с точностью до 14 знаков.
     */
    public double sqrt(double a) {
        counter++;
        temporaryMemory = iCalculator.sqrt(a);
        return temporaryMemory;
    }

    public long getCountOperation() {
        return counter;
    }

}
