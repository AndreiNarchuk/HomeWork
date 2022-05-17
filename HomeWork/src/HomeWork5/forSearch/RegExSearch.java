package HomeWork5.forSearch;

import HomeWork5.api.ISearchEngine;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExSearch implements ISearchEngine {

    public RegExSearch() {
    }

    @Override
    public long search(String text, String word) {

        Pattern p = Pattern.compile("\\s?\\b"+ word +"\\b\\s");
        Matcher m = p.matcher(text);
        int i =0;
        while (m.find()){
            i++;
        }
        return i;
    }
}
