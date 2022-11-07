package hw9;


import hw9.model.Family;

import java.util.List;

public class FamilyService {
    FamilyDao familyDao;

    public List<Family> getAllFamilies(){
        return familyDao.getAllFamilies();
    }
}
