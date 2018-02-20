package com.zipcodewilmington.assessment1.part3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * Created by leon on 2/16/18.
 */
public class PetOwner {

    Pet[] pets;
    String name;


    /**
     * @param name name of the owner of the Pet
     * @param pets array of Pet object
     */
    public PetOwner(String name, Pet... pets) {

        this.name = name;
        this.pets = pets;

    }

    /**
     * @param pet pet to be added to the composite collection of Pets
     */
    public void addPet(Pet pet) {

        List<Pet> newList = Arrays.asList(pets);
        newList.add(pet);

        Pet[] pets = (Pet[]) newList.toArray();


    }

    /**
     * @param pet pet to be removed from the composite collection Pets
     */
    public void removePet(Pet pet) {

        int index = 0;
        for (int i = 0; i < pets.length; i ++) {
            if (pets[i].getName().equals(pet)) {

            }
        }

    }

    /**
     * @param pet pet to evaluate ownership of
     * @return true if I own this pet
     */
    public Boolean isOwnerOf(Pet pet) {
        boolean answer = true;
        for (int i = 0; i < pets.length; i++) {
            if (pet.getOwner().equals(this.getName())) {
                answer = true;
            }
        }
        return answer;
    }

    /**
     * @return the age of the Pet object whose age field is the lowest amongst all Pets in this class
     */
    public Integer getYoungetPetAge() {

        Integer[] petAges = new Integer[pets.length];
        int count = 0;
        for (Pet pet : pets) {
            petAges[count] = pet.getAge();
            count++;
        }
        Arrays.sort(petAges);
        int youngestPet = petAges[0];
        return youngestPet;
    }




    /**
     * @return the age of the Pet object whose age field is the highest amongst all Pets in this class
     */
    public Integer getOldestPetAge() {

        Integer[] petAges = new Integer[pets.length];
        int count = 0;
        for (Pet pet : pets) {
            petAges[count] = pet.getAge();
            count++;
        }
        Arrays.sort(petAges);
        int oldestPet = petAges[pets.length-1];
        return oldestPet;

    }


    /**
     * @return the sum of ages of Pet objects stored in this class divided by the number of Pet object
     */
    public Float getAveragePetAge() {

        Float sum = 0F;
        Float averageAge = 0F;

        if (!(pets.length == 0)) {
            for (Pet pet : pets) {
                sum += pet.getAge();
            }

            averageAge = sum / pets.length;
        }
        return averageAge;
    }

    /**
     * @return the number of Pet objects stored in this class
     */
    public Integer getNumberOfPets() {
        return pets.length;
    }

    /**
     * @return the name property of the Pet
     */
    public String getName() {

        return name;
    }

    /**
     * @return array representation of animals owned by this PetOwner
     */
    public Pet[] getPets() {

        return pets;
    }
}
