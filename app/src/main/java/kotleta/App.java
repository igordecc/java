/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package kotleta;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.ServiceRegistry;

import javax.persistence.EntityManager;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {

    public static Session getCurrentSession() {
        // Hibernate 5.4 SessionFactory example without XML
        Map<String, String> settings = new HashMap<>();
        settings.put("hibernate.connection.driver_class", "org.postgresql.Driver");
        settings.put("hibernate.dialect", "org.hibernate.dialect.PostgreSQLDialect");
        settings.put("hibernate.connection.url", "jdbc:postgresql://localhost:5432/example");
        settings.put("hibernate.connection.username", "admin");
        settings.put("hibernate.connection.password", "admin");
        settings.put("hibernate.current_session_context_class", "thread");
        settings.put("hibernate.show_sql", "true");
        settings.put("hibernate.format_sql", "true");

        ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                .configure().build();

        MetadataSources metadataSources = new MetadataSources(serviceRegistry);
        // metadataSources.addAnnotatedClass(Player.class);
        Metadata metadata = metadataSources.buildMetadata();

        // here we build the SessionFactory (Hibernate 5.4)
        SessionFactory sessionFactory = metadata.getSessionFactoryBuilder().build();
        Session session = sessionFactory.getCurrentSession();
        return session;
    }

    public static void main(String[] args) {
        Session session = getCurrentSession();
        session.beginTransaction();
        EntityManager em = session.getEntityManagerFactory().createEntityManager();
        session.getTransaction().commit();
        addGonorus(em);
        listGonorus(em);
        session.close();
    }

    public static void addGonorus(EntityManager em){
        Gonorus g = new Gonorus(4, "Bid");
        em.getTransaction().begin();
        em.persist(g);
        em.getTransaction().commit();
    }

    public static void listGonorus(EntityManager em) {
        List result = em.createQuery("FROM Gonorus").getResultList();
        for ( Gonorus event : (List<Gonorus>) result ) {
            System.out.println( "Event (" + event. getId()+ ") : " + event.getName() );
        }
    }
}
