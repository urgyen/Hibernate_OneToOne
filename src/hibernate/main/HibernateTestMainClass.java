package hibernate.main;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import hibernate.model.Address;
import hibernate.model.UserDetails;
import hibernate.model.Vehicle;

public class HibernateTestMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		UserDetails u1 = new UserDetails();
		// u1.setId(1);
		u1.setUser_name("Urgyen");
		u1.setJoinDate(new Date());
		u1.setDescription("CEO");

		Vehicle v1 = new Vehicle();
		v1.setVehicle_Name("Tiago");
//		v1.setUser(u1);

		Vehicle v2 = new Vehicle();
		v2.setVehicle_Name("Benz");
		// v2.setUser(u1);

		// u1.setVehicle(v1);
		u1.getVehicle().add(v1);
		u1.getVehicle().add(v2);
//		v1.getUser().add(u1);
//		v2.getUser().add(u1);
		

		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

		Session session = sessionFactory.openSession();
		session.beginTransaction();
		//session.save(u1);
		session.persist(u1);
//		session.save(v1);
//		session.save(v2);

		session.getTransaction().commit();

	}

}
