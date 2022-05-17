package HomeWork5;

import HomeWork5.forText.FileReaderConsole;

import java.util.Scanner;




public class NewTextMain {

    public static void main(String[] args) {

        FileReaderConsole fileReaderConsole = new FileReaderConsole();
        Scanner console = new Scanner(System.in);

        System.out.println("Введите адрес папки для чтения:");
        String addressFile = console.nextLine();
        fileReaderConsole.makeBackList(addressFile);
        String fileName=null;


        do {
            fileReaderConsole.getFileName(addressFile);
            System.out.println("Введите имя файла или введите Y, если хотите выйти: ");
            fileName = console.nextLine();

            if (fileName.equals("y")) {
                break;
            }

            String text = fileReaderConsole.getText(addressFile, fileName);
            String word;

            do {
                System.out.print("Введите искомое слово или введите Y, если хотите выйти: ");
                word = console.nextLine();

                long count = fileReaderConsole.searchWord(text, word);
                fileReaderConsole.fileOutResultFile(addressFile, fileName, word, count);

                System.out.println("Слово " + word + " в тексте встречается: " + count + " раз");
            } while (!word.equals("y"));
        } while (true);
    }
}