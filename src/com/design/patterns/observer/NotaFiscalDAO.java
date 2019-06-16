package com.design.patterns.observer;

import com.design.patterns.builder.NotaFiscal;

public class NotaFiscalDAO implements AcaoAposGerarNota {

	@Override
	public void executa(NotaFiscal notaFiscal) {
		System.out.println("Gravando no banco de dados!");
	}

}
