package HomeWork5.forSearch;

import HomeWork5.api.ISearchEngine;
import HomeWork5.forText.EasyTextCleaner;

public class EasySearch implements ISearchEngine {

    public EasySearch() {
    }

    /**
     * Метод принимает обрабатываемый текст и искомое слово, возвращает количество содержащихся слов
     * @param text2 -текст
     * @param word - искомое слово
     * @return
     */
    @Override
    public long search(String text2, String word) {
        EasyTextCleaner read =new EasyTextCleaner();
        String text = read.cleaner(text2);

        int i = 0;
        int n = 0;
        int count = 0;

        do {

            if ((text.indexOf(word, n) != -1)) {
                text.indexOf(word, n);

                i = text.indexOf(word,n);
                n = i + word.length();
                if (word.length()!=1 && ((i + word.length())>= text.length() || text.charAt(i + word.length()) == ' ')){
                    count++;
                }if ((word.length() ==1) && ((text.charAt(i + word.length()-1)==0)||(text.charAt(i + word.length()-2) == ' ')) &&
                        ((i + word.length())>= text.length() || text.charAt(i + word.length()) == ' ')){
                    count++;
                }
            }
        }while ((text.indexOf(word, n) != -1));

        return count;
        }

    }

