package HomeWork5.forSearch;

import HomeWork5.api.ISearchEngine;

public class SearchEngineCaseNormalizer implements ISearchEngine {

    private ISearchEngine searchEngine;


    public SearchEngineCaseNormalizer(ISearchEngine searchEngine) {
        this.searchEngine = searchEngine;
    }

    public ISearchEngine getiSearchEngine() {
        return this.searchEngine;
    }

    @Override
    public long search(String text, String word) {
        return searchEngine.search(text, word);
    }
}
