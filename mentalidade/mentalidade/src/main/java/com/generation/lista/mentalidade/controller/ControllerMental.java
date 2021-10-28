package com.generation.lista.mentalidade.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping

public class ControllerMental {

	@GetMapping("/mental")
	public String Mental() {
		return "Mentalidade : Responsabilidade Pessoal + Persistência + Mentalidade de Crescimento" + 
				" | Habilidades: Atenção aos Detalhes + Proatividade";
	}
}
