package com.design.patterns.strategy.impostos;

import com.design.patterns.Orcamento;

public abstract class Imposto {
	
	private final Imposto outroImposto;
	
	public Imposto(Imposto outroImposto) {
		this.outroImposto = outroImposto;
	}
	
	public Imposto() {
		this.outroImposto = null;
	}
	
	protected double calculaOutroImposto(Orcamento orcamento) {
		return (this.outroImposto == null ? 0 : this.outroImposto.calcula(orcamento));
	}
	
	public abstract double calcula(Orcamento orcamento);

}
