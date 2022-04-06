package ClassWork2;

import java.util.Scanner;

public class Zoo {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        AnimalDog dog = new AnimalDog();
        AnimalCatActive cat1 = new AnimalCatActive();
        AnimalCatPasiv cat2 = new AnimalCatPasiv();
        AnimalChicken chik = new AnimalChicken();
        AnimalElephant eleph = new AnimalElephant();
        Animals[] animals ={dog, cat1, cat2, chik, eleph};

        for (int i = 0; i < animals.length; i++) {

            System.out.println("Животное "+ animals[i].animalType()+"  по кличке " + animals[i].getName()+ " подает голос: " + animals[i].getSound());

        }
    }
}
