/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tester;

import entity.Company;
import entity.Person;
import facade.DBFacade;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

/**
 *
 * @author Søren
 */
public class Test {
    
    public static void main(String[] args) {
        //Persistence.generateSchema("smsCA2PU", null);
        EntityManager em = Persistence.createEntityManagerFactory("smsCA2PU").createEntityManager();
        DBFacade dbf = DBFacade.getInstance();
        Person p1 = new Person("Jannik", "Green", "Per@lars.hans");
        Person p2 = new Person("Per", "Hansen", "Per@asd.hans");
        Company c1 = new Company("Snaps A/S", "Vi laver snaps", 24832, -7, 1337, "123@asd.dk");
        
//        em.getTransaction().begin();
//        em.persist(p1);
//        em.persist(p2);
//        em.persist(c1);
//        em.getTransaction().commit();
        
        c1.setName("Per og co.");
        dbf.editCompany(c1);
        dbf.addPerson(p1);
        dbf.addPerson(p2);
        
        //System.out.println(dbf.getPersonByID(1).getFirstName());
    }
    
}
