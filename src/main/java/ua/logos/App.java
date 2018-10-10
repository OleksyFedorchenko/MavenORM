package ua.logos;

import ua.logos.entity.Category;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App
{
    public static void main( String[] args ) {

        EntityManagerFactory factory= Persistence.createEntityManagerFactory("logos");
        EntityManager em = factory.createEntityManager();
        em.getTransaction().begin();

//        Category category = new Category();
//        category.setName("Mobile");
//        em.persist(category);


        em.getTransaction().commit();
        em.close();
        factory.close();

    }
}
