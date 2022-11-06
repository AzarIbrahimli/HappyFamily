package hw8;

import hw8.animals.Fish;
import hw8.animals.RoboCat;
import hw8.gender.Man;
import hw8.gender.Woman;
import hw8.model.Pet;

public class Main {
    public static void main(String[] args) {
        Man man = new Man("Azar","Ibrahimli",1998);
        Woman woman = new Woman("Nigar","Ibrahimli",1999);
        System.out.println(man);
        System.out.println(woman);

        Pet fish = new Fish("Fish");
        System.out.println(fish);
        fish.eat();

        RoboCat roboCat = new RoboCat("RoboCat");
        System.out.println(roboCat);
        roboCat.eat();
        roboCat.foul();
        }
    }