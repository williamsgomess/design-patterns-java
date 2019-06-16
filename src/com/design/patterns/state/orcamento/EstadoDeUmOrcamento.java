package com.design.patterns.state.orcamento;

public interface EstadoDeUmOrcamento {

	void aplicaDescontoExtra(Orcamento orcamento);

	void aprova(Orcamento orcamento);

	void reprova(Orcamento orcamento);

	void finaliza(Orcamento orcamento);

}
