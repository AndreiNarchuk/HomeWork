package ClassWork2;

public class AnimalChicken extends Animals {
    private String animalType = "Курица";
    private String nameChicken = "Ряба";
    private String soundChicken = "Ко-ко-ко";

    public String getName() {
        return nameChicken;
    }

    public void setName(String nameChicken) {
        this.nameChicken = nameChicken;
    }

    public String getSound() {
        return soundChicken;
    }

    public void setSound(String soundChicken) {
        this.soundChicken = soundChicken;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    @Override
    public String animalSound() {
        return soundChicken;
    }

    @Override
    public String animalName() {
        return nameChicken;
    }

    @Override
    public String animalType() {
        return animalType;
    }
}

