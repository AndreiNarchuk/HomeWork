package HomeWork4.test;

import HomeWork4.AgeComparator;
import HomeWork4.DataContainer;
import HomeWork4.Humans;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class DataContainer_Test {

    @Test
    public void sortStringWithDataContainer_Test() {
        DataContainer<String> container = new DataContainer<>(new String[]{"Привет", "Как дела?", "Работаю", "Давай потом"});

        DataContainer.sort(container);

        Assertions.assertArrayEquals(new String[]{"Давай потом", "Как дела?", "Привет", "Работаю",}, container.getItems());
    }

    @Test
    public void addString_Test() {
        DataContainer<String> container = new DataContainer<>(new String[0]);

        String str1 = "Как дела?";
        int i = container.add(str1);

        Assertions.assertEquals(str1, container.get(i));
    }

    @Test
    public void addStrings_Test() {
        DataContainer<String> container = new DataContainer<>(new String[0]);

        String resultStr1 = "Как дела?";
        String resultStr2 = "Работаю";
        String resultStr3 = "Давай потом";

        int result1 = container.add(resultStr1);
        int result2 = container.add(resultStr2);
        int result3 = container.add(resultStr3);

        Assertions.assertEquals(resultStr1, container.get(result1));
        Assertions.assertEquals(resultStr2, container.get(result2));
        Assertions.assertEquals(resultStr3, container.get(result3));
    }

    @Test
    public void minusString_Test() {
        DataContainer<String> container = new DataContainer<>(new String[]{"Привет", "Как дела?", "Работаю", "Давай потом"});

        container.delete1("Как дела?");

        Assertions.assertArrayEquals(new String[]{"Привет", "Работаю", "Давай потом"}, container.getItems());
    }

    @Test
    public void indexElements_Test() {
        DataContainer<String> container = new DataContainer<>(new String[]{"Привет", "Как дела?", "Работаю", "Давай потом"});

        String text1 = container.get(0);

        Assertions.assertEquals("Привет", text1);
    }

    @Test
    public void dellIndexElements_Test() {
        DataContainer<String> container = new DataContainer<>(new String[]{"Привет", "Как дела?", "Работаю", "Давай потом"});

        container.delete(1);

        Assertions.assertArrayEquals(new String[]{"Привет", "Работаю", "Давай потом"}, container.getItems());
    }
    @Test
    public void addOneObject_TesT() {
        DataContainer<Humans> container = new DataContainer<>(new Humans[0]);

        Humans man = new Humans("Валерон", 19);
        int i = container.add(man);

        Assertions.assertEquals(man, container.get(i));
    }

    @Test
    public void addObjects_Test() {
        DataContainer<Humans> container = new DataContainer<>(new Humans[0]);

        Humans man1 = new Humans("Валерон", 19);
        Humans man2 = new Humans("Саня", 18);

        int result1 = container.add(man1);
        int result2 = container.add(man2);

        Assertions.assertEquals(man1, container.get(result1));
        Assertions.assertEquals(man2, container.get(result2));
    }

    @Test
    public void sortObjects_Test() {
        Humans[] human = new Humans[]{new Humans("Марк", 24), new Humans("Виталик", 18), new Humans("Марина", 16), new Humans("Роман", 38)};

        DataContainer<Humans> container2 = new DataContainer<>(human);

        DataContainer.sort(container2, new AgeComparator());
        String result = Arrays.toString(container2.getItems());

        Assertions.assertEquals("[Human{name='Роман', age=38}, Human{name='Марк', age=24}, Human{name='Виталик', age=18}, Human{name='Марина', age=16}]", result);
    }



    @Test
    public void initArrayWithoutNulls() {
        DataContainer<String> container = new DataContainer<>(new String[] {"Кот", "Собака"});

        String str = "Слон";
        int i = container.add(str);

        Assertions.assertEquals("Кот", container.get(0));
        Assertions.assertEquals("Собака", container.get(1));
        Assertions.assertEquals("Слон", container.get(2));
    }

  @Test
        public void addOneElement() {
            DataContainer<Integer> container = new DataContainer<>(new Integer[]{1, 2, 3, null, null, null});

            Integer int1 = 777;
            int i = container.add(int1);

            Assertions.assertEquals(int1, container.get(i));
            Assertions.assertArrayEquals(new Integer[]{1, 2, 3, 777, null, null}, container.getItems());
        }



    @Test

    public void addNull() {
        Integer[] init = {1, 2, 3, null, null, null};
        DataContainer<Integer> container = new DataContainer<>(init);

        int i = container.add(null);

        Assertions.assertEquals(init[0], container.get(0));
        Assertions.assertEquals(init[1], container.get(1));
        Assertions.assertEquals(init[2], container.get(2));
        Assertions.assertEquals(init[3], container.get(3));
        Assertions.assertEquals(init[4], container.get(4));
        Assertions.assertEquals(init[5], container.get(5));
        Assertions.assertEquals(-1, i);
    }

    @Test
    public void addOneElementAsSecond_Test() {
        DataContainer<Integer> container = new DataContainer<>(new Integer[]{1, null, 3, null, null, null});
        Integer int1 = 777;
        int i = container.add(int1);

        Assertions.assertEquals(int1, container.get(i));
        Assertions.assertArrayEquals(new Integer[]{1, 777, 3, null, null, null}, container.getItems());
    }

    @Test
    public void addTwoElementsToTheEnd() {
        DataContainer<Integer> container = new DataContainer<>(new Integer[]{1, 2, 3});
        Integer int1 = 777;
        Integer int2 = 0;
        int i = container.add(int1);
        int i2 = container.add(int2);

        Assertions.assertEquals(int1, container.get(i));
        Assertions.assertEquals(int2, container.get(i2));
        Assertions.assertArrayEquals(new Integer[]{1, 2, 3, 777, 0}, container.getItems());
    }

    @Test
    public void addOneNegativeElementToEmptyArray() {
        DataContainer<Integer> container = new DataContainer<>(new Integer[]{});
        Integer int1 = -777;
        int i = container.add(int1);

        Assertions.assertEquals(int1, container.get(i));
        Assertions.assertArrayEquals(new Integer[]{-777}, container.getItems());
    }


    @Test
    public void getIndexOfSingleElement() {
        DataContainer<Integer> container = new DataContainer<>(new Integer[]{});
        container.add(999);

        Assertions.assertEquals(999, container.get(0));
    }

    @Test
    public void getIndexOfNonExistingElement() {
        DataContainer<Integer> container = new DataContainer<>(new Integer[]{999});

        Assertions.assertNull(container.get(1));
    }
    @Test
    public void getIndexNegative() {
        DataContainer<Integer> container = new DataContainer<>(new Integer[]{999});

        Assertions.assertNull(container.get(-10));
    }

    @Test
    public void deleteOneElementByIndex() {
        DataContainer<Integer> container = new DataContainer<>(new Integer[]{1, 2, 3, 777});

        Assertions.assertTrue(container.delete(3));
        Assertions.assertArrayEquals(new Integer[]{1, 2, 3}, container.getItems());
    }

    @Test
    public void deleteOneNonExistingElementByIndex() {
        DataContainer<Integer> container = new DataContainer<>(new Integer[]{1, 2, 3, 777});

        Assertions.assertFalse(container.delete(9));
        Assertions.assertArrayEquals(new Integer[]{1, 2, 3, 777}, container.getItems());
    }

    @Test
    public void deleteOneNotLastElementByIndex() {
        DataContainer<Integer> container = new DataContainer<>(new Integer[]{1, 2, 3, 777});

        Assertions.assertTrue(container.delete(2));
        Assertions.assertArrayEquals(new Integer[]{1, 2, 777}, container.getItems());
    }


    @Test
    public void deleteOneElement() {
        DataContainer<Integer> container = new DataContainer<>(new Integer[]{1, 2, 3, 777});

        Assertions.assertTrue(container.delete1(777));
        Assertions.assertArrayEquals(new Integer[]{1, 2, 3}, container.getItems());
    }

    @Test
    public void deleteOneNonExistingElement() {
        DataContainer<Integer> container = new DataContainer<>(new Integer[]{1, 2, 3, 777});

        Assertions.assertFalse(container.delete((Integer)111));
        Assertions.assertArrayEquals(new Integer[]{1, 2, 3, 777}, container.getItems());
    }

    @Test
    public void deleteOneNotLastElement() {
        DataContainer<Integer> container = new DataContainer<>(new Integer[]{1, 2, 3, 777, 3});

        Assertions.assertTrue(container.delete(3));
        Assertions.assertArrayEquals(new Integer[]{1, 2, 3,3}, container.getItems());
    }

    @Test

    public void deleteNonExistentItem() {
        Integer[] init = {1, 2, 3, 777};
        DataContainer<Integer> container = new DataContainer<>(init);

        Integer item = 111;
        boolean result = container.delete(item);


        Assertions.assertEquals(init[3], container.get(3));
        Assertions.assertFalse(result);
    }
}
