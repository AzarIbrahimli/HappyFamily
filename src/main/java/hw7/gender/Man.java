package hw7.gender;

import hw7.model.Human;

public final class Man extends Human {
    public Man(String name, String surname, int dateOfBirth) {
        super(name, surname, dateOfBirth);
    }

    public Man(String name, String surname, int dateOfBirth, int iq, String[][] schedule) {
        super(name, surname, dateOfBirth, iq, schedule);
    }

    public Man() {
    }

    @Override
    public void greetPet() {
        System.out.println("Hi, pet");
    }
    public void shave(){
        System.out.println("Shaving beard");
    }
}
