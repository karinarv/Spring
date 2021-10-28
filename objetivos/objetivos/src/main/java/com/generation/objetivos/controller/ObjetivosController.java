package com.generation.objetivos.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping


public class ObjetivosController {
		
		@GetMapping("/metas")
		
		public String sayGoals() {
			return "Curso -> AWS | Inglês | Segurança da Informação | Spring | MySQL |" +
				   " Estudos -> PI | Enade";
		}
}
