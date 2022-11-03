package hw5;

public class Main {
    public static void main(String[] args) {
        Human mother = new Human("Malahat","Ibrahimli",1968);
        Human father = new Human("Abdurahim","Ibrahimli",1954);
        Pet pet = new Pet("Dog","Kuku",3,61,new String[]{"play,eat"});
        Family family = new Family(mother,father,pet);
        System.out.println("Before : "+family);
        family.addChild(new Human("Azar","Ibrahimli",1998)); //0
        System.out.println("After : "+family);
        family.addChild(new Human("Ilgar","Ibrahimli",1998)); //1
        System.out.println("After : "+family);
        family.addChild(new Human("Vugar","Ibrahimli",1998)); //2
        System.out.println("After : "+family);
        System.out.println(family.countFamily());
        family.deleteChild(1);
        System.out.println("After delete : " + family);
        System.out.println(family.deleteChild(0));
        System.out.println("After delete : " + family);
        System.out.println(family.countFamily());

        Human mother2 = new Human("Malahat","Ibrahimli",1968);
        Human father2 = new Human("Abdurahim","Ibrahimli",1954);
        Pet pet2 = new Pet("Dog","Kuku",3,61,new String[]{"play,eat"});
        Family family2 = new Family(mother2,father2,pet2);

        System.out.println("Equals result: "+ family.equals(family2)); //true
    }
}