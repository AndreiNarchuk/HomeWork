package ClassWork2;

public class AnimalDog extends Animals {
    private String animalType = "Собака";
    private String nameDog = "Шарик";
    private String soundDog = "Гав гав";


    public String getName() {
        return nameDog;
    }

    public void setName(String nameDog) {
        this.nameDog = nameDog;
    }

    public String getSound() {
        return soundDog;
    }

    public void setSound(String soundDog) {
        this.soundDog = soundDog;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    @Override
    public String animalSound() {
        return "Гав гав";
    }

    @Override
    public String animalName() {
        return "Шарик";
    }

    @Override
    public String animalType() {
        return "Собака";
    }


}

