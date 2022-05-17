package HomeWork5.forText;

import HomeWork5.api.ISearchEngine;
import HomeWork5.forSearch.RegExSearch;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileReaderConsole {

    /**
     * Метод принимает путь к папке и выводит информацию о файлах, находящихся в нем
     *
     * @param addressFile адрес папки
     */
    public void getFileName(String addressFile) {
        File reader = new File(addressFile);
        if (Files.isDirectory(Path.of(addressFile)) || reader.exists()) {
            File[] listFiles = reader.listFiles();
            if ((listFiles != null ? listFiles.length : 0) == 0) {
                System.out.println("Папка (" + reader.getAbsolutePath() + ") пуста.");
            } else {
                System.out.println("В папке (" + reader.getAbsolutePath() + ") найдено: ");
                for (File file : listFiles) {
                    System.out.println(file.getName());
                }
            }
        }
    }

    /**
     * Метод получает обработанный текс из выбранного файла в папке
     *
     * @param addressFile путь к папке
     * @param fileName    название файла, которое выбрал пользователь
     * @return строку с обработанным текстом из файла
     */
    public String getText(String addressFile, String fileName) {
        TextReader textFromFile = new TextReader(addressFile + "\\" + fileName);

        return textFromFile.getReadText();
    }

    /**
     * Метод ищет заданное слова и подсчитывает его количество в тексте без учета регистра, падежей
     *
     * @param text обработанная строка с помещенным в нее текстом из файла
     * @param word слово, которое необходимо найти
     * @return информации о количестве раз которое встречается слово в тексте
     */
    public long searchWord(String text, String word) {
        ISearchEngine searchEngine = new RegExSearch();

        return searchEngine.search(text, word);
    }

    /**
     * Метод записывает результаты поиска слов в тексте в файл
     *
     * @param addressFile путь к папке
     * @param fileName    название файла, которое выбрал пользователь
     * @param word        слово, которое необходимо найти
     * @param count       количество раз которое встречается слово в тексте
     */
    public void fileOutResultFile(String addressFile, String fileName, String word, long count) {
        try {
            Path pathToFileLog = Path.of(addressFile + "\\resultBack.txt");
            String textLog = Files.readString(pathToFileLog, StandardCharsets.UTF_8);

            if (!word.equals("y")) {
                FileWriter writer = new FileWriter(addressFile + "\\resultBack.txt");
                writer.append(textLog).append("\nИмя файла: ").append(fileName).append(", искомое слово: ").append(word).append(", слово найдено ").append(String.valueOf(count)).append(" раз");
                writer.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

// TODO: 17.05.2022 дополнить созданием фйла "resultBack.txt"

    /**
     * Метод создает файл result.txt для записи результатов поиска
     *
     * @param addressFile путь к папке
     */
    public void makeBackList(String addressFile) {
        File creator = new File(addressFile + "\\resultBack.txt");
        if (creator.exists()) {
            creator.delete();
        }
        try {
            creator.createNewFile();
        } catch (IOException e) {
            System.out.println("Не удалось создать файл result");
            e.printStackTrace();
        }
    }
}