package HomeWork3.calcs.additional;

import HomeWork3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterAutoSuper extends CalculatorWithMathExtends {
    /*
    6. Создать класс CalculatorWithCounterAutoSuper.
     */

    private long counter;

    @Override
    public double pow(double a, int powValue) {
        counter++;
        return super.pow(a, powValue);
    }

    @Override
    public double abs(double a) {
        counter++;
        return super.abs(a);
    }

    @Override
    public double sqrt(double a) {
        counter++;
        return super.sqrt(a);
    }

    @Override
    public double plus(double a, double b) {
        counter++;
        return super.plus(a, b);
    }

    @Override
    public double minus(double a, double b) {
        counter++;
        return super.minus(a, b);
    }

    @Override
    public double div(double a, double b) {
        counter++;
        return super.div(a, b);
    }

    @Override
    public double times(double a, double b) {
        counter++;
        return super.times(a, b);
    }
    public final long getCountOperation(){
        return counter;
    }

    public CalculatorWithCounterAutoSuper(){
    }
}