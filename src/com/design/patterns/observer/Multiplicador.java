package com.design.patterns.observer;

import com.design.patterns.builder.NotaFiscal;

public class Multiplicador implements AcaoAposGerarNota {
	
	private double fator;
	
	public Multiplicador(double fator) {
		this.fator = fator;
	}

	@Override
	public void executa(NotaFiscal notaFiscal) {
		System.out.println(notaFiscal.getValorBruto() * this.fator);
	}

}
