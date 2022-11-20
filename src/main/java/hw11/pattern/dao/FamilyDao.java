package hw11.pattern.dao;


import hw11.model.Family;

import java.util.List;

public interface FamilyDao {
    List<Family> getAllFamilies();
    Family getFamilyByIndex(int index);
    boolean deleteFamily(int index);
    boolean deleteFamily(Family family);
    List<Family> saveFamily(Family family);
}
