package com.design.patterns.strategy.impostos;

import com.design.patterns.state.orcamento.Orcamento;

public class CalculadorDeImpostos {

	public void calcula(Orcamento orcamento, Imposto imposto) {
		double resultado = imposto.calcula(orcamento);
		System.out.println(resultado);
	}
	
}
