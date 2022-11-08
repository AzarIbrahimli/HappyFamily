package hw9;


import hw7.gender.Woman;
import hw9.gender.Man;
import hw9.model.Family;
import hw9.model.Human;
import hw9.model.Pet;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class FamilyService {
    FamilyDao familyDao;

    public FamilyService(FamilyDao familyDao) {
        this.familyDao = familyDao;
    }

    public List<Family> getAllFamilies(){
        return familyDao.getAllFamilies();
    }

    public void displayAllFamilies(){
        for(int i=0;i<getAllFamilies().size();i++){
            System.out.println((i+1) + ". " +familyDao.getFamilyByIndex(i));
        }
    }

    public List<Family> getFamiliesBiggerThan(int count){
        List<Family> bigger = new ArrayList<>();
        for(int i=0;i<getAllFamilies().size();i++){
            if(familyDao.getFamilyByIndex(i).countFamily()>count){
                bigger.add(familyDao.getFamilyByIndex(i));
            }
        } return bigger;
    }

    public List<Family> getFamiliesLessThan(int count){
        List<Family> less = new ArrayList<>();
        for(int i=0;i<getAllFamilies().size();i++){
            if(count>familyDao.getFamilyByIndex(i).countFamily()){
                less.add(familyDao.getFamilyByIndex(i));
            }
        } return less;
    }

    public int CountFamiliesWithMemberNumber(int count){
        int result = 0;
        for(int i = 0;i< getAllFamilies().size();i++){
            if(count == familyDao.getFamilyByIndex(i).countFamily()){
                result = result + 1;
            }
        }
        return result;
    }

    public String createNewFamily(Human woman, Human man){
        Family family = new Family(woman,man);
        familyDao.saveFamily(family);
        return "New family created";
    }

    public String deleteFamilyByIndex(int index){
        for(int i = 0;i< getAllFamilies().size();i++){
            if(index == i){
                familyDao.deleteFamily(index);
            }
        }
        return "Family deleted";
    }

    public Family bornChild(Family family,String masculine, String feminine){
        Random rand = new Random();
        int gender = rand.nextInt(0,2);
        if(gender == 0){
            Human child = new Man(masculine,family.getFather().getSurname(),0);
            family.addChild(child);
        }
        if(gender == 1){
            Human child = new Man(feminine,family.getFather().getSurname(),0);
            family.addChild(child);
        }
        return family;
    }

    public Family adoptChild(Family family, Human adoptChild){
        family.addChild(adoptChild);
        return family;
    }

    public String deleteAllChildrenOlderThan(int age){
        for(int i = 0; i<getAllFamilies().size();i++){
            for(int j = 0; i<getAllFamilies().get(i).getChildren().size();j++){
                if(age > getAllFamilies().get(i).getChildren().get(j).getDateOfBirth()){
                    deleteAllChildrenOlderThan(age);
                }
            }
        }return "Deleted";
    }       /** Not finished */


    public String count(){
        return "The number of families : " + getAllFamilies().size();
    }

    public Family getFamilyById(int index){
        return getAllFamilies().get(index);
    }

    public Set<Pet> getPets(int index){
        return getAllFamilies().get(index).getPet();
    }

    public String addPet(int index, Pet pet){
        getAllFamilies().get(index).getPet().add(pet);
        return "New pet added";
    }




    }












