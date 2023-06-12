package DAO;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;

import models.ApplyPermissions;

@Component
public class ApplyPermissionDaoImpl {

	private EntityManager em;

	@PersistenceContext
	public void persist(ApplyPermissions apppermission) {
		em.persist(apppermission);
	}
}
