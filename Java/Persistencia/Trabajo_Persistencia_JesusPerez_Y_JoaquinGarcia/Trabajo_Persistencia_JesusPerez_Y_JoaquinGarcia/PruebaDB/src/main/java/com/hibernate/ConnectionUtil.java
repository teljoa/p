package main.java.com.hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;



public class ConnectionUtil {

	
	private static StandardServiceRegistry registry;
	private static SessionFactory sessionFactory;
	
	public static SessionFactory getSessionFactory() {
		 if (sessionFactory == null) {
	            try {
	                // Configura y construye el registro de servicios
	                registry = new StandardServiceRegistryBuilder().configure().build();

	                // Crea metadatos desde las fuentes de metadatos
	                Metadata metadata = new MetadataSources(registry).getMetadataBuilder().build();

	                // Construye la SessionFactory a partir de los metadatos
	                sessionFactory = metadata.getSessionFactoryBuilder().build();
	            } catch (Exception e) {
	                e.printStackTrace();
	                if (registry != null) {
	                    StandardServiceRegistryBuilder.destroy(registry);
	                }
	            }
	        }
	        return sessionFactory;}
	
	public static void shutdown() {
		if(registry!=null) {
			StandardServiceRegistryBuilder.destroy(registry);
		}
	}
	
	
	
}
