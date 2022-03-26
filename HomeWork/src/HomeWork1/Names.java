package HomeWork1;



public class Names {

    private String name;

    public boolean equals(Object obj) {
        Names s = (Names) obj;
        if (this.name != s.name)
            return false;

            return true;
    }
}
