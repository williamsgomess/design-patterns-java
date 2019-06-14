package com.design.patterns.chainOfResponsibility;

import com.design.patterns.Orcamento;

public interface Desconto {

	double desconta(Orcamento orcamento);
	void setProximo(Desconto proximo);
	
}
