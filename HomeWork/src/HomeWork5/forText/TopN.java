package HomeWork5.forText;


import HomeWork5.compare.CompareKey;
import HomeWork5.compare.CompareValue;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TopN{

private String topN;

    public TopN(String str, int count) {

        this.topN=printTop(mapToList(wordCounterMap(str)),count);
    }

    public String getTopN() {
        return this.topN;
    }
    /**
     * Метод создает коллекцию Мар, помещая в Key наименование (слово), а в Value количество, словю
     * @param text обработанная строка с помещенным в нее текстом из файла
     * @return коллекцию Мар со словами и их количеством в тексте
     */
    private Map<String, Integer> wordCounterMap(String str) {
        Map<String, Integer> countedWords= new TreeMap<>();
        String pattern = "(\\s*)(\\S+)(\\s*)";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(str);
        while(m.find()) {
            String word = m.group(2);
            countedWords.putIfAbsent(word,0);
            countedWords.put(word,countedWords.get(word)+1);
        }
        return countedWords;
    }
    private static String printTop(List<Map.Entry<String, Integer>> entryList, int count) {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, Integer> entry : entryList) {
            if(count-- <= 0) {
                break;
            }
            sb.append(entry.getKey()).append("\t" + "-" + "\t").append(entry.getValue());
            if(count!= 0) {
                sb.append("\n");
            }
        }
        return String.valueOf(sb);
    }
    /**
     * Метод наполняет List значениями Key и Value из коллекции Мар и сортирует по количеству и наименованию
     * @param - коллекция Мар со словами и их количеством в тексте
     * @return отсортированную коллекцию List типа Map.Entry<String, Integer>
     */
    private static List<Map.Entry<String,Integer>> mapToList(Map<String,Integer> map) {

        List<Map.Entry<String,Integer>> mapList = new ArrayList<>(map.entrySet());

        mapList.sort(new CompareValue().reversed().thenComparing(new CompareKey()));

        return mapList;
    }





}
