package HomeWork5;

import HomeWork5.api.ISearchEngine;
import HomeWork5.forSearch.EasySearch;
import HomeWork5.forSearch.RegExSearch;
import HomeWork5.forSearch.SearchEngine;
import HomeWork5.forText.TextReader;
import HomeWork5.forText.TopN;
import HomeWork5.forText.UniqueWordsSet;



public class TextMain {

    public static void main(String[] args) {

//        Scanner console = new Scanner(System.in);
//        System.out.println("Введите адрес файла");
//        String fileIn = console.nextLine();
//        TextReader r = new TextReader(fileIn);
/*
Задание 2. Передаем текст для обрботки
 */
        TextReader r = new TextReader ("E:\\Рабочий материал\\Задания ДЗ\\book.txt");
        String text = r.getReadText();
        TextReader r2 = new TextReader ("E:\\Рабочий материал\\Задания ДЗ\\book.txt");
        String text2 = r2.getReadText();
/*
Задание 2.1 Выводим информацию о количестве уникальных слов.
 */
        UniqueWordsSet allUseWords= new UniqueWordsSet();
        System.out.println("1. Количество использованных в тексте слов: " + allUseWords.uniqueWordsSet(text).size());
        System.out.println("__________________________________________________________________");
/*
Задание 2.2 Выводим информацию о топе слов по количеству и наименованию
 */
        TopN wordMap= new TopN(text, 15);
        System.out.println("2. Топ 15 наиболее часто используемые слова в тексте: ");
        System.out.println(wordMap.getTopN());
        System.out.println("__________________________________________________________________");


        ISearchEngine searchSearchEngine = new SearchEngine();
        System.out.println("3.1 Поиск SearchEngine (используя split), с учетом регистра:");
        System.out.println("Количество слов \"война\" в тексте:\t\t" + searchSearchEngine.search(text2, "Война"));
        System.out.println("Количество слов \"и\" (союз) в тексте:\t" + searchSearchEngine.search(text2, "и"));
        System.out.println("Количество слов \"мир\" в тексте:\t\t\t" + searchSearchEngine.search(text2, "мир"));
        System.out.println("__________________________________________________________________");

        ISearchEngine searchEasySearch = new EasySearch();
        System.out.println("4.1 Поиск EasySearch в тексте с учетом регистра:");
        System.out.println("Количество слов \"война\" в тексте:\t\t" + searchEasySearch.search(text2, "Война"));
        System.out.println("Количество слов \"и\" (союз) в тексте:\t" + searchEasySearch.search(text2, "и"));
        System.out.println("Количество слов \"мир\" в тексте:\t\t\t" + searchEasySearch.search(text2, "мир"));
        System.out.println("__________________________________________________________________");


        ISearchEngine searchRegExSearch = new RegExSearch();
        System.out.println("4.2 Поиск RegExSearch в тексте с учетом регистра (без регулярных выражений):");
        System.out.println("Количество слов \"война\" в тексте:\t\t" + searchRegExSearch.search(text2,"Война"));
        System.out.println("Количество слов \"и\" (союз) в тексте:\t" + searchRegExSearch.search(text2, "и"));
        System.out.println("Количество слов \"мир\" в тексте:\t\t\t" + searchRegExSearch.search(text2, "мир"));
        System.out.println("__________________________________________________________________");

    }


}
