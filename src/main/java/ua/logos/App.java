package ua.logos;

import ua.logos.entity.Category;
import ua.logos.entity.Course;
import ua.logos.entity.Teacher;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("logos");
        EntityManager em = factory.createEntityManager();
        em.getTransaction().begin();

//        Category category = new Category();
//        category.setName("IOS dev");
//        em.persist(category);
//        category=new Category();
//        category.setName("WEB");
//        em.persist(category);
//        List<Category> categories =
//                em.createQuery("SELECT c FROM Category c",Category.class).getResultList();
//        categories.forEach(System.out::println);
//        Category category = em.createQuery("select c from Category c where c.id = ?1", Category.class).setParameter(1, 2L).getSingleResult();
//        System.out.println(category);
//
//        List<Category> categories = em.createQuery("SELECT  c FROM Category c WHERE c.id=?1 OR c.id=?2", Category.class).setParameter(1, 2L).setParameter(2, 5L).getResultList();

//        Category category=Category.builder()
//                .name("Data Base")
//                .build();
//        em.persist(category);
//
//        Teacher teacher = Teacher.builder()
//                .firstName("Jhon")
//                .lastName("Doe")
//                .email("jhon@gmail.com")
//                .age(34)
//                .build();
//        em.persist(teacher);
//
//        Course course = Course.builder()
//                .title("MySQL")
//                .description("Nice MySQL 8 course")
//                .price(new BigDecimal(199.99))
//                .category(category)
//                .teacher(teacher)
//                .build();
//        em.persist(course);

//        Category category =
//                em.createQuery("SELECT c from Category c WHERE c.id=:categoryID", Category.class)
//                        .setParameter("categoryID", 1L)
//                        .getSingleResult();
//        System.out.println(category);
//        Teacher teacher = em.createQuery("SELECT t FROM Teacher t WHERE t.id=:teacherID", Teacher.class)
//                .setParameter("teacherID", 1L)
//                .getSingleResult();
//        System.out.println(teacher);
//
//        for (int i = 0; i < 15; i++) {
//            Course course=Course.builder()
//                    .title("Course title# "+i)
//                    .description("Course descr# "+i)
//                    .price(new BigDecimal("9"+i+".99"))
//                    .category(category)
//                    .teacher(teacher)
//                    .build();
//            em.persist(course);
//
//        }

//        List<Course> courses = em.createQuery("SELECT c FROM Course c",Course.class).getResultList();
//        courses.forEach(System.out::println);

//        em.createQuery("SELECT c FROM Course c WHERE c.id>=:param1 AND c.id<=:param2",Course.class)
//                .setParameter("param1",5L)
//                .setParameter("param2",10L)
//                .getResultList().forEach(System.out::println);

//        em.createQuery("SELECT c FROM Course c WHERE c.title LIKE :likePatter",Course.class)
//                .setParameter("likePatter", "%#__").getResultList().forEach(System.out::println);


//        List<String> s = new ArrayList<>();
//            s.add("Course title# 3") ;
//            s.add("Course title# 4");
//        em.createQuery("SELECT c FROM Course c WHERE c.title IN (:param1)",Course.class).setParameter("param1",s).getResultList().forEach(System.out::println);

        em.createQuery("SELECT c FROM Course c INNER JOIN c.category cc WHERE c.id=:courseID",Course.class)
                .setParameter("courseID",3L).getResultList().forEach(System.out::println);

        em.getTransaction().commit();
        em.close();
        factory.close();

    }
}
