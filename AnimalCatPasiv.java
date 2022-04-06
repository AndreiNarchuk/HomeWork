package ClassWork2;

public class AnimalCatPasiv extends Animals {
    private String animalType = "Кот";
    private String nameCatPasiv = "Вялый";
    private String soundCatPasiv = "Фр-ф";

    public String getName() {
        return nameCatPasiv;
    }

    public void setName(String nameCatPasiv) {
        this.nameCatPasiv = nameCatPasiv;
    }

    public String getSound() {
        return soundCatPasiv;
    }

    public void setSound(String soundCatPasiv) {
        this.soundCatPasiv = soundCatPasiv;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    @Override
    public String animalSound() {
        return soundCatPasiv;
    }

    @Override
    public String animalName() {
        return nameCatPasiv;
    }

    @Override
    public String animalType() {
        return animalType;
    }

}
