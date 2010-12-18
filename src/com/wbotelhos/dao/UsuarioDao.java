package com.wbotelhos.dao;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;

import br.com.caelum.vraptor.ioc.Component;

import com.wbotelhos.model.Usuario;

/**
 * @author Washington Botelho
 * @artigo http://wbotelhos.com.br/2010/02/23/jpa-e-vraptor-3
 */

@Component
public class UsuarioDao {

	 private EntityManager manager;

	 UsuarioDao (EntityManager manager) {
	   this.manager = manager;
	 }

	public Usuario loadByNome(String nome) throws Exception {
		try {
			Query query = manager.createQuery("from Usuario where nome = :nome");
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