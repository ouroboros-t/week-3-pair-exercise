package com.techelevator.crm;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class PetTests {
private Pet testPet;

    @Before
    public void setPetTestObject(){
       testPet = new Pet("TestName", "TestSpecies");
    }

    //always public always return void always_name_what_you_want_it_to_return
    @Test
    public void return_list_displays_multiple_vaccinations(){
        //Arrange
        String expected = "Rabies, Distemper, Parvo, Adenovirus, ChickenGestation, Death";
        List<String> testList = new ArrayList<String>();
        testList.add("Rabies");
        testList.add("Distemper");
        testList.add("Parvo");
        testList.add("Adenovirus");
        testList.add("ChickenGestation");
        testList.add("Death");
        //Act
        testPet.setVaccinations(testList);
        String actual = testPet.listVaccinations();
        System.out.println(actual);
        //Assert
        Assert.assertEquals(expected, actual);

    }
    @Test
    public void return_list_displays_single_vaccination(){
        Pet testPet = new Pet("TestName", "TestSpecies");
        //Arrange
        String expected = "Heartworm";
        List<String> testList = new ArrayList<String>();
        testList.add("Heartworm");

        //Act
        testPet.setVaccinations(testList);
        String actual = testPet.listVaccinations();
        System.out.println(actual);
        //Assert
        Assert.assertEquals(expected, actual);

    }
    @Test
    public void return_list_displays_2_vaccinations(){
        Pet testPet = new Pet("TestName", "TestSpecies");
        //Arrange
        String expected = "Heartworm, Ultima";
        List<String> testList = new ArrayList<String>();
        testList.add("Heartworm");
        testList.add("Ultima");

        //Act
        testPet.setVaccinations(testList);
        String actual = testPet.listVaccinations();
        System.out.println(actual);
        //Assert
        Assert.assertEquals(expected, actual);

    }
    @Test
    public void return_list_displays_blank_when_blank(){
        Pet testPet = new Pet("TestName", "TestSpecies");
        //Arrange
        String expected = "";
        List<String> testList = new ArrayList<String>();
        //Act
        testPet.setVaccinations(testList);
        String actual = testPet.listVaccinations();
        System.out.println(actual);
        //Assert
        Assert.assertEquals(expected, actual);

    }
    @Test
    public void return_list_displays_null_when_null(){
        Pet testPet = new Pet("TestName", "TestSpecies");
        //Arrange
        String expected = "null";
        List<String> testList = new ArrayList<String>();
        testList.add(null);
        //Act
        testPet.setVaccinations(testList);
        String actual = testPet.listVaccinations();
        System.out.println(actual);
        //Assert
        Assert.assertEquals(expected, actual);

    }




}
