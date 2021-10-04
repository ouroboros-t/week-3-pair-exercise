package com.techelevator.crm;

import com.techelevator.hr.Employee;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class EmployeeTests {
    private Employee testEmployee;

    @Before
    public void setTestEmployee(){
        testEmployee = new Employee("Lulu", "Baggins", "Sorceress", 1000000);
    }

    @Test
    public void return_accurate_balance_with_employee_discount(){
        //Arrange
        Map<String,Double> testMap = new HashMap<String, Double>();
        testMap.put("Walking", 20.00);
        testMap.put("Sitting", 30.00);
        testMap.put("Staring", 10.00);
        double expectedBalance = 50.00;
        //Act
        double actualBalance = testEmployee.getBalanceDue(testMap);
        //Assert
        Assert.assertEquals(expectedBalance,actualBalance,0);

    }
    @Test
    public void return_accurate_balance_without_employee_discount(){
        //Arrange
        Map<String,Double> testMap = new HashMap<String, Double>();
        testMap.put("Grooming", 20.00);
        testMap.put("Sitting", 30.00);
        testMap.put("Staring", 10.00);
        double expectedBalance = 60.00;
        //Act
        double actualBalance = testEmployee.getBalanceDue(testMap);
        //Assert
        Assert.assertEquals(expectedBalance,actualBalance,0);

    }
    @Test
    public void return_accurate_balance_for_0_services(){
        //Arrange
        Map<String,Double> testMap = new HashMap<String, Double>();
        testMap.put("", 0.00);
        double expectedBalance = 0.00;
        //Act
        double actualBalance = testEmployee.getBalanceDue(testMap);
        //Assert
        Assert.assertEquals(expectedBalance,actualBalance,0);

    }
    @Test
    public void return_accurate_balance_with_overwritten_services(){
        //Arrange
        Map<String,Double> testMap = new HashMap<String, Double>();
        testMap.put("Walking", 20.00);
        testMap.put("Sitting", 30.00);
        testMap.put("Staring", 10.00);
        testMap.put("Walking", 10.00);
        double expectedBalance = 45.00;
        //Act
        double actualBalance = testEmployee.getBalanceDue(testMap);
        //Assert
        Assert.assertEquals(expectedBalance,actualBalance,0);

    }



}
