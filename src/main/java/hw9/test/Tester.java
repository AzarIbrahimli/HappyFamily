package hw9.test;
import hw9.model.Family;
import hw9.model.Human;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
class Tester {
        Human mother = new Human("Malahat","Ibrahimli",1968);
        Human father = new Human("Abdurahim","Ibrahimli",1954);
        Family family = new Family(mother,father);
        @Test
        public void testAdd(){
                Human child = new Human("Azar","Ibrahimli",1998);
                family.addChild(child);
                assertEquals(family.getChild(0),child);
                assertEquals(family.getChildren().size(),1);
        }

        @Test
        public void testDeleteByIndex(){
                family.addChild(new Human("Azar","Ibrahimli",1998));
                family.deleteChild(0);
                assertEquals(family.getChildren().size(),0);
        }

        @Test
        public void testDeleteByReference(){
                family.addChild(new Human("Azar","Ibrahimli",1998));
                family.deleteChild(new Human("Azar","Ibrahimli",1998));
                assertEquals(family.getChildren().size(),0);
        }

        @Test
        public void testCount(){
                assertEquals(family.countFamily(),2);
        }

        @Test
        public void getByIndex(){
                Human child1 = new Human("Azar","Ibrahimli",1998);
                Human child2 = new Human("Azaz","Ibrahimli",1998);
                Human child3 = new Human("Azazz","Ibrahimli",1998);
                family.addChild(child1);
                family.addChild(child2);
                family.addChild(child3);
                assertEquals(child1,family.getChild(0));
                assertEquals(child2,family.getChild(1));
                assertEquals(child3,family.getChild(2));
        }
}
