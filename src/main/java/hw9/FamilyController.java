package hw9;

import hw9.model.Family;
import hw9.model.Human;
import hw9.model.Pet;
import java.util.List;
import java.util.Set;

public class FamilyController {
    FamilyService familyService;

    public FamilyController(FamilyService familyService) {
        this.familyService = familyService;
    }

    public List<Family> getAllFamilies(){
        return familyService.getAllFamilies();
    }

    public void displayAllFamilies(){
        familyService.displayAllFamilies();
    }

    public List<Family> getFamiliesBiggerThan(int count){
        return familyService.getFamiliesBiggerThan(count);
    }

    public List<Family> getFamiliesLessThan(int count){
        return familyService.getFamiliesLessThan(count);
    }

    public int CountFamiliesWithMemberNumber(int count){
        return familyService.CountFamiliesWithMemberNumber(count);
    }

    public String createNewFamily(Human woman, Human man){
        return familyService.createNewFamily(woman,man);
    }

    public String deleteFamilyByIndex(int index){
        return familyService.deleteFamilyByIndex(index);
    }

    public Family bornChild(Family family,String masculine, String feminine){
        return familyService.bornChild(family,masculine,feminine);
    }

    public Family adoptChild(Family family, Human adoptChild){
        return familyService.adoptChild(family,adoptChild);
    }

    public String deleteAllChildrenOlderThan(int age){
        return familyService.deleteAllChildrenOlderThan(age);
    }


    public int count(){
        return familyService.count();
    }

    public Family getFamilyById(int index){
        return familyService.getFamilyById(index);
    }

    public Set<Pet> getPets(int index){
        return familyService.getPets(index);
    }

    public String addPet(int index, Pet pet){
        return familyService.addPet(index,pet);
    }
}
