package hw7.animals;

import hw7.interfaces.Foul;
import hw7.enums.Species;
import hw7.model.Pet;

public class DomesticCat extends Pet implements Foul {
    public DomesticCat(String nickname) {
        super(nickname);
        super.setSpecies(Species.DomesticCat);
    }

    public DomesticCat(String nickname, int age, int trickLevel, String[] habits) {
        super(nickname, age, trickLevel, habits);
        super.setSpecies(Species.DomesticCat);
    }

    public DomesticCat() {
        super.setSpecies(Species.DomesticCat);
    }

    @Override
    public void respond() {
        System.out.println(getNickname());
    }


    @Override
    public void foul() {
        System.out.println("Domestic cat fouling...");
    }
}
