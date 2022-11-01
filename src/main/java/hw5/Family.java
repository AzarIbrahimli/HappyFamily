package hw5;

import java.util.Arrays;

public class Family {
    private Human mother;
    private Human father;
    int size=0;
    private Human[] children = new Human[size+1];
    private Pet pet;


    public Human getMother() {
        return mother;
    }
    public void setMother(Human mother) {
        this.mother = mother;
    }
    public Human getFather() {
        return father;
    }
    public void setFather(Human father) {
        this.father = father;
    }
    public Human[] getChildren() {
        return children;
    }
    public void setChildren(Human[] children) {
        this.children = children;
    }
    public Pet getPet() {
        return pet;
    }
    public void setPet(Pet pet) {
        this.pet = pet;
    }



    public Family(Human mother, Human father) {
        this.mother = mother;
        this.father = father;
        Human[] children = new Human[0];
    }




    public Human[] addChild(Human child){
            children[size] = child;
            size=size+1;
        return children;
    }


    @Override
    public String toString() {
//        if(children==null){
//            return "Family{" +
//                    "mother=" + mother +
//                    ", father=" + father +
//                    ", children=" + Arrays.toString(children) +
//                    ", pet=" + getPet() +
//                    '}';
//        }
        return "Family{" +
                "mother=" + mother +
                ", father=" + father +
                ", children=" + Arrays.toString(children)+
                ", pet=" + getPet() +
                '}';
    }
}
