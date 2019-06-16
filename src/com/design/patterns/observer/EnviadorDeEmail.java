package com.design.patterns.observer;

import com.design.patterns.builder.NotaFiscal;

public class EnviadorDeEmail implements AcaoAposGerarNota {

	@Override
	public void executa(NotaFiscal notaFiscal) {
		System.out.println("Enviando Email!");
	}

}
