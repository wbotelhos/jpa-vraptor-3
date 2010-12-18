package com.wbotelhos.controller;

import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;

import com.wbotelhos.dao.UsuarioDao;
import com.wbotelhos.model.Usuario;

/**
 * @author Washington Botelho
 * @artigo http://wbotelhos.com.br/2010/02/23/jpa-e-vraptor-3
 */

@Resource
public class UsuarioController {

	private Result result;
	private UsuarioDao usuarioDao;

	public UsuarioController(Result result, UsuarioDao usuarioDao) {
		this.result = result;
		this.usuarioDao = usuarioDao;
	}

	@Get
	@Path("/usuario/consultar")
	public Usuario consultar(Usuario entity) {
		try {
			return usuarioDao.loadByNome(entity.getNome());
		} catch (Exception e) {
			result.include("msg", e.getMessage());
		}
		return null;
	}

}