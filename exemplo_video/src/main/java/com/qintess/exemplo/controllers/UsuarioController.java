package com.qintess.exemplo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qintess.exemplo.dados.UsuarioRepo;
import com.qintess.exemplo.entidades.Usuario;

@RestController
@RequestMapping("/api")
public class UsuarioController {
	
	@Autowired
	private UsuarioRepo repo;
	
	@GetMapping("/usuario")
	public List<Usuario> getUsuarios(){
		return repo.findAll();
	}
	
	@PostMapping("/usuario")
	public void criaUsuario(@RequestBody Usuario usuario) {		
		repo.save(usuario);
	}

}
