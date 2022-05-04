package HomeWork1.additional;


import HomeWork1.api.ICommunicationPrinter;

public class NamesWith_If implements ICommunicationPrinter {


    @Override
    public String welcome(String name) {

        String name1 = "Вася";
        String name2 = "Анастасия";

        if (name.equals(name1) ) {
            String phrase1 = "Привет!"+"\nЯ тебя так долго ждал!";
           return phrase1;
        }
        if (name.equals(name2)) {
            String phrase2 = "Я тебя так долго ждал!";
            return phrase2;
        }
        return "Добрый день, а вы кто?";
    }

}

