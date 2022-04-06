package ClassWork2;

public class AnimalCatActive extends Animals {
    private String animalType = "Кот";
    private String nameCatActive = "Актив";
    private String soundCatActive = "Мяу";

    public String getName() {
        return nameCatActive;
    }

    public void setName(String nameCatActive) {
        this.nameCatActive = nameCatActive;
    }

    public String getSound() {
        return soundCatActive;
    }

    public void setSound(String soundCatActive) {
        this.soundCatActive = soundCatActive;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    @Override
    public String animalName() {
        return nameCatActive;
    }

    @Override
    public String animalType() {
        return animalType;
    }

    @Override
    public String animalSound() {
        return soundCatActive;
    }
}
