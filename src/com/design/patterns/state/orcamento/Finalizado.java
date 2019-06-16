package com.design.patterns.state.orcamento;

public class Finalizado implements EstadoDeUmOrcamento {

	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {
	}

	@Override
	public void aprova(Orcamento orcamento) {
		throw new RuntimeException("Orçamento finalizado! Não pode mais ser mudado!");
	}

	@Override
	public void reprova(Orcamento orcamento) {
		throw new RuntimeException("Orçamento finalizado! Não pode mais ser mudado!");		
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		throw new RuntimeException("Orçamento finalizado! Não pode mais ser mudado!");		
	}

}
