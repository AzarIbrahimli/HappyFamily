package hw7.gender;

import hw7.model.Human;

public final class Woman extends Human {
    public Woman(String name, String surname, int dateOfBirth) {
        super(name, surname, dateOfBirth);
    }

    public Woman(String name, String surname, int dateOfBirth, int iq, String[][] schedule) {
        super(name, surname, dateOfBirth, iq, schedule);
    }

    public Woman() {
    }

    @Override
    public void greetPet() {
        System.out.println("Hi, my dear pet <3");
    }
    public void makeUp(){
        System.out.println("I am making up");
    }
}
