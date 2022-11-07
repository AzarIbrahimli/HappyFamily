package hw9.gender;

import hw9.model.Human;

import java.util.Map;

public final class Man extends Human {
    public Man(String name, String surname, int dateOfBirth) {
        super(name, surname, dateOfBirth);
    }

    public Man(String name, String surname, int dateOfBirth, int iq, Map<String,String> schedule) {
        super(name, surname, dateOfBirth, iq, schedule);
    }

    public Man() {
    }

//    @Override
//    public void greetPet() {
//        System.out.println("Hi, pet");
//    }
//    public void shave(){
//        System.out.println("Shaving beard");
//    }
}
