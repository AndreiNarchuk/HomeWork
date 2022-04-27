package HomeWork4;

import java.util.Arrays;

import static HomeWork4.DataContainer.sort;

public class DataContainerStringMain {
    public static void main(String[] args) {
        DataContainer<String> container = new DataContainer<>(new String[4]);

        //4. Метод, который добавляет данные во внутреннее поле data и возвращает номер позиции,
        // в которую были вставлены данные, начиная с 0.

        int index1 = container.add("Привет");
        int index2 = container.add("Как дела");
        int index3 = container.add("Работаю");
        int index4 = container.add("Давай потом");

        //Задание 5.  Данный метод получает из DataContainer'а, из поля data, предварительно сохранённый объект который
        // мы передали на предыдущем шаге через метод add.
        String text1 = container.get(index1);
        String text2 = container.get(index2);
        String text3 = container.get(index3);
        String text4 = container.get(index4);
        
        //Задание 6., 7. Метод delete(int index) который будет удалять элемент из нашего поля data по индексу.
        System.out.println(text1); //Привет
        System.out.println(text2); //Как дела
        System.out.println(text3); //Работаю
        System.out.println(text4); //Давай потом

         //Задание 8. Добавить метод boolean delete(T item) который будет удалять элемент из нашего поля data.
        container.delete1(text1);
        System.out.println(container.get(index1)); //Как дела
        System.out.println(container.toString());

        //Задание 9. метод занимается сортировкой данных записанных в поле data.
        sort(container);
        System.out.println(container.toString());

        //Задание 10. Метод toString() в классе и выводить содержимое data без ячеек в которых хранится null
        // Задание 11. 12. принимать объект DataContainer с дженериком extends Comparable. Данный метод будет сортировать элементы в
        // ПЕРЕДАННОМ объекте DataContainer используя реализацию сравнения вызываемый у хранимых объектов.
        Humans[] men = new Humans[]{new Humans("Марк", 24), new Humans("Виталик", 18), new Humans("Марина", 16), new Humans("Роман", 38)};

        DataContainer<Humans> container2 = new DataContainer<>(men);
        // todo задание 12
        System.out.println(" Введенный массив: " + Arrays.toString(container2.getItems()));

       //todo задание 13

    }

}



