package hw7.animals;

import hw7.interfaces.Foul;
import hw7.model.Pet;
import hw7.enums.Species;

public class RoboCat extends Pet implements Foul {

    public RoboCat(){
        super.setSpecies(Species.RoboCat);
    }
    public RoboCat(String nickname) {
        super(nickname);
        super.setSpecies(Species.RoboCat);
    }

    public RoboCat(String nickname, int age, int trickLevel, String[] habits) {
        super(nickname, age, trickLevel, habits);
        super.setSpecies(Species.RoboCat);
    }

    @Override
    public void respond() {
        System.out.println("Hi,my owner.I am "+ getNickname()+". How can I help you?");
    }

    @Override
    public void foul() {
        System.out.println("RoboCat fouling...");
    }
}
