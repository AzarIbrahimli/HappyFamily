package hw4;

public class Main {
    public static void main(String[] args) {
        Human me = new Human("Azar","Ibrahimli",1998);
        Human elder = new Human("Vugar", "Ibrahimli",1987,new Human("Malahat","Ibrahimli",1968),new Human("Abdurahim","Ibrahimli",1954));
        Human older = new Human("Ilgar","Ibrahimli",1988,143,new Pet("Cat","Simba",2,39,new String[]{"sleep","play"}),new Human("Malahat","Ibrahimli",1968),new Human("Abdurahim","Ibrahimli",1954),new String[][]{{"Monday","read"},{"Tuesday","sleep"}});
//        System.out.println(me);
//        System.out.println(elder);
//        System.out.println(older);

        Human mother = new Human("Malahat","Ibrahimli",1968);
        Human father = new Human("Abdurahim","Ibrahimli",1954);
        Pet pet = new Pet("Dog","Kuku",3,61,new String[]{"play,eat"});
        Human child = new Human("Azar","Ibrahimli",1998,168,pet,mother,father,new String[][]{{"Tuesday","Lesson"},{"Thursday","Lesson2"}});
        System.out.println(child);
        child.greetPet();
        child.describePet();
        pet.eat();
        pet.foul();
        pet.foul();
        System.out.println(child.feedPet(false));
    }
}