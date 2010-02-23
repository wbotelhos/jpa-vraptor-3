package com.wordpress.wbotelhos.controller;

import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;

import com.wordpress.wbotelhos.dao.UsuarioDao;
import com.wordpress.wbotelhos.model.Usuario;

/**
 * @author Washington Botelho dos Santos
 * @artigo http://wbotelhos.wordpress.com/2010/02/23/jpa-e-vraptor-3/
 */

@Resource
@Path("/usuario")
public class UsuarioController {

	private Result result;
	private UsuarioDao usuarioDao;

	public UsuarioController(Result result, UsuarioDao usuarioDao) {
		this.result = result;
		this.usuarioDao = usuarioDao;
	}

	@Get
	@Path("/consultar")
	public Usuario consultar(Usuario entity) {
		try {
			return usuarioDao.loadByNome(entity.getNome());
		} catch (Exception e) {
			result.include("msg", e.getMessage());
		}
		return null;
	}

}