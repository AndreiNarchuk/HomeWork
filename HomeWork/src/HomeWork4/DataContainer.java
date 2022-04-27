package HomeWork4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;

public class DataContainer<T> {

    private T[] data;


    //  3. Из-за особенностей дженериков в данном классе обязательно будет присутствовать один конструктор DataContainer(T[]).
//   Есть и другие способы, но в рамках обучения они будут сложными и с ними мы разбираться будем слишком сложно.A
    public DataContainer(T[] toSetArr) {
        this.data = toSetArr;
    }

    //  4. В данном классе должен быть метод int add(T item) который добавляет данные во внутреннее поле data и возвращает
//  номер позиции в которую были вставлены данные, начиная с 0.
    public int add(T item) {

        //            4.1 Если поле data не переполнено то данные нужно добавлять в первую позицию (ячейку) после последней заполненной позиции (ячейки).
//            4.1.1 Пример: data = [1, 2, 3, null, null, null]. Вызвали add(777). Должно получиться data = [1, 2, 3, 777, null, null]. Метод add вернёт число 3.
//            4.1.2 Пример: data = [1, 2, 3, null, null, null]. Вызвали add(null). Должно получиться data = [1, 2, 3, null, null, null].
//            Метод add вернёт число -1. -1 будет индикатором того что данный элемент в наш контейнер вставлять нельзя.

//		4.1.3 Пример: data = [1, null, 3, null, null, null]. Вызвали add(777). Должно получиться data = [1, 777, 3, null, null, null]. Метод add вернёт число 1.
//            4.2 В случае если поле data переполнено, нужно придумать механизм который будет расширять пространство для новых элементов. Тут вам поможет Arrays.copyOf.
//		4.2.1 Пример: data = [1, 2, 3]. Вызвали add(777). Должно получиться data = [1, 2, 3, 777]. Метод add вернёт число 3.
//            4.2.2 Пример: data = []. Вызвали add(777). Должно получиться data = [777]. Метод add вернёт число 0.
        if (this.data.length == 0 || this.data[this.data.length - 1] != null) {
            this.data = Arrays.copyOf(this.data, this.data.length + 1);
        }
        if (this.data.length >= 1)
            for (int i = 0; i < data.length - 1; i++) {
                if (data[i] == null) {
                    this.data = Arrays.copyOfRange((this.data), i, 1);
                }
            }
        this.data[this.data.length - 1] = item;
        return this.data.length - 1;
    }
    //TODO...4.

    //  5. В данном классе должен быть метод T get(int index). Данный метод получает из DataContainer'а, из поля data, предварительно
//   сохранённый объект который мы передали на предыдущем шаге через метод add.
    public T get(int index) {

        if (index >= 0 && index <= data.length - 1 && data[index] != null) {
            return this.data[index];
        } else {
            return null;
        }


//            5.1 Пример: data = []. Вызвали add(9999). Получили data = [9999]. Метод add вернул число 0. Вызываем get(0).
//            Метод get возвращает 9999
//            5.2 Пример: data = [9999]. Вызываем get(1). Метод get возвращает null

    }

    //  6. В данном классе должен быть метод T[] getItems(). Данный метод возвращает поле data.
    public T[] getItems() {
        return this.data;


    }//TODO...6?

    //   7. Добавить метод boolean delete(int index) который будет удалять элемент из нашего поля data по индексу.
    //            7.1 Метод возвращает true если у нас получилось удалить данные.
//            7.1.1 Пример data = [1, 2, 3, 777]. Вызывают delete(3). Должно получиться data = [1, 2, 3]. Метод delete вернёт true
//            7.2 Метод возвращает false если нет такого индекса.
//            7.2.1 Пример data = [1, 2, 3, 777]. Вызывают delete(9). Должно получиться data = [1, 2, 3, 777]. Метод delete вернёт false
//            7.3. Освободившуюся ячейку в поеле data необходимо удалить полностью. Пустых элементов не должно быть.
//		7.3.1 Пример data = [1, 2, 3, 777]. Вызывают delete(2). Должно получиться data = [1, 2, 777]. Метод delete вернёт true

    public boolean delete(int index) {

        if (index == 0 && index == this.data.length - 1 && this.data[0] != null) {
            this.data = null;
            return true;
        }
        if (index >= 0 && index <= (data.length - 1)) {
            for (int i = index; i < data.length - 1; i++) {
                this.data[i] = this.data[i + 1];
            }
            this.data = Arrays.copyOf(this.data, this.data.length - 1);
            return true;
        }
        return false;

    }


    //  8. Добавить метод boolean delete(T item) который будет удалять элемент из нашего поля data.
    //            8.1 Метод возвращает true если у нас получилось удалить данные.
//            8.1.1 Пример data = [1, 2, 3, 777]. Вызывают delete(777). Должно получиться data = [1, 2, 3]. Метод delete вернёт true
//            8.2 Метод возвращает false если нет такого элемента.
//            8.2.1 Пример data = [1, 2, 3, 777]. Вызывают delete(111). Должно получиться data = [1, 2, 3, 777]. Метод delete вернёт false
//            8.3 Освободившуюся ячейку необходимо удалить полностью. Пустых элементов не должно быть.
//		8.3.1 Пример data = [1, 2, 3, 777, 3]. Вызывают delete(3). Должно получиться data = [1, 2, 777, 3]. Метод delete вернёт true

    public boolean delete1(T item) {
        boolean forCompare = false;

        for (int i = 0; i < data.length - 1; ) {
            if (!this.data[i].equals(item)) {
                i++;
            } else {
                int j = i;
                forCompare = true;
                for (; j < data.length - 1; j++) {
                    this.data[j] = this.data[j + 1];
                }
            }
        }
        if (forCompare) {
            this.data = Arrays.copyOf(this.data, this.data.length - 1);
            return true;
        }
        return false;
    }


    //9. Добавить НЕ СТАТИЧЕСКИЙ метод void sort(Comparator<.......> comparator). Данный метод занимается сортировкой данных
// записанных в поле data используя реализацию сравнения из ПЕРЕДАННОГО объекта comparator. Классом Arrays пользоваться запрещено.
    // todo 9.
    public void sort(Comparator<T> comparator) {

        int fromIndex = 0;
        int toIndex = this.data.length - 1;
        boolean doneSort = false;

        while ((fromIndex < toIndex) && doneSort) {

            for (int i = fromIndex; i < toIndex; i++) {
                if (fromIndex < 0 || toIndex > this.data.length - 1) {
                    System.out.println("Индекс лежит за пределами массива");
                }
                if (this.data[i] == null || this.data[i + 1] == null) {
                    System.out.println("В массиве есть пустые элементы  (null) элементы");
                }
                if (comparator.compare(this.data[i], this.data[i + 1]) > 0) {
                    T temp = this.data[i];
                    this.data[i] = this.data[i + 1];
                    this.data[i + 1] = temp;
                    doneSort = true;
                }
            }
            toIndex--;

            for (int i = toIndex; i > fromIndex; i--) {
                if (fromIndex < 0 || toIndex > this.data.length - 1) {
                    System.out.println("Индекс лежит за пределами массива ");
                }
                if (this.data[i - 1] == null || this.data[i] == null) {
                    System.out.println("В массиве есть пустые элементы  (null) элементы");
                }
                if (comparator.compare(this.data[i - 1], this.data[i]) > 0) {
                    T temp = this.data[i];
                    this.data[i] = this.data[i - 1];
                    this.data[i - 1] = temp;
                    doneSort = true;
                }
            }
            fromIndex++;
        }
    }

    //10. Переопределить метод toString() в классе и выводить содержимое data без ячеек в которых хранится null.
    public String toString() {
        return "data = " + Arrays.toString(data).replaceAll(", *null *","").replaceAll(" *null, *", "");
    }

    //11.* В даном классе должен быть СТАТИЧЕСКИЙ метод sort который будет принимать объект DataContainer с
    // дженериком extends Comparable. Данный метод будет сортировать элементы в ПЕРЕДАННОМ объекте DataContainer
    // используя реализацию сравнения вызываемый у хранимых объектов. Для этого надо сделать дженерик метод.

    public static <T extends Comparable<T>> void sort(DataContainer<T> dataContainer) {
        int fromIndex = 0;
        int toIndex = dataContainer.data.length - 1;
        boolean doneSort = true;

        while ((fromIndex < toIndex) && doneSort) {

            doneSort = false;

            for (int i = fromIndex; i < toIndex; i++) {
                if (dataContainer.data[i] == null || dataContainer.data[i + 1] == null) {
                    throw new NullPointerException("В массиве есть пустые элементы (null) элементы");
                }
                if (dataContainer.data[i].compareTo(dataContainer.data[i + 1]) > 0) {
                    T temp = dataContainer.data[i];
                    dataContainer.data[i] = dataContainer.data[i + 1];
                    dataContainer.data[i + 1] = temp;
                    doneSort = true;
                }
            }
            toIndex--;

            for (int i = toIndex; i > fromIndex; i--) {
                if (dataContainer.data[i - 1] == null || dataContainer.data[i] == null) {
                    throw new NullPointerException("В массиве есть пустые элементы (null) элементы");
                }
                if (dataContainer.data[i - 1].compareTo(dataContainer.data[i]) > 0) {
                    T temp = dataContainer.data[i];
                    dataContainer.data[i] = dataContainer.data[i - 1];
                    dataContainer.data[i - 1] = temp;
                    doneSort = true;
                }
            }
            fromIndex++;
        }
    }
    //12.* В данном классе должен быть СТАТИЧЕСКИЙ метод void sort(DataContainer<.............> container, Comparator<.......> comparator)
    // который будет принимать объект DataContainer и реализацию интерфейса Comparator. Данный метод будет сортировать элементы
    // в ПЕРЕДАННОМ объекте DataContainer используя реализацию сравнения из ПЕРЕДАННОГО объекта интерфейса Comparator.

    public static <T extends Comparable<T>> void sort(DataContainer<T> dataContainer, Comparator<T> comparator) {
        int fromIndex = 0;
        int toIndex = dataContainer.data.length - 1;
        boolean doneSort = true;

        while ((fromIndex < toIndex) && doneSort) {

            doneSort = false;

            for (int i = fromIndex; i < toIndex; i++) {
                if (dataContainer.data[i] == null || dataContainer.data[i + 1] == null) {
                    throw new NullPointerException("В массиве есть пустые элементы (null) элементы");
                }
                if (comparator.compare(dataContainer.data[i], dataContainer.data[i + 1]) > 0) {
                    T temp = dataContainer.data[i];
                    dataContainer.data[i] = dataContainer.data[i + 1];
                    dataContainer.data[i + 1] = temp;
                    doneSort = true;
                }
            }
            toIndex--;

            for (int i = toIndex; i > fromIndex; i--) {
                if (dataContainer.data[i - 1] == null || dataContainer.data[i] == null) {
                    throw new NullPointerException("В массиве есть пустые элементы (null) элементы");
                }
                if (comparator.compare(dataContainer.data[i - 1], dataContainer.data[i]) > 0) {
                    T temp = dataContainer.data[i];
                    dataContainer.data[i] = dataContainer.data[i - 1];
                    dataContainer.data[i - 1] = temp;
                    doneSort = true;
                }
            }
            fromIndex++;
        }
    }
    //13.** Реализовать в DataContainer интерфейс Iterable

    public Iterator<T> iterator() {
        return new DataContainerIterator();
    }

    private class DataContainerIterator implements Iterator<T>, HomeWork4.DataContainerIterator {
        private int index;

        public DataContainerIterator() {
            this.index = 0;
        }

        @Override
        public boolean hasNext() {
            return get(index) != null;
        }

        @Override
        public T next() {
            T current = get(this.index);
            this.index++;
            return current;
        }
    }
}