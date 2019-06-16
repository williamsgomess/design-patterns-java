package com.design.patterns.templateMethods;

import com.design.patterns.Item;
import com.design.patterns.state.orcamento.Orcamento;
import com.design.patterns.strategy.impostos.Imposto;

public class IKCV extends TemplateDeImpostoCondicional {
	
	public IKCV(Imposto outroImposto) {
		super(outroImposto);
	}
	
	public IKCV() {
		super();
	}

	@Override
	protected double minimaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.06;
	}

	@Override
	protected double maximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.10;
	}

	@Override
	protected boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() > 500 && temItemMaiorQue100ReaisNo(orcamento);
	}

	private boolean temItemMaiorQue100ReaisNo(Orcamento orcamento) {
		for (Item item : orcamento.getItens()) {
			if (item.getValor() > 100) return true;
		}
		
		return false;
	}

}
