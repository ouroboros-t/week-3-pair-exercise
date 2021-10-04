package com.techelevator.crm;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class CustomerTests {
    private Customer testCustomer;

    @Before
    public void setTestCustomer(){
        testCustomer = new Customer("Daiv", "EHs");
    }
    @Test
    public void return_balance_for_3_services(){
        //Arrange:
        Map<String,Double> testMap = new HashMap<String,Double>();
        testMap.put("Walking", 10.00);
        testMap.put("Sitting", 15.00);
        testMap.put("Grooming", 30.00);
        double expected = 55.00;
        //Act:
        double actual = testCustomer.getBalanceDue(testMap);
        //Assert:
        Assert.assertEquals(expected,actual,0);
        //delta - how "off" from each other the numbers have to be to be equal.



    }
    @Test
    public void return_accurate_balance_for_2_services(){
        //Arrange:
        Map<String,Double> testMap = new HashMap<String,Double>();
        testMap.put("Walking", 15.00);
        testMap.put("Sitting", 15.00);
        double expected = 30.00;
        //Act:
        double actual = testCustomer.getBalanceDue(testMap);
        //Assert:
        Assert.assertEquals(expected,actual,0);
        //delta - how "off" from each other the numbers have to be to be equal.

    }
    @Test
    public void return_accurate_balance_for_1_services(){
        //Arrange:
        Map<String,Double> testMap = new HashMap<String,Double>();
        testMap.put("Walking", 15.28);
        double expected = 15.28;
        //Act:
        double actual = testCustomer.getBalanceDue(testMap);
        //Assert:
        Assert.assertEquals(expected,actual,0);
        //delta - how "off" from each other the numbers have to be to be equal.

    }
    @Test
    public void return_accurate_balance_for_0_services(){
        //Arrange:
        Map<String,Double> testMap = new HashMap<String,Double>();
        testMap.put("",0.00);
        double expected = 0.00;
        //Act:
        double actual = testCustomer.getBalanceDue(testMap);
        //Assert:
        Assert.assertEquals(expected,actual,0);
        //delta - how "off" from each other the numbers have to be to be equal.

    }

}
