package com.design.patterns.interpreter;

import com.design.patterns.visitor.Visitor;

public class Subtracao implements Expressao {
	
	private Expressao direita;
	private Expressao esquerda;
	
	public Subtracao(Expressao esquerda, Expressao direita) {
		this.esquerda = esquerda;
		this.direita = direita;
	}

	public Expressao getDireita() {
		return direita;
	}
	
	public Expressao getEsquerda() {
		return esquerda;
	}

	@Override
	public int avalia() {
		int resultadoDaEsquerda = esquerda.avalia();
		int resultadoDaDireita = direita.avalia();
		return resultadoDaEsquerda - resultadoDaDireita;
	}

	@Override
	public void aceita(Visitor visitor) {
		visitor.visitaSubtracao(this);
	}
	
}
