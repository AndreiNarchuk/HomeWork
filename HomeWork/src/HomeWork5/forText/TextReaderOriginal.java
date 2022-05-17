package HomeWork5.forText;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class TextReaderOriginal {


    public String textReader(String readText) {
        StringBuilder sb = new StringBuilder();

        try (FileReader reader = new FileReader(readText)) {

            char[] buf = new char[256];
            int c;
            while ((c = reader.read(buf)) > 0) {

                if (c < 256) {
                    buf = Arrays.copyOf(buf, c);
                }
                sb.append(buf);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Походу руки кривые. Файл не найден.");
            ex.printStackTrace();
        } catch (IOException ex) {
            System.out.println("Что-то пошло не так прочесть файл не удалось");
            ex.printStackTrace();
        }
      return cleaner(String.valueOf(sb));
    }


    private final String cleaner(String text) {
        String textWithout = text.replaceAll(" +--+", " ").replaceAll("[!-,.-/:-@\\[-_]", "").replaceAll("\\s+", " ");
        return textWithout;
    }
}



