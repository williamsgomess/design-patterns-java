package com.design.patterns.templateMethods;

import java.util.ArrayList;
import java.util.List;

import com.design.patterns.Item;
import com.design.patterns.state.orcamento.Orcamento;

public class IHIT extends TemplateDeImpostoCondicional {

	@Override
	protected double minimaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * (0.01 * orcamento.getItens().size());
	}

	@Override
	protected double maximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.13 + 100;
	}

	@Override
	protected boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		List<String> noOrcamento = new ArrayList<String>();
		
		for (Item item : orcamento.getItens()) {
			if (noOrcamento.contains(item.getNome())) return true;
			else noOrcamento.add(item.getNome());
		}
		
		return false;
	}

}
