package HomeWork3.calcs.additional;

import HomeWork3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterClassic extends CalculatorWithMathExtends {

    private long count;

    /*
    5. Создать класс CalculatorWithCounterClassic.
    В классе должен быть метод long getCountOperation() который должен возвращать количество использований данного калькулятора.
     */

    void incrementCountOperation() {
        count++;
    }

    /**
     * Счетчик использования методов, возвращает значение равное числу раз использования методов в классе CalculatorWithCounterClassic
     */
    public long getCountOperation() {
        return count;
    }

    @Override
    public double div(double a, double b) {
        incrementCountOperation();
        return a / b;
    }

    public double times(double a, double b) {
        incrementCountOperation();
        return a * b;
    }

    public double plus(double a, double b) {
        incrementCountOperation();
        return a + b;
    }

    public double minus(double a, double b) {
        incrementCountOperation();
        return a - b;
    }

    @Override
    public double abs(double a) {
        incrementCountOperation();
        return Math.abs(a);
    }

    @Override
    public double pow(double a, int powValue) {
        incrementCountOperation();
        return Math.pow(a, powValue);
    }

    @Override
    public double sqrt(double a) {
        incrementCountOperation();
        return Math.sqrt(a);
    }


}