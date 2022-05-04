package HomeWork2.test;

import HomeWork2.arrays.DoWhileOperation;
import HomeWork2.arrays.ForEachOperation;
import HomeWork2.arrays.ForOperation;
import HomeWork2.arrays.WhileOperation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class arrays_Test {

    @Test
    public void allElements_Test() {
        DoWhileOperation doWhileOperation = new DoWhileOperation();

        String result1 = doWhileOperation.allElements(new int[]{3, 11, 14, 10, 59, -1, 10000, 0, 1});
        String result2 = doWhileOperation.allElements(new int[]{0, 00, 15, 10, -59, -1, 39});
        String result3 = doWhileOperation.allElements(new int[]{0});

        Assertions.assertEquals("3 11 14 10 59 -1 10000 0 1 ", result1);
        Assertions.assertEquals("0 0 15 10 -59 -1 39 ", result2);
        Assertions.assertEquals("0 ", result3);

        WhileOperation whileOperation = new WhileOperation();

        String result4 = whileOperation.allElements(new int[]{3, 11, 14, 10, 59, -1, 10000, 0, 1});
        String result5 = whileOperation.allElements(new int[]{0, 00, 15, 10, -59, -1, 39});
        String result6 = whileOperation.allElements(new int[]{0});

        Assertions.assertEquals("3 11 14 10 59 -1 10000 0 1 ", result4);
        Assertions.assertEquals("0 0 15 10 -59 -1 39 ", result5);
        Assertions.assertEquals("0 ", result6);

        ForOperation forOperation = new ForOperation();

        String result7 = forOperation.allElements(new int[]{3, 11, 14, 10, 59, -1, 10000, 0, 1});
        String result8 = forOperation.allElements(new int[]{0, 00, 15, 10, -59, -1, 39});
        String result9 = forOperation.allElements(new int[]{0});

        Assertions.assertEquals("3 11 14 10 59 -1 10000 0 1 ", result7);
        Assertions.assertEquals("0 0 15 10 -59 -1 39 ", result8);
        Assertions.assertEquals("0 ", result9);

        ForEachOperation forEachOperation = new ForEachOperation();

        String result10 = forEachOperation.allElements(new int[]{3, 11, 14, 10, 59, -1, 10000, 0, 1});
        String result11 = forEachOperation.allElements(new int[]{0, 00, 15, 10, -59, -1, 39});
        String result12 = forEachOperation.allElements(new int[]{0});

        Assertions.assertEquals("3 11 14 10 59 -1 10000 0 1 ", result10);
        Assertions.assertEquals("0 0 15 10 -59 -1 39 ", result11);
        Assertions.assertEquals("0 ", result12);
    }

    @Test
    public void everySecondElements_Test() {
        DoWhileOperation doWhileOperation = new DoWhileOperation();

        String result1 = doWhileOperation.everySecondElements(new int[]{3, 11, 14, 10, 59, -1, 10000, 0, 1});
        String result2 = doWhileOperation.everySecondElements(new int[]{0, 00, 15, 10, -59, -1, 39});
        String result3 = doWhileOperation.everySecondElements(new int[]{0});

        Assertions.assertEquals("11 10 -1 0 ", result1);
        Assertions.assertEquals("0 10 -1 ", result2);
        Assertions.assertEquals("", result3);

        WhileOperation whileOperation = new WhileOperation();

        String result4 = whileOperation.everySecondElements(new int[]{3, 11, 14, 10, 59, -1, 10000, 0, 1});
        String result5 = whileOperation.everySecondElements(new int[]{0, 00, 15, 10, -59, -1, 39});
        String result6 = whileOperation.everySecondElements(new int[]{0});

        Assertions.assertEquals("11 10 -1 0 ", result4);
        Assertions.assertEquals("0 10 -1 ", result5);
        Assertions.assertEquals("", result6);

        ForOperation forOperation = new ForOperation();

        String result7 = forOperation.everySecondElements(new int[]{3, 11, 14, 10, 59, -1, 10000, 0, 1});
        String result8 = forOperation.everySecondElements(new int[]{0, 00, 15, 10, -59, -1, 39});
        String result9 = forOperation.everySecondElements(new int[]{0});

        Assertions.assertEquals("11 10 -1 0 ", result7);
        Assertions.assertEquals("0 10 -1 ", result8);
        Assertions.assertEquals("", result9);

        ForEachOperation forEachOperation = new ForEachOperation();

        String result10 = forEachOperation.everySecondElements(new int[]{3, 11, 14, 10, 59, -1, 10000, 0, 1});
        String result11 = forEachOperation.everySecondElements(new int[]{0, 00, 15, 10, -59, -1, 39});
        String result12 = forEachOperation.everySecondElements(new int[]{0});

        Assertions.assertEquals("11 10 -1 0 ", result10);
        Assertions.assertEquals("0 10 -1 ", result11);
        Assertions.assertEquals("", result12);
    }

    @Test
    public void reverseOrderElements_Test() {
        DoWhileOperation doWhileOperation = new DoWhileOperation();

        String result1 = doWhileOperation.reverseOrderElements(new int[]{3, 11, 14, 10, 59, -1, 10000, 0, 1});
        String result2 = doWhileOperation.reverseOrderElements(new int[]{0, 00, 15, 10, -59, -1, 39});
        String result3 = doWhileOperation.reverseOrderElements(new int[]{0});

        Assertions.assertEquals("1 0 10000 -1 59 10 14 11 3 ", result1);
        Assertions.assertEquals("39 -1 -59 10 15 0 0 ", result2);
        Assertions.assertEquals("0 ", result3);

        WhileOperation whileOperation = new WhileOperation();

        String result4 = whileOperation.reverseOrderElements(new int[]{3, 11, 14, 10, 59, -1, 10000, 0, 1});
        String result5 = whileOperation.reverseOrderElements(new int[]{0, 00, 15, 10, -59, -1, 39});
        String result6 = whileOperation.reverseOrderElements(new int[]{0});

        Assertions.assertEquals("1 0 10000 -1 59 10 14 11 3 ", result4);
        Assertions.assertEquals("39 -1 -59 10 15 0 0 ", result5);
        Assertions.assertEquals("0 ", result6);

        ForOperation forOperation = new ForOperation();

        String result7 = forOperation.reverseOrderElements(new int[]{3, 11, 14, 10, 59, -1, 10000, 0, 1});
        String result8 = forOperation.reverseOrderElements(new int[]{0, 00, 15, 10, -59, -1, 39});
        String result9 = forOperation.reverseOrderElements(new int[]{0});

        Assertions.assertEquals("1 0 10000 -1 59 10 14 11 3 ", result7);
        Assertions.assertEquals("39 -1 -59 10 15 0 0 ", result8);
        Assertions.assertEquals("0 ", result9);

        ForEachOperation forEachOperation = new ForEachOperation();

        String result10 = forEachOperation.reverseOrderElements(new int[]{3, 11, 14, 10, 59, -1, 10000, 0, 1});
        String result11 = forEachOperation.reverseOrderElements(new int[]{0, 00, 15, 10, -59, -1, 39});
        String result12 = forEachOperation.reverseOrderElements(new int[]{0});

        Assertions.assertEquals("1 0 10000 -1 59 10 14 11 3 ", result10);
        Assertions.assertEquals("39 -1 -59 10 15 0 0 ", result11);
        Assertions.assertEquals("0 ", result12);
    }

}


