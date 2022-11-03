package hw6;

import java.util.Random;

public class Human {
    private String name;
    private String surname;
    private int dateOfBirth;
    private int iq;
    private Family family;
    private String[][] schedule;
    boolean firstConstructor = false;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

//    public Pet getPet() {
//        return pet;
//    }
//
//    public void setPet(Pet pet) {
//        this.pet = pet;
//    }
//
//    public Human getMother() {
//        return mother;
//    }
//
//    public void setMother(Human mother) {
//        this.mother = mother;
//    }
//
//    public Human getFather() {
//        return father;
//    }
//
//    public void setFather(Human father) {
//        this.father = father;
//    }

    public String[][] getSchedule() {
        return schedule;
    }

    public void setSchedule(String[][] schedule) {
        this.schedule = schedule;
    }


    public void greetPet(){
        System.out.println("Hello, " + family.getPet().getNickname());
    }

    public void describePet() {
        if(family.getPet().getTrickLevel()>50) {
            System.out.println( "I have a " + family.getPet().getSpecies() + ", he is " + family.getPet().getAge() + " years old, he is very sly");
        }
        else{
            System.out.println( "I have a " + family.getPet().getSpecies() + ", he is " + family.getPet().getAge() + " years old, he is almost not sly");
        }
    }

    public boolean feedPet(boolean a){
        Random rand = new Random();
        int random = rand.nextInt(100);
        if(a==true){
            if(random < family.getPet().getTrickLevel()){
                System.out.println("Hm... I will feed Jack's "+ family.getPet().getNickname());
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
        firstConstructor = true;
    }

    public Human(String name, String surname, int dateOfBirth,int iq, String[][] schedule) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.iq = iq;
        this.schedule = schedule;
    }
//    public Human(String name, String surname, int dateOfBirth, Human mother, Human father) {
//        this.name = name;
//        this.surname = surname;
//        this.dateOfBirth = dateOfBirth;
//        this.mother = mother;
//        this.father = father;
//        secondtContructor = true;
//    }
 //   public Human(String name, String surname, int dateOfBirth, int iq, Pet pet, Human mother, Human father, String[][] schedule) {
//        this.name = name;
//        this.surname = surname;
//        this.dateOfBirth = dateOfBirth;
//        this.iq = iq;
//        this.pet = pet;
//        this.mother = mother;
//        this.father = father;
//        this.schedule = schedule;
//        thirdContructor = true;
//    }
    public Human() {

    }



    @Override
    public String toString() {
        if(firstConstructor==true){
            return "Human{" +
                    "name='" + name + '\'' +
                    ", surname='" + surname + '\'' +
                    ", dateOfBirth=" + dateOfBirth +
                    '}';
        }
        else {
            return "Human{" +
                    "name='" + name + '\'' +
                    ", surname='" + surname + '\'' +
                    ", dateOfBirth=" + dateOfBirth +
                    ", iq=" + iq +
                    ", schedule=" + schedule +
                    '}';
        }
//        else if(secondtContructor == true){
//            return "Human{" +
//                    "name='" + name + '\'' +
//                    ", surname='" + surname + '\'' +
//                    ", dateOfBirth=" + dateOfBirth +
//                    ", mother=" + mother.name + " "+mother.surname +
//                    ", father=" + father.name +" "+ father.surname + '}';
//        }
//        else if(thirdContructor==true){
//            return "Human{" +
//                "name='" + name + '\'' +
//                ", surname='" + surname + '\'' +
//                ", dateOfBirth=" + dateOfBirth +
//                ", iq=" + iq +
//                ", mother=" + mother.name + " "+mother.surname +
//                ", father=" + father.name +" "+ father.surname +
//                ", pet=" + pet +
//                    ", schedule=" + Arrays.deepToString(schedule) +
//                '}';}
//        else if(lastContructor == true){
//            return "";
//        }

    }
}
