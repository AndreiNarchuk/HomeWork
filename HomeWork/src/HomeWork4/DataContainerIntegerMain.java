package HomeWork4;

import java.util.Arrays;

public class DataContainerIntegerMain {
    public static void main(String[] args) {

        DataContainer<Integer> data = new DataContainer<>(new Integer[4]);
        //4. Метод, который добавляет данные во внутреннее поле data и возвращает номер позиции,
        // в которую были вставлены данные, начиная с 0.

//        Scanner console = new Scanner(System.in);      //Для проверки консоли
//        System.out.println("Введите число");
//        int choice = console.nextInt();
//        data.add(choice);
        data.add(null);
        data.add(444);
        System.out.print("Индексы добавленных данных" +data.add(111)+ ", ");
        System.out.print(data.add(333)+ ", ");
        System.out.print(data.add(111)+ ", ");
        System.out.print(data.add(null)+ ", ");
        System.out.print(data.add(6)+ ", ");
        System.out.print(data.add(56)+ ", ");
        System.out.print(data.add(333)+ ", ");
        System.out.print(data.add(65885)+ ", ");
        System.out.print(data.add(68)+ ", ");
        System.out.print(data.add(666335));

        //Задание 5. Получаем предварительно сохранённый объект по индексу
        System.out.println("\n"+"Объект по индексу 10: " + data.get(data.add(666335)));
        System.out.println(data);

        // Задание 6. 7. Добавить метод boolean delete(int index) который будет удалять элемент из нашего поля data по индексу.
        System.out.println("\n"+"Удаляем объект по индексу 4: " + data.delete(4));
        System.out.println(data);

        // Задание 8. Удаляем элементы из нашего поля data.
        System.out.println("\n"+"Удаляем все элементы равные 333 " + data.delete1(333));
        System.out.println(data);
        // 9. Выполняем сортировку элементов.
        DataContainer.sort(data);
        System.out.println("\n"+"Массив поле сортировки: " + data);
         //10. Выводим содержание массива без null
        data.add(null);
        System.out.println("\n"+"Массив поле добавления null " + data);

        //  11. Данный метод будет сортирует элементы в ПЕРЕДАННОМ объекте DataContainer используя реализацию сравнения вызываемый у хранимых объектов.
        //  Дженерик метод.
        DataContainer<Integer> data2 = new DataContainer<>(new Integer[]{15, 156, 40, 3, 0, -576});

        System.out.println("\n"+"Введенный массив:  " + Arrays.toString(data2.getItems()));
        DataContainer.sort(data2);

        System.out.println("\n"+"Массив поле сортировки: " + data2);
         //12. 13. Todo в DataContainerStringMain


    }
}