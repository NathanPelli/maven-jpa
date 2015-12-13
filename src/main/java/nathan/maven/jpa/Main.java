package nathan.maven.jpa;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import nathan.maven.jpa.entity.IdCard;
import nathan.maven.jpa.entity.Person;


public class Main {
	private static final Logger logger = Logger.getLogger("JPA");
	public static void main(String[] args){
		Main main = new Main();
		main.run();
	}
	public void run(){
		EntityManagerFactory factory = null;
		EntityManager entityManager = null;
		try{
			factory = Persistence.createEntityManagerFactory("PersistenceUnit");
			entityManager = factory.createEntityManager();
			persistPerson(entityManager);
			persistGeek(entityManager);
			loadPersons(entityManager);
			addPhones(entityManager);
			createProject(entityManager);
			queryProject(entityManager);
		}catch(Exception e){
			logger.log(Level.SEVERE,e.getMessage(),e);
			e.printStackTrace();
		}finally{
			if(entityManager != null){
				entityManager.close();
			}
			if(factory != null){
				factory.close();
			}
		}
	}
	private void persistPerson(EntityManager entityManager){
		EntityTransaction transaction = entityManager.getTransaction();
		try{
			transaction.begin();
			Person person = new Person();
			person.setFirstName("Homer");
			person.setLastName("Simpson");
			entityManager.persist(person);
			IdCard idCard = new IdCard();
			
			transaction.commit();
		}catch(Exception e){
			if(transaction.isActive()){
				transaction.rollback();
			}
		}
	}
	private void persistGeek(EntityManager entityManager){
		
	}
	private void loadPersons(EntityManager entityManager){
		
	}
	private void addPhones(EntityManager entityManager){
		
	}
	private void createProject(EntityManager entityManager){
		
	}
	private void queryProject(EntityManager entityManager){
		
	}
}
