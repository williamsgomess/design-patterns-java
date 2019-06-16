package com.design.patterns.templateMethods;

import com.design.patterns.Orcamento;
import com.design.patterns.strategy.impostos.Imposto;

public class ICPP extends TemplateDeImpostoCondicional{
	
	public ICPP(Imposto outroImposto) {
		super(outroImposto);
	}

	@Override
	protected double minimaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.05;
	}

	@Override
	protected double maximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.07;
	}

	@Override
	protected boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() >= 500;
	}

}
