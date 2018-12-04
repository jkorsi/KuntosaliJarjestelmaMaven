/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package otp.mavenkuntosalijarjestelma;
import java.util.logging.Logger;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import static org.hibernate.boot.registry.StandardServiceRegistryBuilder.destroy;

/**
 * @author imssbora
 */
public class HibernateUtil {
  private static StandardServiceRegistry registry;
  private static SessionFactory sessionFactory;

    /**
     * Luo ja palauttaa sessionfactoryn
     * @return sessionfactoryn
     */
    public static SessionFactory getSessionFactory() {
    if (sessionFactory == null) {
      try {
        Metadata metadata = createAndBuildRegistry();

        // Create SessionFactory
        sessionFactory = metadata.getSessionFactoryBuilder().build();

      } catch (Exception e) {
        if (registry != null) {
                    destroy(registry);
        }
      }
    }
    return sessionFactory;
  }

    private static Metadata createAndBuildRegistry() {
        // Create registry
        registry = new StandardServiceRegistryBuilder()
                .configure()
                .build();
        // Create MetadataSources
        MetadataSources sources = new MetadataSources(registry);
        // Create Metadata
        Metadata metadata = sources.getMetadataBuilder().build();
        return metadata;
    }

    /**
     * Sulkee rekisterin
     */
    public static void shutdown() {
    if (registry != null) {
            destroy(registry);
    }
  }
    private static final Logger LOG = Logger.getLogger(HibernateUtil.class.getName());
}

