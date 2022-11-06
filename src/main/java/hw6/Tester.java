package hw6;
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
                assertEquals(family.getChildren().length,1);
        }

        @Test
        public void testDeleteByIndex(){
                family.addChild(new Human("Azar","Ibrahimli",1998));
                family.deleteChild(0);
                assertEquals(family.getChildren().length,0);
        }

        @Test
        public void testDeleteByReference(){
                family.addChild(new Human("Azar","Ibrahimli",1998));
                family.deleteChild(new Human("Azar","Ibrahimli",1998));
                assertEquals(family.getChildren().length,0);
        }

        @Test
        public void testCount(){
                assertEquals(family.countFamily(),2);
        }
}
