package hw7.model;

import hw7.enums.Species;

import java.util.Arrays;

public abstract class Pet {
    private Species species;
    private String nickname;
    private int age;
    private int trickLevel;
    private String[] habits;


    public Species getSpecies() {
        return Species.Unknown;
    }
    public String getNickname() {
        return nickname;
    }
    public int getTrickLevel() {
        return trickLevel;}
    public int getAge() {
        return age;
    }
    public String[] getHabits() {
        return habits;
    }


    public void setSpecies(Species species) {
        this.species = species;
    }
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setTrickLevel(int trickLevel) {
        this.trickLevel = trickLevel;
    }
    public void setHabits(String[] habits) {
        this.habits = habits;
    }



    public void eat(){
        System.out.println( "I am eating");
    }
    public abstract void respond();



    @Override
    public String toString() {
        return species+("( nickname='" + nickname + "',age=" + age + ", tricklevel= " + trickLevel + ", habits= " + Arrays.toString(habits));
    }


    public Pet(String nickname) {
        this.species = Species.Unknown;
        this.nickname = nickname;
    }
    public Pet(String nickname, int age, int trickLevel, String[] habits) {
        this.species = Species.Unknown;
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }
    public Pet() {
    }
}
