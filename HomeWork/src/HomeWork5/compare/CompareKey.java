package HomeWork5.compare;

import java.util.Comparator;
import java.util.Map;

public class CompareKey implements Comparator<Map.Entry<String, Integer>> {

    /**
     * Метод принимает параметр K к сравнению
     * @param o1- первое значение
     * @param o2- второе значение
     * @return
     */
    public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
        return o1.getKey().compareTo(o2.getKey());
    }

}
