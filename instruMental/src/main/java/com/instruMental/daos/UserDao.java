package com.instruMental.daos;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;


import com.HibernateUtil;
import com.instruMental.models.Usuario;


public class UserDao {

	public List<Usuario> getAllUsers() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		try {
			CriteriaBuilder builder = session.getCriteriaBuilder();
			CriteriaQuery<Usuario> query = builder.createQuery(Usuario.class);
			Root<Usuario> root = query.from(Usuario.class);
			query.select(root);
			List<Usuario> usuarios = session.createQuery(query).getResultList();
			return usuarios;
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			session.close();
		}
		return null;
	}
	
	
	

}
