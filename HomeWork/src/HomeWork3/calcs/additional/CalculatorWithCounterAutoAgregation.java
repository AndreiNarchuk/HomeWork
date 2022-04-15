package HomeWork3.calcs.additional;

import HomeWork3.calcs.simple.CalculatorWithMathCopy;
import HomeWork3.calcs.simple.CalculatorWithMathExtends;
import HomeWork3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoAgregation {

    /*
      7.3 Внутри класса CalculatorWithCounterAutoAgregation нельзя создавать объекты (использовать new), можно пользоваться только тем что передали
          7.3.1 В данном классе должны быть следующие варианты конструктора:
               7.3.1.1 Принимающий объект типа CalculatorWithOperator
               7.3.1.2 Принимающий объект типа CalculatorWithMathCopy
               7.3.1.3 Принимающий объект типа CalculatorWithMathExtends
    */

    private long counter;

    CalculatorWithOperator calc1;
    CalculatorWithMathCopy calc2;
    CalculatorWithMathExtends calc3;

    public CalculatorWithCounterAutoAgregation(CalculatorWithOperator calc1, CalculatorWithMathCopy calc2, CalculatorWithMathExtends calc3) {
        this.calc2 = calc2;
        this.calc3 = calc3;
        this.calc1 = calc1;
    }

    public double times(double a, double b) {
        counter++;
        if (calc1 != null) {
            return calc1.times(a, b);
        } else if (calc2 != null) {
            return calc2.times(a, b);
        } else {
            return calc3.times(a, b);
        }
    }

    public double div(double a, double b) {
        counter++;
        if (calc1 != null) {
            return calc1.div(a, b);
        } else if (calc2 != null) {
            return calc2.div(a, b);
        } else {
            return calc3.div(a, b);
        }
    }

    public double plus(double a, double b) {
        counter++;
        if (calc1 != null) {
            return calc1.plus(a, b);
        } else if (calc2 != null) {
            return calc2.plus(a, b);
        } else {
            return calc3.plus(a, b);
        }
    }

    public double minus(double a, double b) {
        counter++;
        if (calc1 != null) {
            return calc1.minus(a, b);
        } else if (calc2 != null) {
            return calc2.minus(a, b);
        } else {
            return calc3.minus(a, b);
        }
    }

    public double pow(double a, int b) {
        counter++;
        if (calc1 != null) {
            return calc1.pow(a, b);
        } else if (calc2 != null) {
            return calc2.pow(a, b);
        } else {
            return calc3.pow(a, b);
        }
    }

    public double abs(double a) {
        counter++;
        if (calc1 != null) {
            return calc1.abs(a);
        } else if (calc2 != null) {
            return calc2.abs(a);
        } else {
            return calc3.abs(a);
        }
    }

    public double sqrt(double a) {
        counter++;
        if (calc1 != null) {
            return calc1.sqrt(a);
        } else if (calc2 != null) {
            return calc2.sqrt(a);
        } else {
            return calc3.sqrt(a);
        }
    }

    public long getCountOperation() {
        return counter;
    }
}


