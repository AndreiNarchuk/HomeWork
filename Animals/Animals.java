package ClassWork2;

public abstract class Animals {
    private String type;
    private String name;
    private String sound;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSound() {return sound;}

    public void setSound(String sound) { this.sound = sound;}

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public abstract String animalSound();
    public abstract String animalName();
    public abstract String animalType();
}
