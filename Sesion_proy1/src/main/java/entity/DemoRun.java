package entity;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class DemoRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManager entityManager = Persistence.createEntityManagerFactory("Sesion_proy1")
				.createEntityManager();

	}

}
