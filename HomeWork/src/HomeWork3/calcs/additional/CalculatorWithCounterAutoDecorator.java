package HomeWork3.calcs.additional;

import HomeWork3.calcs.api.ICalculator;

public class CalculatorWithCounterAutoDecorator implements ICalculator {
     /*
   11.
     */

    private long counter;
    private ICalculator iCalculator;


    public CalculatorWithCounterAutoDecorator(ICalculator iCalculator) {
        this.iCalculator = iCalculator;
    }

    public ICalculator getCalculator() {
        return this.iCalculator;
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
