package HomeWork1.additional;


import HomeWork1.api.ICommunicationPrinter;

public class NamesWith_Switch implements ICommunicationPrinter {


    @Override
    public String welcome(String name) {

        String name1 = "Вася";
        String name2 = "Анастасия";

        int b = name.equals(name1) ?  1 : 0;
        int c = name.equals(name2) ?  2 : 0;
        int a = !name.equals(name1) & !name.equals(name2) ?  3 : 0;
        int d = a + b + c;

        switch (d) {
            case 1:
                return "Привет!"+"\nЯ тебя так долго ждал!";
            case 2:
                return "Я тебя так долго ждал";
            case 3:
                return "Добрый день, а вы кто?";
        }
        return "Добрый день, а вы кто?";
    }

}

