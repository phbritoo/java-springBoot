package com.algaWorks.comercialApi.controller;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algaWorks.comercialApi.model.Oportunidade;

@RestController
@RequestMapping("/oportunidades")
public class OportunidadeController {

	@GetMapping
	public List<Oportunidade> listar() {
		Oportunidade oportunidade = new Oportunidade();
		oportunidade.setId(1L);
		oportunidade.setDescricao("teste");
		oportunidade.setNomeProspecto("Teste");
		oportunidade.setValor(new BigDecimal(111111));
		
		return Arrays.asList(oportunidade);
	}
	
}
