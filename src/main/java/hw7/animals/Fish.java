package hw7.animals;

import hw7.enums.Species;
import hw7.model.Pet;

public class Fish extends Pet {
    public Fish(String nickname) {
        super(nickname);
        super.setSpecies(Species.Fish);
    }

    public Fish(String nickname, int age, int trickLevel, String[] habits) {
        super(nickname, age, trickLevel, habits);
        super.setSpecies(Species.Fish);
    }

    public Fish() {
        super.setSpecies(Species.Fish);
    }

    @Override
    public void respond() {
        System.out.println("I am " + getNickname());
    }
}
