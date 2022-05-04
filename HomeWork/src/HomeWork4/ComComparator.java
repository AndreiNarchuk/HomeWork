package HomeWork4;

import java.util.Comparator;

public class ComComparator<T extends Comparable<T>> implements Comparator<T> {


    public int compare(T o1, T o2) {
        if (o1 == null && o2 == null) {
            return 0;
        }
        if (o1 == null) {
            return 1;
        }
        if (o2 == null) {
            return -1;
        }
        return o1.compareTo(o2);
    }

}
