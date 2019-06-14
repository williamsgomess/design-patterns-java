package com.design.patterns.strategy.impostos;

import com.design.patterns.Orcamento;

public class Teste {
	
	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(500.0);
		Imposto iccc = new ICCC();
		Imposto iss = new ISS();
		Imposto icms = new ICMS();
		
		CalculadorDeImpostos calculadorDeImpostos = new CalculadorDeImpostos();
		
		calculadorDeImpostos.calcula(orcamento, iccc);
		calculadorDeImpostos.calcula(orcamento, iss);
		calculadorDeImpostos.calcula(orcamento, icms);
		
	}

}
