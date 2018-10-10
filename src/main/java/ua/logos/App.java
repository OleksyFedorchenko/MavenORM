package ua.logos;

import ua.logos.entity.Category;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class App
{
    public static void main( String[] args ) {

        EntityManagerFactory factory= Persistence.createEntityManagerFactory("logos");
        EntityManager em = factory.createEntityManager();
        em.getTransaction().begin();

//        Category category = new Category();
//        category.setName("IOS dev");
//        em.persist(category);
//
//        category=new Category();
//        category.setName("WEB");
//        em.persist(category);
//        List<Category> categories =
//                em.createQuery("SELECT c FROM Category c",Category.class).getResultList();
//        categories.forEach(System.out::println);
    Category category=em.createQuery("select c from Category c where c.id = ?1",Category.class).setParameter(1,2L).getSingleResult();
        System.out.println(category);


        em.getTransaction().commit();
        em.close();
        factory.close();

    }
}
