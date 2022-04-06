package ClassWork2;

public class AnimalElephant extends Animals {
    private String animalType = "Слон";
    private String nameElephant ="Бимбо";
    private String soundElephant ="Ууур-ууур";

    public String getName() {
        return nameElephant;
    }

    public void setName(String nameElephant) {
        this.nameElephant = nameElephant;
    }

    public String getSound() {
        return soundElephant;
    }

    public void setSound(String soundElephant) {
        this.soundElephant = soundElephant;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    @Override
    public String animalSound() {
        return "Ууур-ууур";
    }

    @Override
    public String animalName() {
        return "Бимбо";
    }

    @Override
    public String animalType() {
        return "Слон";
    }
}

