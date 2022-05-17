package HomeWork5;

import HomeWork5.api.ISearchEngine;
import HomeWork5.forSearch.EasySearch;
import HomeWork5.forSearch.SearchEngine;

import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.regex.Matcher;

public class SplitText3 {

    public static void main(String[] args){
        StringBuilder sb = new StringBuilder();
        try (FileReader reader = new FileReader("E:\\Рабочий материал\\Задания ДЗ\\book.txt")) {
            char[] buf = new char[256];
            int c;
            while ((c = reader.read(buf)) > 0) {

                if (c < 256) {
                    buf = Arrays.copyOf(buf, c);
                }

                sb.append(buf);
            }
        } catch (IOException ex) {

        }
        String textWithout = String.valueOf(sb);

        String textWithout1 = textWithout.replaceAll(" +--+", " ");
        String textWithout2 = textWithout1.replaceAll("[!-,.-/:-@\\[-_]", "");
        String textWithout3 = textWithout2.replaceAll("\\s+", " ");
        Matcher matcher;


        System.out.println("Количество символов: " + textWithout3.length());
        String [] s = textWithout3.split(" ");
        System.out.println("Количество слов всего: " + s.length);
        ArrayList<String> textList = new ArrayList<>();
        SortedMap<Integer, String> wordCount = new TreeMap<>();


        int countWar = 0;
        int countAnd = 0;
        int countPeace = 0;
        int i = 0;
        for (String s1 : s) {
            i++;
            if (s1.equals("Война") || s1.equals("война")) {
                countWar++;
            }
            if (s1.equals("и") || s1.equals("И")) {
                countAnd++;
            }
            if (s1.equals("мир") || s1.equals("Мир")) {
                countPeace++;
            }
            textList.add(s1);
            //if ()
            wordCount.put(i, s1);

        }

        SortedSet<String> textSet = new TreeSet<>(textList);

//        Iterator<String> iterator = textSet.iterator();
//        String textView=null;
//        while (iterator.hasNext()){
//            textView = textView+iterator.next()+", ";
//
//        }
//        System.out.println("Итератор " + textView);

        System.out.println("Количество слов Война: " + countWar);
        System.out.println("Количество слов И: " + countAnd);
        System.out.println("Количество слов Мир: " + countPeace);
        System.out.println("Количество слов в list: " + textList.size());
        System.out.println("Количество слов в set: " + textSet.size());

        String str1 = wordCount.get(1);
        System.out.println(str1);
        String str2 = wordCount.get(5);
        System.out.println(str2);
        String str3 = wordCount.get(6);
        System.out.println(str3);

        List<String> sr4 = new ArrayList<>(textSet);


       System.out.println(sr4.get(0));

        ISearchEngine t = new SearchEngine();
        System.out.println("Поиск ISearchEngine " +t.search(textWithout3,"и"));
        ISearchEngine t1 = new EasySearch();
        System.out.println("Поиск EasySearch " +t1.search(textWithout3,"и"));
//        Более подробное описание задачи, для понимания чего я хочу: Для решения данной задачи необходимо прочитать текстовый файл  и поместить текст
//        из данного текстового файла в строку.  Далее данную строку необходимо обработать таким образом чтобы из неё можно было бы считывать слова.
//        Далее каждое полученное слово поместить как ключ в Map, а количество повторений в тексте ставить как значение. Для того чтобы это работало вам
//        необходимо постоянно проверять наличие ключа в Map, и если нужный нам ключ уже присутсвует в нашей коллекции то мы должны увеличить уже имеющееся
//        значение в коллекции на еденицу. После наполнения данной коллекции мы получим набор слов и их количество в тексте. Далее нам нужно придумать как
//        отсортировать получившуюся коллекцию но к сожалению непосредственно эту коллекцию отсортировать не получится, придётся создавать для этого List и
//        наполнять лист Entry из Map. В итоге из получившегося отсортированного набора данных вывести первые N записей.
//        3. Написать интерфейс ISearchEngine. Это будет интерфейс в котором будут методы:
//        3.1 long search(String text, String word) - Метод возвращает информации о количестве раз которое встречается слово в тексте. Первый параметр текст в
//        котором ищем, второй параметр что ищем в тексте.
//        4. Реализовать интерфейс ISearchEngine:

    }
}