/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jpaexample1;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
/**
 *
 * @author Victor
 */
public class JPAExample1 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Person2 pr = new Person2();
    pr.setName("Dede");
    pr.setAlamat("Jogja");
    pr.setNo("089787878");
    
    JPAExample1 ad = new JPAExample1();
    ad.persist(pr);
    }
    
    public void persist(Object object){
        EntityManagerFactory emf = javax.persistence.Persistence.createEntityManagerFactory("JPA");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        try {
            em.persist(object);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        }finally{
            em.clear();
        }
    }
}
