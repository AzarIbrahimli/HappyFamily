package hw9.test;

import hw9.CollectionFamilyDao;
import hw9.model.Family;
import hw9.model.Human;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

public class testCollectionFamilyDao {
    Human mother = new Human("Malahat","Ibrahimli",1968);
    Human father = new Human("Abdurahim","Ibrahimli",1954);
    Family family = new Family(mother,father);
    List<Family> list = new ArrayList<>();
    CollectionFamilyDao collectionFamilyDao = new CollectionFamilyDao();



    @Test
    public void save(){
        Human mother2 = new Human("Malahat","Ibrahimli",1968);
        Human father2 = new Human("Abdurahim","Ibrahimli",1954);
        Family family2 = new Family(mother2,father2);
        collectionFamilyDao.saveFamily(family);
        collectionFamilyDao.saveFamily(family2);
        assertEquals(2,collectionFamilyDao.getAllFamilies().size());
    }

    @Test
    public void deleteFamily(){
        Human mother2 = new Human("Malahat","Ibrahimli",1968);
        Human father2 = new Human("Abdurahim","Ibrahimli",1954);
        Family family2 = new Family(mother2,father2);
        list.add(family);
        list.add(family2);

    }
}
