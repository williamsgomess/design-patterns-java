package com.design.patterns.chainOfResponsibility;

import com.design.patterns.state.orcamento.Orcamento;

public class DescontoPorMaisDeQuinhentosReais implements Desconto {
	
	private Desconto proximo;

	@Override
	public double desconta(Orcamento orcamento) {
		if (orcamento.getValor() > 500)
			return orcamento.getValor() * 0.07;
		else return proximo.desconta(orcamento);
	}

	@Override
	public void setProximo(Desconto proximo) {
		this.proximo = proximo;
	}

}