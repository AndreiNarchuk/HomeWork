package HomeWork5.test;

import HomeWork5.api.ISearchEngine;
import HomeWork5.forSearch.EasySearch;
import HomeWork5.forSearch.RegExSearch;
import HomeWork5.forSearch.SearchEngine;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WarAndPeace_Test {

    @Test
    public void EasySearch_Test() {
        ISearchEngine easySearch =new EasySearch();
        String t1 = "привет, как дела!";
        String t2 = "привет,какдела!";
        String t3 = "привет;какдела!";
        String t4 = "как дела!.Что делаешь?";
        String t5 = "Привет-привет";
        String t6 = "Привет - привет";
        String t7 = "4-х";
        String t8 = "один и 1";
        String t9 = "бабушка бабушке бабушку";
        String t10 = "Привет - Привет, Привет";

        Assertions.assertEquals(1, easySearch.search(t1, "привет"));
        Assertions.assertEquals(1, easySearch.search(t1, "как"));
        Assertions.assertEquals(1, easySearch.search(t1, "дела"));

        Assertions.assertEquals(1, easySearch.search(t2, "привет"));
        Assertions.assertEquals(1, easySearch.search(t2, "какдела"));

        Assertions.assertEquals(1, easySearch.search(t3, "привет"));
        Assertions.assertEquals(1, easySearch.search(t3, "какдела"));

        Assertions.assertEquals(1, easySearch.search(t4, "как"));
        Assertions.assertEquals(1, easySearch.search(t4, "дела"));
        Assertions.assertEquals(1, easySearch.search(t4, "Что"));
        Assertions.assertEquals(1, easySearch.search(t4, "делаешь"));

        Assertions.assertEquals(1, easySearch.search(t5, "Привет-привет"));

        Assertions.assertEquals(1, easySearch.search(t6, "Привет"));
        Assertions.assertEquals(1, easySearch.search(t6, "привет"));

        Assertions.assertEquals(1, easySearch.search(t7, "4-х"));

        Assertions.assertEquals(1, easySearch.search(t8, "один"));
        Assertions.assertEquals(1, easySearch.search(t8, "и"));
        Assertions.assertEquals(1, easySearch.search(t8, "1"));

        Assertions.assertEquals(1, easySearch.search(t9, "бабушка"));
        Assertions.assertEquals(1, easySearch.search(t9, "бабушке"));
        Assertions.assertEquals(1, easySearch.search(t9, "бабушку"));

        Assertions.assertEquals(3, easySearch.search(t10, "Привет"));
    }
    @Test
    public void SearchEngine_Test() {
        ISearchEngine searchEngine =new SearchEngine();
        String t1 = "привет, как дела!";
        String t2 = "привет,какдела!";
        String t3 = "привет;какдела!";
        String t4 = "как дела!.Что делаешь?";
        String t5 = "Привет-привет";
        String t6 = "Привет - привет";
        String t7 = "4-х";
        String t8 = "один и 1";
        String t9 = "бабушка бабушке бабушку";
        String t10 = "Привет - Привет, Привет";

        Assertions.assertEquals(1, searchEngine.search(t1, "привет"));
        Assertions.assertEquals(1, searchEngine.search(t1, "как"));
        Assertions.assertEquals(1, searchEngine.search(t1, "дела"));

        Assertions.assertEquals(1, searchEngine.search(t2, "привет"));
        Assertions.assertEquals(1, searchEngine.search(t2, "какдела"));

        Assertions.assertEquals(1, searchEngine.search(t3, "привет"));
        Assertions.assertEquals(1, searchEngine.search(t3, "какдела"));

        Assertions.assertEquals(1, searchEngine.search(t4, "как"));
        Assertions.assertEquals(1, searchEngine.search(t4, "дела"));
        Assertions.assertEquals(1, searchEngine.search(t4, "Что"));
        Assertions.assertEquals(1, searchEngine.search(t4, "делаешь"));

        Assertions.assertEquals(1, searchEngine.search(t5, "Привет-привет"));

        Assertions.assertEquals(1, searchEngine.search(t6, "Привет"));
        Assertions.assertEquals(1, searchEngine.search(t6, "привет"));

        Assertions.assertEquals(1, searchEngine.search(t7, "4-х"));

        Assertions.assertEquals(1, searchEngine.search(t8, "один"));
        Assertions.assertEquals(1, searchEngine.search(t8, "и"));
        Assertions.assertEquals(1, searchEngine.search(t8, "1"));

        Assertions.assertEquals(1, searchEngine.search(t9, "бабушка"));
        Assertions.assertEquals(1, searchEngine.search(t9, "бабушке"));
        Assertions.assertEquals(1, searchEngine.search(t9, "бабушку"));

        Assertions.assertEquals(3, searchEngine.search(t10, "Привет"));
    }
    @Test
    public void Search_Test() {
        ISearchEngine searchEngine =new SearchEngine();
        ISearchEngine regExSearch =new RegExSearch();
        String t1 = "привет, как дела!";
        String t2 = "привет,какдела!";
        String t3 = "привет;какдела!";
        String t4 = "как дела!.Что делаешь?";
        String t5 = "Привет-привет";
        String t6 = "Привет - привет";
        String t7 = "4-х";
        String t8 = "один и 1";
        String t9 = "бабушка бабушке бабушку";
        String t10 = "Привет - Привет, Привет";

       // Assertions.assertEquals(1, regExSearch.search(t1, "привет"));
        Assertions.assertEquals(1, regExSearch.search(t1, "как"));
        Assertions.assertEquals(1, regExSearch.search(t1, "дела"));

        Assertions.assertEquals(1, regExSearch.search(t2, "привет"));
        Assertions.assertEquals(1, regExSearch.search(t2, "какдела"));

        Assertions.assertEquals(1, regExSearch.search(t3, "привет"));
        Assertions.assertEquals(1, regExSearch.search(t3, "какдела"));

        Assertions.assertEquals(1, regExSearch.search(t4, "как"));
        Assertions.assertEquals(1, regExSearch.search(t4, "дела"));
        Assertions.assertEquals(1, regExSearch.search(t4, "Что"));
        Assertions.assertEquals(1, regExSearch.search(t4, "делаешь"));

        Assertions.assertEquals(1, regExSearch.search(t5, "Привет-привет"));

        Assertions.assertEquals(1, regExSearch.search(t6, "Привет"));
        Assertions.assertEquals(1, regExSearch.search(t6, "привет"));

        Assertions.assertEquals(1, regExSearch.search(t7, "4-х"));

        Assertions.assertEquals(1, regExSearch.search(t8, "один"));
        Assertions.assertEquals(1, regExSearch.search(t8, "и"));
        Assertions.assertEquals(1, regExSearch.search(t8, "1"));

        Assertions.assertEquals(1, regExSearch.search(t9, "бабушка"));
        Assertions.assertEquals(1, regExSearch.search(t9, "бабушке"));
        Assertions.assertEquals(1, regExSearch.search(t9, "бабушку"));

        Assertions.assertEquals(3, regExSearch.search(t10, "Привет"));
    }

    @Test
    public void SearchEngin_Test() {
        ISearchEngine searchEngine =new SearchEngine();
//    easySearch.search
        String text1 = "Космический корабль «Опустошение» выпал из гиперпространства на орбиту вокруг Волка-I V. Клубящаяся атмосфера скрывала от взгляда поверхность планеты. А планета казалась почти такой же, как любая другая — блестящая капля во тьме. По антеннам корабельных датчиков, когда они сканировали Волк-IV, прошла дрожь, потом раздвинулись створки грузового отсека. Показался изящный капитанский катер военно-морских сил, глянцевый и серебристый; он отделился от массивного корпуса корабля. Катер вышел на собственную орбиту, а «Опустошение» снова исчезло в гиперпространстве. Катер медленно двинулся в обход бушующей планеты, ослепительная серебряная игла в мерцающей звездной ночи.\n" +
                " Капитан Хантер кусал губы, пробегая пальцами по пульту управления. Все шло к тому, что ему придется-таки сажать катер вручную. Бортовые компьютеры пока оставались совершенно бесполезными, поскольку не получали информации, достаточной для обработки. Капитан пожал плечами: \"Ну, и черта ли нам?\" Действительно, минуло много времени с тех пор, как ему доводилось сажать корабль на своем заду, но есть вещи, которые не забываешь. Особенно если от них зависит твоя жизнь. " +
                "На секунду Хантера вдруг снова захлестнула прежняя обессиливающая неуверенность, знакомая боязнь принимать решение — из страха сделать неверный выбор. Дыхание и сердцебиение участились, потом снова замедлились: капитан решительно взял себя в руки. Он делал это раньше, сделает и теперь. Хантер выполнил стандартную проверку аппаратуры, забываясь в привычных действиях. Пульт мигал спокойными, уютными огоньками. Капитан проверил устойчивость орбиты катера и сбросил зонды с датчиками. На экране Хантер наблюдал, как они падают на планету. Лучше было бы получить нужные сведения от зондов с первой попытки: не исключено, что для второй серии возможности не будет. Уже довольно скоро орбита катера начнет снижаться, а тогда ему придется включить двигатели — независимо от готовности. Запасы энергии на корабле ограничены, и они должны почти целиком потребоваться для посадки.";
    ISearchEngine regExSearch =new RegExSearch();
        Assertions.assertEquals(1, searchEngine.search(text1, "Космический"));
        Assertions.assertEquals(2, searchEngine.search(text1, "Опустошение"));
        Assertions.assertEquals(1, searchEngine.search(text1, "к"));
        Assertions.assertEquals(0, searchEngine.search(text1, "IV"));
        Assertions.assertEquals(0, searchEngine.search(text1, "ktnj"));
        Assertions.assertEquals(0, searchEngine.search(text1, "Капитан"));
    }
    }


