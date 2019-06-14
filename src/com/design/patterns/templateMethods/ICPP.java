package com.design.patterns.templateMethods;

import com.design.patterns.Orcamento;

public class ICPP extends TemplateDeImpostoCondicional{

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
