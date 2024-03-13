package br.com.cod3r.Exerciciossb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cod3r.Exerciciossb.models.entities.Cliente;


@RestController
@RequestMapping("/cliente")
public class ClienteController {
	
	@GetMapping("/qualquer")
	public Cliente ObterCliente() {
		return new Cliente(28,"Maria","123456789-00" );
	}

}
