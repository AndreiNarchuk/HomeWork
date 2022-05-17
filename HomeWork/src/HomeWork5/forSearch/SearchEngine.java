package HomeWork5.forSearch;

import HomeWork5.api.ISearchEngine;

public class SearchEngine implements ISearchEngine {

    public SearchEngine() {
    }

    /**
     * Метод  прринмает текст и искомое слово, возвращает количество совпадений в переданном тексте. Применен split(" ") строки для
     * разнообразия используемых инструментов. Метод чувствителен к регистру.
     * @param text2 - проверяемый текст на наличие совпадений
     * @param word - переданный образец слова с которым идет сличение
     * @return значение типа long, число совпадений
     */
    @Override
    public long search(String text2, String word) {
        SearchEnginePunctuationNormalizer text = new SearchEnginePunctuationNormalizer();
        text.normalizePunctuationInString(text2);
        String[] s = text.normalizePunctuationInString(text2).split(" ");
        long count = 0;
        for (String s1 : s) {
            if (s1.equals(word)) {
                count++;
            }
        }
        return count;
    }
}
