package com.design.patterns.chainOfResponsibility;

import com.design.patterns.state.orcamento.Orcamento;

public class SemDesconto implements Desconto {

	@Override
	public double desconta(Orcamento orcamento) {
		return 0;
	}

	@Override
	public void setProximo(Desconto proximo) {
	}

}
