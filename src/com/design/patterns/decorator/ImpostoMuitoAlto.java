package com.design.patterns.decorator;

import com.design.patterns.state.orcamento.Orcamento;
import com.design.patterns.strategy.impostos.Imposto;

public class ImpostoMuitoAlto extends Imposto {
	
	public ImpostoMuitoAlto(Imposto outroImposto) {
		super(outroImposto);
	}
	
	public ImpostoMuitoAlto() {
		super();
	}

	@Override
	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.2 + calculaOutroImposto(orcamento);
	}

}
