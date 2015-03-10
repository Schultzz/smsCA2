/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import javax.persistence.Entity;

/**
 *
 * @author Søren
 */
@Entity
public class Company extends InfoEntity{
    
    private String name;
    private String description;
    private int cvr;
    private int numEmployees;
    private float marketValue;

    public Company() {
    }

    public Company(String name, String description, int cvr, int numEmployees, float marketValue, String email) {
        super(email);
        this.name = name;
        this.description = description;
        this.cvr = cvr;
        this.numEmployees = numEmployees;
        this.marketValue = marketValue;
    }
    
    
    
    
}
