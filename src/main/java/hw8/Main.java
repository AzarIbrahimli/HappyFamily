package hw8;

import hw8.animals.Fish;
import hw8.animals.RoboCat;
import hw8.gender.Man;
import hw8.gender.Woman;
import hw8.model.Family;
import hw8.model.Pet;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Pet> mypets = new HashSet<>();
        Man man = new Man("Azar","Ibrahimli",1998);
        Woman woman = new Woman("Nigar","Ibrahimli",1999);
        Pet mypet = new RoboCat("RoboCat");
        Pet myfish = new Fish("Fish");

        mypets.add(mypet);
        mypets.add(myfish);

//        man.greetPet();



        Family family = new Family(woman, man,mypets);
        System.out.println(family);

        Pet fish = new Fish("Fish");
        System.out.println(fish);
        fish.eat();

        RoboCat roboCat = new RoboCat("RoboCat");
        System.out.println(roboCat);
        roboCat.eat();
        roboCat.foul();
        }
    }