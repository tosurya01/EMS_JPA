package com.evry.ems.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * 
 * @author venkata.kuppili
 *
 */
public class EntityManagerUtil {
	private static EntityManagerFactory entityManagerFactory = null;

	static {
		entityManagerFactory = Persistence.createEntityManagerFactory("PERSISTENCE");

	}

	/**
	 * 
	 * @return
	 */
	public static EntityManager getEntityManager() {

		EntityManager entityManager = null;
		try {
			entityManager = entityManagerFactory.createEntityManager();
		} catch (Exception e) {
			System.err.println("Exception while getting session");
			e.printStackTrace();
		}
		if (entityManager == null) {
			System.err.println("session is discovered null");
		}

		return entityManager;
	}
}
