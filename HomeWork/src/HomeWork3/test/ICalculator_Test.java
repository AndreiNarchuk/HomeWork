package HomeWork3.test;

import HomeWork3.calcs.additional.CalculatorWithCounterAutoDecorator;
import HomeWork3.calcs.additional.CalculatorWithCounterAutoSuper;
import HomeWork3.calcs.additional.CalculatorWithCounterClassic;
import HomeWork3.calcs.additional.CalculatorWithMemoryDecorator;
import HomeWork3.calcs.api.ICalculator;
import HomeWork3.calcs.simple.CalculatorWithMathCopy;
import HomeWork3.calcs.simple.CalculatorWithMathExtends;
import HomeWork3.calcs.simple.CalculatorWithOperator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ICalculator_Test {
    @Test
    public void WithCalculatorWithOperator_Test() {
        ICalculator calc = new CalculatorWithOperator();
        double result = 4.1 + 15 * 7 + Math.pow((28d / 5d),2);
        double div = calc.div(28, 5);
        double pow = calc.pow(div, 2);
        double multi = calc.times(15, 7);
        double add = calc.plus(pow, multi);
        double resultMethod = calc.plus(4.1, add);
        Assertions.assertEquals(result, resultMethod);
    }

    @Test
    public void WithCalculatorWithMathCopy_Test() {
        ICalculator calc = new CalculatorWithMathCopy();
        double result = 4.1 + 15 * 7 + Math.pow((28d / 5d),2);
        double div = calc.div(28, 5);
        double pow = calc.pow(div, 2);
        double multi = calc.times(15, 7);
        double add = calc.plus(pow, multi);
        double resultMethod = calc.plus(4.1, add);
        Assertions.assertEquals(result, resultMethod);
    }

    @Test
    public void calculateWithCalculatorWithMathExtends() {
        ICalculator calc = new CalculatorWithMathExtends();
        double resultExp = 4.1 + 15 * 7 + Math.pow((28d / 5d),2);
        double div = calc.div(28, 5);
        double pow = calc.pow(div, 2);
        double multi = calc.times(15, 7);
        double add = calc.plus(pow, multi);
        double resultMethod = calc.plus(4.1, add);
        Assertions.assertEquals(resultExp, resultMethod);
    }

    @Test
    public void calculateWithCalculatorWithCounterClassic() {
        ICalculator calc = new CalculatorWithCounterClassic();
        double resultExp = 4.1 + 15 * 7 + Math.pow((28d / 5d),2);
        double div = calc.div(28, 5);
        double pow = calc.pow(div, 2);
        double multi = calc.times(15, 7);
        double add = calc.plus(pow, multi);
        double resultMethod = calc.plus(4.1, add);
        Assertions.assertEquals(resultExp, resultMethod);
    }

    @Test
    public void calculateWithCalculatorWithCounterAutoSuper() {
        ICalculator calc = new CalculatorWithCounterAutoSuper();
        double result = 4.1 + 15 * 7 + Math.pow((28d / 5d),2);
        double div = calc.div(28, 5);
        double pow = calc.pow(div, 2);
        double multi = calc.times(15, 7);
        double add = calc.plus(pow, multi);
        double resultMethod = calc.plus(4.1, add);
        Assertions.assertEquals(result, resultMethod);
    }

    @Test
    public void calculateWithCalculatorWithCounterAutoDecorator() {
        ICalculator calc = new CalculatorWithCounterAutoDecorator(new CalculatorWithOperator());
        double result = 4.1 + 15 * 7 + Math.pow((28d / 5d),2);
        double div = calc.div(28, 5);
        double pow = calc.pow(div, 2);
        double multi = calc.times(15, 7);
        double add = calc.plus(pow, multi);
        double resultMethod = calc.plus(4.1, add);
        Assertions.assertEquals(result, resultMethod);
    }

    @Test
    public void calculateWithCalculatorWithMemoryDecorator() {
        ICalculator calc = new CalculatorWithMemoryDecorator(new CalculatorWithMathCopy());
        double resultExp = 4.1 + 15 * 7 + Math.pow((28d / 5d),2);
        double div = calc.div(28, 5);
        double pow = calc.pow(div, 2);
        double multi = calc.times(15, 7);
        double add = calc.plus(pow, multi);
        double resultMethod = calc.plus(4.1, add);
        Assertions.assertEquals(resultExp, resultMethod);
    }
}
