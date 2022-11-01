package hw5;

public class Main {
    public static void main(String[] args) {
        Human mother = new Human("Malahat","Ibrahimli",1968);
        Human father = new Human("Abdurahim","Ibrahimli",1954);
        Pet pet = new Pet("Dog","Kuku",3,61,new String[]{"play,eat"});
        Family family = new Family(mother,father);
        System.out.println("Before : "+family);
        family.addChild(new Human("Azar","Ibrahimli",1998));
        System.out.println("After : "+family);


    }

}