package com.deloitte.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;

import com.deloitte.bean.Bus;
import com.deloitte.bean.Passenger;
import com.deloitte.exception.PassengerException;

@Transactional
@Repository
public class PassengerDao implements IPassengerDao {

	@PersistenceContext
	EntityManager entityManager;
	static Logger logger = Logger.getLogger(PassengerDao.class);

	@Override
	public int addPassenger(Passenger passenger) throws PassengerException {
		System.out.println("DAO : " + passenger);

		entityManager.persist(passenger);
		logger.info("Saved Passenger : " + passenger.getName());

		return 1;
	}

	@Override
	public List<Passenger> getPassengerList() throws PassengerException {
		String sql = "SELECT list from Passenger list";// JPQL		
		try {
			TypedQuery<Passenger> query = entityManager.createQuery(sql, Passenger.class);
			logger.info("Fetching Passenger  ");
			return query.getResultList();
		} catch (Exception e) {
			e.printStackTrace();
			logger.error("Error in fetching data " + e);
			throw new PassengerException("Error in fetching data ");
		}
	}

	@Override
	public List<String> getBus() throws PassengerException {
		// System.out.println("getCategory");
		TypedQuery<String> query = null;
		try {
			String sql = "SELECT bus.bus from Bus bus";
			query = entityManager.createQuery(sql, String.class);
			logger.info("Fetching Bus ");
			return query.getResultList();
		} catch (Exception e) {
			e.printStackTrace();
			logger.error("Error in loading category " + e);
			throw new PassengerException("Error in loading category ");
		}
		// List<String> aList = new ArrayList<>();
		// aList.add("Running");
		// aList.add("High Jump");
		// aList.add("Hurdles");
		// aList.add("Relay");
		// aList.add("Javelin Throw");
		// aList.add("Shot put");
		// return aList;
	}

	@Override
	public List<Passenger> getPassenger(String to, String from) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("bus");
		EntityManager em = emf.createEntityManager();

		String sql = "SELECT list from bus list where to= :to" + " and from= :from";

		TypedQuery<Passenger> query = entityManager.createQuery(sql, Passenger.class);
		query.setParameter("to", to);
		query.setParameter("from", from);
		em.getTransaction().begin();
		Bus b=new Bus();
		em.persist(b);
		em.getTransaction().commit();

		logger.info("Fetching Passenger  ");
		return query.getResultList();
		
	}

}
