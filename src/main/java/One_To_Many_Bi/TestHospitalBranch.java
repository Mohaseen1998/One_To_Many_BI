package One_To_Many_Bi;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestHospitalBranch {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("vikas");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Hospital hs = new Hospital();
		hs.setName("apollo");
		hs.setGetadd("banglore");
		hs.setWeb("apollo.com");

		Branch b = new Branch();
		b.setAds("jalahalli village");
		b.setName("git");
		b.setPhone(6598592);

		Branch b1 = new Branch();
		b1.setAds("hv");
		b1.setName("cardio");
		b1.setPhone(471442);

		List<Branch> br = new ArrayList<Branch>();
		br.add(b);
		br.add(b1);

		hs.setBra(br);
		b.setH(hs);
		b1.setH(hs);

		et.begin();
		em.persist(hs);
		em.persist(b1);
		em.persist(b);
		et.commit();
	}
}
