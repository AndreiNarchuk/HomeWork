package HomeWork4;

import java.util.Objects;

public class Humans implements Comparable<Humans> {
    private String name;
    private int age;

    public Humans(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }


    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Humans humans = (Humans) o;
        return age == humans.age && Objects.equals(name, humans.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }


    @Override
    public int compareTo(Humans o) {
        return 0;
    }
}