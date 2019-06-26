package com.design.patterns.interpreter;

import com.design.patterns.visitor.Visitor;

public class Numero implements Expressao {
	
	private int numero;
	
	public Numero(int numero) {
		this.numero = numero;
	}

	public int getNumero() {
		return numero;
	}

	@Override
	public int avalia() {
		return numero;
	}

	@Override
	public void aceita(Visitor visitor) {
		visitor.visitaNumero(this);
	}
	
}
