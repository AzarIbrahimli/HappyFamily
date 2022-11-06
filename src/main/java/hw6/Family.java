package hw6;

import java.util.Arrays;

public class Family {
    private Human mother;
    private Human father;
    private Human[] children;
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

    public Human getChild(int index) {
        if(children.length<=index || index<0){
            throw new IllegalArgumentException("Index out of range");
        }
        return children[index];
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
        this.children = new Human[0];
    }
    public Family(Human mother, Human father, Pet pet) {
        this.mother = mother;
        this.father = father;
        this.pet=pet;
        this.children= new Human[0];
    }


    public Human[] addChild(Human child) {
        Human[] ch = new Human[children.length+1];
        for(int i=0;i<children.length;i++){
            ch[i] = children[i];
        }
        ch[ch.length-1] = child;
        children=ch;
        return children;
    }

    public boolean deleteChild(int index) {
        boolean enter = false;
        boolean result = false;
        if (index < children.length) {
            Human ch[] = new Human[children.length - 1];
            for (int i = 0; i < ch.length; i++) {
                if (i != index && enter == false) {
                    ch[i] = children[i];
                } else {
                    ch[i] = children[i + 1];
                    enter = true;
                }
            }
            children = ch;
            result = true;
        } return result;
    }


    public boolean deleteChild(Human child){
        boolean result = false;
        for(int i=0;i<children.length;i++){
            if(child.equals(children[i])){
                deleteChild(i);
                result = true;
            }
        } return result;
//        boolean result = false;
//        Human[] ch = new Human[children.length-1];
//        for(int i=0;i<children.length;i++){
//            if(!child.equals(children[i])){
//                ch[i]=children[i];
//            }
//            else{
//                if(i==children.length-1){
//                    result = true;
//                    return result;
//                }
//                ch[i]=children[i+1];
//                result = true;
//                return result;
//            }
//        }
//        return result;
    }


    public int countFamily(){
        return children.length+2;
    }

    @Override
    public String toString() {

            return "Family{" +
                    "mother=" + mother +
                    ", father=" + father +
                    ", children=" + Arrays.toString(children) +
                    ", pet=" + getPet() +
                    '}';
        }


    @Override
    public boolean equals(Object given) {
        if (given == null) return false;
        if (given==this) return true;
        if(!(given instanceof Human)) return false;
        Family that = (Family) given;
        return mother.getName().equals(that.mother.getName())
                && father.getName().equals(that.father.getName());
    }
}

