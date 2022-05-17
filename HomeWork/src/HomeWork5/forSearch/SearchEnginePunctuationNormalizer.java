package HomeWork5.forSearch;

import HomeWork5.api.ISearchEngine;

public class SearchEnginePunctuationNormalizer implements ISearchEngine {


    private ISearchEngine searchEngine;

    public SearchEnginePunctuationNormalizer() {
        this.searchEngine = searchEngine;
    }

    public String normalizePunctuationInString(String str) {
            String punctuation = "-\\s+|\\s+-|--|_|[^\\wа-яА-ЯЁё-]";
            String temp = str.replaceAll(punctuation," ");
            temp = temp.replaceAll("\\s{2,}", " ");
            return temp.trim();
        }

    @Override
    public long search(String text, String word) {
        text = normalizePunctuationInString(text);
        return 0;
    }
}

