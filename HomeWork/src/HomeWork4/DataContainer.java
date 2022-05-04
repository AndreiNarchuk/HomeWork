package HomeWork4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;

public class DataContainer<T> {

    private T[] data;


    /**
     * Контейнер для хранения данных любого типа
     * @param data обобщенный тип данных (определяеть при объявлении)
     */
    public DataContainer(T[] data) {
        this.data = data;
    }

    /**
     * Метод принимает данные и добавляет их в объект Т
     * @param item значение добавляемых данных
     * @return индекс массива куда добавленны данные при
     */
    public int add(T item) {
        if(item == null) {
            return -1;
        }

        int j = 0;

        for (T datum : this.data) {
            if(datum != null) {
                j++;
            } else {
                break;
            }
        }

        if(this.data.length == 0 || j == this.data.length) {
            this.data = Arrays.copyOf(this.data, data.length + 1);
            this.data[data.length - 1] = item;
            return data.length - 1;
        } else {
            this.data[j] = item;
            return j;
        }

    }


    //  Задание 5.

    /**
     * Метод принимает индекс элемента данных в массиве и возвращает значение элемента с указанным индексом
     * @param index
     * @return
     */
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

    //  Задание 6.
    /**
     * Получает поля data
     * @return поле data
     */
    public T[] getItems() {
        return this.data;

    }


    //  Задание 7.

    /**
     * Удаляет элемент из поля data по его индексу
     * @param index индекс элемента, который необходимо удалить
     * @return true, если элемент удален, false, если элемента под таким индексом нет
     */
    public boolean delete(int index) {
        if(index >= this.data.length || index < 0) {
            return false;
        }

        for(int i = index; i < this.data.length-1; i++) {
            this.data[i] = this.data[i+1];
        }
        this.data = Arrays.copyOf(this.data, this.data.length - 1);
        return true;
    }


    //  Задание 8.
    /**
     * Удаляет элемент из поля data по его значению
     * @param item элемент, который необходимо удалить
     * @return true, если элемент удален, false, если такого элемента нет или не удален
     */
    public boolean delete1(T item) {
        if(item == null){
            return false;
        }
        for (int i = 0; i < this.data.length; i++) {
            if(this.data[i].equals(item)) {
                return delete(i);
            }
        }
        return false;
    }


    // Задание 9.
    /**
     * Метод сортирует данные в поле data, используя реализацию сравнения из переданного объекта Comparator
     * @param comparator компаратор для сравнения элементов поля data
     */
    public void sort(Comparator<T> comparator) {

        int fromIndex = 0;
        int toIndex = this.data.length - 1;
        boolean doneSort = false;

        while ((fromIndex < toIndex) && doneSort) {

            for (int i = fromIndex; i < toIndex; i++) {

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

    // Задание 10.
    /**
     * Метод выводит содержимое data без ячеек, в которых хранится null
     * @return строку элементов без null
     */
    @Override
    public String toString() {
        StringBuilder fullArr = new StringBuilder("[");
        boolean useComma = false;
        for(T item : this.data) {
            if (item != null) {
                if (useComma) {
                    fullArr.append(", ");
                } else {
                    useComma = true;
                }
                fullArr.append(item);
            }
        }
        fullArr.append("]");
        return fullArr.toString();
    }



    // Задание 11.*

    /**
     * Этот метод сортирует элементы в контейнере, используя реализованный метод СompareTo fromobjects в переданном контейнере данных.
     * @param dataContainer контейнер с объектами, подлежащими сортировке.
     * @param <T> общий параметр расширяет сопоставимый.
     */
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
    //Задание 12.*

    /**
     * Метод сортирует элементы в переданном контейнере с помощью переданного объекта компаратора
     * @param dataContainer контейнер с объектами, подлежащими сортировке.
     * @param comparator переданный объект компаратора
     * @param <T> общий параметр расширяет сопоставимый.
     */
    public static <T extends Comparable<T>> void sort(DataContainer<T> dataContainer, ComComparator<T> comparator) {
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
    //Задание 13.

    /**
     * Класс генерирует экземпляр итератора контейнера данных класса и возвращает его.
     * @return экземпляр итератора контейнера данных
     */
    public Iterator<T> iterator() {
        return new DataContainerIterator();
    }

    /**
     * Этот класс реализует интерфейс итератора и переопределяет методы hasNext() и next().
     */
    private class DataContainerIterator implements Iterator<T>, HomeWork4.api.DataContainerIterator {
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