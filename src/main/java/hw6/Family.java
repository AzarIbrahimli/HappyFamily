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

    public boolean deleteChild(int index){
        if(children.length>index){
            boolean delete = false;
            Human ch[] = new Human[children.length-1];
            for(int i=0;i<children.length;i++){
                if(i==index){ i++;
                    delete = true;}
                if(delete==false){
                    ch[i]=children[i];
                }
                else{
                    ch[i-1]=children[i];
                }
            }
            children = ch;
            return true;
        }
        else return false;
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
        if(!(given instanceof Family)) return false;
        Family that = (Family) given;
        return mother.equals(that.mother)
                && father.equals(that.father);
    }
}

