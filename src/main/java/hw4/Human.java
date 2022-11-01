package hw4;

import java.util.Arrays;
import java.util.Random;

public class Human {
    String name;
    String surname;
    int dateOfBirth;
    int iq;
    Pet pet;
    Human mother;
    Human father;
    String[][] schedule;
    boolean firstContructor = false;
    boolean secondtContructor = false;
    boolean thirdContructor = false;
    boolean lastContructor = false;



    public void greetPet(){
        System.out.println("Hello, " + pet.nickname);
    }
    public void describePet() {
        if(pet.trickLevel>50) {
            System.out.println( "I have a " + pet.species + ", he is " + pet.age + " years old, he is very sly");
        }
        else{
            System.out.println( "I have a " + pet.species + ", he is " + pet.age + " years old, he is almost not sly");
        }
    }

    public boolean feedPet(boolean a){
        Random rand = new Random();
        int random = rand.nextInt(100);
        if(a==true){
            if(random < pet.trickLevel){
                System.out.println("Hm... I will feed Jack's "+ pet.nickname);
                a=true;
            }
            else{
                System.out.println("I think Jack is not hungry");
                a=false;
            }
        }
        else System.out.println("I think Jack is not hungry");
        return a;
    }


    public Human(String name, String surname, int dateOfBirth) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        firstContructor = true;
    }
    public Human(String name, String surname, int dateOfBirth, Human mother, Human father) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.mother = mother;
        this.father = father;
        secondtContructor = true;
    }
    public Human(String name, String surname, int dateOfBirth, int iq, Pet pet, Human mother, Human father, String[][] schedule) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.iq = iq;
        this.pet = pet;
        this.mother = mother;
        this.father = father;
        this.schedule = schedule;
        thirdContructor = true;
    }
    public Human() {
        lastContructor = true;
    }



    @Override
    public String toString() {
        if(firstContructor==true){
            return "Human{" +
                    "name='" + name + '\'' +
                    ", surname='" + surname + '\'' +
                    ", dateOfBirth=" + dateOfBirth +'}';
        }
        else if(secondtContructor == true){
            return "Human{" +
                    "name='" + name + '\'' +
                    ", surname='" + surname + '\'' +
                    ", dateOfBirth=" + dateOfBirth +
                    ", mother=" + mother.name + " "+mother.surname +
                    ", father=" + father.name +" "+ father.surname + '}';
        }
        else if(thirdContructor==true){
            return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", iq=" + iq +
                ", mother=" + mother.name + " "+mother.surname +
                ", father=" + father.name +" "+ father.surname +
                ", pet=" + pet +
                    ", schedule=" + Arrays.deepToString(schedule) +
                '}';}
        else if(lastContructor == true){
            return "";
        }
        return "";
    }
}
