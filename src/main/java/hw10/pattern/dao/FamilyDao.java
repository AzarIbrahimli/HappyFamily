package hw10.pattern.dao;


import hw10.model.Family;

import java.util.List;

public interface FamilyDao {
    List<Family> getAllFamilies();
    Family getFamilyByIndex(int index);
    boolean deleteFamily(int index);
    boolean deleteFamily(Family family);
    List<Family> saveFamily(Family family);
}
