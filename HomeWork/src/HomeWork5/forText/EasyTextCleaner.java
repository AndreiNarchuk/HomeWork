package HomeWork5.forText;

public class EasyTextCleaner {

    public final String cleaner(String text) {
        String textWithout = text.replaceAll("[!-,.-/:-@\\[-_]", " ").replaceAll(" +--+", " ").replaceAll("\\s+", " ");
        return textWithout;
    }

}
