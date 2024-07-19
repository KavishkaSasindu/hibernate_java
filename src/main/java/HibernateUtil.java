import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateUtil {
     private static final SessionFactory sessionFactory =buildSessionFactory();

     private static SessionFactory buildSessionFactory() {
         StandardServiceRegistry standardRegistry = new StandardServiceRegistryBuilder()
                 .configure("./hibernate.cfg.xml")
                 .build();

         Metadata metadata = new MetadataSources(standardRegistry)
                 .addAnnotatedClass(CustomerEntity.class)
                 .getMetadataBuilder()
                 .build();

         return  metadata.getSessionFactoryBuilder()
                 .build();
     }

     public static Session getSession() {
         return sessionFactory.openSession();
     }
}
