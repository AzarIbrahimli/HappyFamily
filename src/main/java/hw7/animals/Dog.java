package hw7.animals;

import hw7.interfaces.Foul;
import hw7.enums.Species;
import hw7.model.Pet;

public class Dog extends Pet implements Foul {
    public Dog(String nickname) {
        super(nickname);
        super.setSpecies(Species.Dog);
    }

    public Dog(String nickname, int age, int trickLevel, String[] habits) {
        super(nickname, age, trickLevel, habits);
        super.setSpecies(Species.Dog);
    }

    public Dog() {
        super.setSpecies(Species.Dog);
    }

    @Override
    public void respond() {
        System.out.println( "Hello, owner. I am " + getNickname() + ". I miss you!");
    }

    @Override
    public void foul() {
        System.out.println("Dog is fouling...");
    }
}
