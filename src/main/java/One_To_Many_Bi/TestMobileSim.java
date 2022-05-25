package One_To_Many_Bi;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestMobileSim {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("vikas");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Mobile m = new Mobile();
		m.setName("apple");
		m.setCost(50000);

		Sim s1 = new Sim();
		s1.setProvider("jio");
		s1.setType("4G");

		Sim s2 = new Sim();
		s2.setProvider("Airtel");
		s2.setType("5G");
		List<Sim> s = new ArrayList<Sim>();
		s.add(s1);
		s.add(s2);
		m.setSims(s);
		s1.setMob(m);
		s2.setMob(m);
		et.begin();
		em.persist(m);
		em.persist(s1);
		em.persist(s2);
		et.commit();
	}
}
