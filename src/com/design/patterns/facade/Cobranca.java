package com.design.patterns.facade;

public class Cobranca {

	private Tipo boleto;
	private Fatura fatura;

	public Cobranca(Tipo boleto, Fatura fatura) {
		this.boleto = boleto;
		this.fatura = fatura;
	}
	
	public Tipo getBoleto() {
		return boleto;
	}
	
	public Fatura getFatura() {
		return fatura;
	}

	public void emite() {
		System.out.println("Emitindo boleto de cobrança!...");
	}

}
