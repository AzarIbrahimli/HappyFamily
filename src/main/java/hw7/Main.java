package hw7;

import hw7.animals.Fish;
import hw7.animals.RoboCat;
import hw7.gender.Man;
import hw7.gender.Woman;
import hw7.model.Pet;

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