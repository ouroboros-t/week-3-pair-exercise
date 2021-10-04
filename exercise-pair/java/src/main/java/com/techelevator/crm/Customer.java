package com.techelevator.crm;

import com.techelevator.Billable;
import com.techelevator.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Customer extends Person implements Billable {
    //ATTRIBUTES
    private String phoneNumber;
    private List<String> pets = new ArrayList<String>();

    //CONSTRUCTOR(S)
    public Customer(String firstName, String lastName, String phoneNumber) {
        super(firstName, lastName);
        this.phoneNumber = phoneNumber;
    }

    public Customer(String firstName, String lastName) {
        super(firstName, lastName);
        this.phoneNumber = "";
    }

    //GETTERS
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public List<String> getPets() {
        return pets;
    }

    //SETTERS
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setPets(List<String> pets) {
        this.pets = pets;
    }

    @Override
    public double getBalanceDue(Map<String, Double> servicesRendered) {
        double balanceDue = 0.0;
        for(String serviceKey : servicesRendered.keySet()){
            balanceDue += servicesRendered.get(serviceKey);
        }
        return balanceDue;
    }


}
