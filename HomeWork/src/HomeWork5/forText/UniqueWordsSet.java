package HomeWork5.forText;

import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UniqueWordsSet {


    public UniqueWordsSet() {
    }

    public Set<String> uniqueWordsSet(String str) {

        Set<String> strings = new HashSet<>();
        String pattern = "(\\s*?\\b)(\\S+)(\\s*)";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(str);
        while(m.find()) {
            strings.add(m.group());
        }
        return strings;
    }
}