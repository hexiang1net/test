package hx.domain.test;

import java.util.List;

import hx.domain.jpa.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DomainTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
//		jpa();
		
		jpaselect();
		
//		hibernate();
		
//		hibernateSelect();
		
	}
	
	
	public static void hibernate(){
		
		SessionFactory sf = new Configuration().configure("/hibernate/hibernate.cfg.xml").buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = null;
		
		hx.domain.hibernate.User u = new hx.domain.hibernate.User();
		u.setAddress("xxxbb");
		u.setAge("gg");
		u.setEmail("xx@gmail.com");
		u.setName("bbxxx123");
		u.setPhone("22222");
		try {
			t = s.beginTransaction();
			
			s.save(u);
			t.commit();
			
			System.out.println("===insert success ");
			
		} catch (Exception e) {
			t.rollback();
			e.printStackTrace();
		}finally{
			s.close();
			sf.close();
		}
		
		
		
	}
	
	public static void hibernateSelect(){
		
		SessionFactory sf = new Configuration().configure("/hibernate/hibernate.cfg.xml").buildSessionFactory();
		Session s = sf.openSession();
//		Transaction t = null;
		
		try {
//			t = s.beginTransaction();
//			
//			t.commit();
			hx.domain.hibernate.User u = (hx.domain.hibernate.User) s.load(hx.domain.hibernate.User.class, "bbxxx123");
			
			
			System.out.println("===insert success user mail:"+u.getEmail());
			
		} catch (Exception e) {
//			t.rollback();
			e.printStackTrace();
		}finally{
			s.close();
			sf.close();
		}
		
		
		
	}
	
	
	public static void jpa(){
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mytest");
		User u = new User();
		u.setAddress("xxxbb");
		u.setAge("gg");
		u.setEmail("xx@gmail.com");
		u.setName("bbxxx");
		u.setPhone("22222");
		
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(u);
		em.getTransaction().commit();
		em.close();
		emf.close();
		
		System.out.println("success==");
		
	}
	
	
	public static void jpaselect(){
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mytest");
		
		EntityManager em = emf.createEntityManager();
		Query query = em.createQuery("from User u");
		List<User> list  = query.getResultList();
		
		
		em.close();
		emf.close();
		
		for(User u : list){
			System.out.println("===email:"+u.getEmail());
		}
		System.out.println("success==");
		
	}

}
