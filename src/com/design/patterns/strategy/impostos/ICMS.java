package com.design.patterns.strategy.impostos;

import com.design.patterns.state.orcamento.Orcamento;

public class ICMS extends Imposto {
	
	public ICMS(Imposto imposto) {
		super(imposto);
	}
	
	public ICMS() {
		super();
	}

	@Override
	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.1 + calculaOutroImposto(orcamento);
	}

}
