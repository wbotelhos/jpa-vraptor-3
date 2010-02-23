package com.wordpress.wbotelhos.dao;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;

import br.com.caelum.vraptor.ioc.Component;

import com.wordpress.wbotelhos.model.Usuario;

/**
 * @author Washington Botelho dos Santos
 * @artigo http://wbotelhos.wordpress.com/2010/02/23/jpa-e-vraptor-3/
 */

@Component
public class UsuarioDao {

	 private EntityManager manager;

	 UsuarioDao (EntityManager manager) {
	   this.manager = manager;
	 }

	public Usuario loadByNome(String nome) throws Exception {
		try {
			Query query = manager.createQuery("from Usuario e where e.nome = :nome");
			query.setParameter("nome", nome);
			Usuario usuario = (Usuario) query.getSingleResult();
			return usuario;
		} catch (NoResultException e) {
			manager.getTransaction().rollback();
			throw new Exception("Nenhum resultado!");
		} catch (Exception e) {
			manager.getTransaction().rollback();
			throw new Exception("Ocorreu um erro na busca!");
		}
	}
}
