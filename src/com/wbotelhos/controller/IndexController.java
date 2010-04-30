package com.wbotelhos.controller;

import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Resource;

/**
 * @author Washington Botelho dos Santos
 * @artigo http://wbotelhos.com/2010/02/23/jpa-e-vraptor-3
 */

@Resource
public class IndexController {

	@Path("/")
	public void index() {
	}

}