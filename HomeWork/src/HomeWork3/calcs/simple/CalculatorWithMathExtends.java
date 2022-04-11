package HomeWork3.calcs.simple;

public class CalculatorWithMathExtends extends CalculatorWithOperator {

    /*
    4. Класс должен наследовать класс CalculatorWithOperator.
    Базовые математические методы НЕ ДОЛЖНЫ быть объявлены напрямую в классе, а должны быть унаследованы.
    Должны содержать в своём теле вызов библиотеки Math и возврат полученного результата.

    */
    @Override
    public double pow(double a, int powValue) {
        return Math.pow(a, powValue);
    }

    @Override
    public double abs(double a) {
        return Math.abs(a);
    }

    @Override
    public double sqrt(double a) {
        return Math.sqrt(a);
    }

    @Override
    public double plus(double a, double b) {
        return super.plus(a, b);
    }

    @Override
    public double minus(double a, double b) {
        return super.minus(a, b);
    }

    @Override
    public double div(double a, double b) {
        return super.div(a, b);
    }

    @Override
    public double times(double a, double b) {
        return super.times(a, b);
    }
}
