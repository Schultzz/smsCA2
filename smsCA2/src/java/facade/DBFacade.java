package facade;

import entity.Person;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

/**
 *
 * @author Søren
 */
public class DBFacade implements DBFacadeInterface {

    private static DBFacade instance;
    private EntityManager em;
    
    
    private DBFacade() {

        em = Persistence.createEntityManagerFactory("smsCA2PU").createEntityManager();
        
    }

    public static DBFacade getInstance() {

        if (instance == null) {
            instance = new DBFacade();
        }

        return instance;
    }

    @Override
    public List<Person> getPersonsList() {
        
        List<Person> persons = em.createNamedQuery("Person.findAll").getResultList();
        return persons;
    }

    @Override
    public Person getPersonByID(int id) {
       
        Person person = em.find(Person.class, id);
        if(person==null){
            //room for error code
        }
        return person;
        
    }

 
}
