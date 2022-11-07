package hw9;

import hw9.animals.Fish;
import hw9.animals.RoboCat;
import hw9.gender.Man;
import hw9.gender.Woman;
import hw9.model.Family;
import hw9.model.Pet;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        CollectionFamilyDao collectionFamilyDao = new CollectionFamilyDao();
        Set<Pet> mypets = new HashSet<>();
        Man man = new Man("Azar","Ibrahimli",1998);
        Woman woman = new Woman("Nigar","Ibrahimli",1999);
        Pet mypet = new RoboCat("RoboCat");
        Pet myfish = new Fish("Fish");

        mypets.add(mypet);
        mypets.add(myfish);
        Family family = new Family(woman,man,mypets);



        Set<Pet> mypets2 = new HashSet<>();
        Man man2 = new Man("Azar2","Ibrahimli",1998);
        Woman woman2 = new Woman("Nigar2","Ibrahimli",1999);
        Pet mypet2 = new RoboCat("RoboCat2");
        Pet myfish2 = new Fish("Fish2");

        mypets2.add(mypet2);
        mypets2.add(myfish2);
        Family family2 = new Family(woman2,man2,mypets2);

        collectionFamilyDao.saveFamily(family);
        collectionFamilyDao.saveFamily(family2);
        System.out.println(collectionFamilyDao.getAllFamilies());


        System.out.println(collectionFamilyDao.getFamilyByIndex(1));
        System.out.println(collectionFamilyDao.deleteFamily(1));
        System.out.println(collectionFamilyDao.getAllFamilies());

        System.out.println(collectionFamilyDao.deleteFamily(family));
        System.out.println(collectionFamilyDao.getAllFamilies());

        }
    }