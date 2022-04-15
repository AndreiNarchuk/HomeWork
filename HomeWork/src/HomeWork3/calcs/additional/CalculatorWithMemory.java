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
	10.7 Создать класс CalculatorWithMemoryMain в котором будет точка входа (main метод). В main методе требуется создать экземпляр калькулятора
	 и используя методы из данного экземпляра посчитать выражения из задания 1. Вывести в консоль результат. В мэйне запрещается использование
	 переменных для хранения значений участвующих в просчёте, а также результатов работы методов калькулятора, можно использовать только литералы
	 и метод получения из памяти записанного значения.

     */

    ICalculator iCalculator;
    public long counter;

    public CalculatorWithMemory(ICalculator iCalculator) {
        this.iCalculator = iCalculator;
    }

    public double times(double a, double b) {
        counter++;
        return iCalculator.times(a, b);
    }

    public double div(double a, double b) {
        counter++;
        return iCalculator.div(a, b);
    }

    public double plus(double a, double b) {
        counter++;
        return iCalculator.plus(a, b);
    }

    public double minus(double a, double b) {
        counter++;
        return iCalculator.minus(a, b);
    }

    public double pow(double a, int b) {
        counter++;
        return iCalculator.pow(a, b);
    }

    public double abs(double a) {
        counter++;
        return iCalculator.abs(a);
    }

    public double sqrt(double a) {
        counter++;
        return iCalculator.sqrt(a);
    }

    public long getCountOperation() {
        return counter;
    }
}
