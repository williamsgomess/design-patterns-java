package com.design.patterns.visitor;

import com.design.patterns.interpreter.Numero;
import com.design.patterns.interpreter.Soma;
import com.design.patterns.interpreter.Subtracao;

public class PreFixaVisitor implements Visitor {

	@Override
	public void visitaSoma(Soma soma) {
		System.out.println(" + ");
		System.out.println("(");
		soma.getEsquerda().aceita(this);
		System.out.println(" ");
		soma.getDireita().aceita(this);
		System.out.println(")");
	}

	@Override
	public void visitaSubtracao(Subtracao subtracao) {
		System.out.println(" - ");
		System.out.println("(");
		subtracao.getEsquerda().aceita(this);
		System.out.println(" ");
		subtracao.getDireita().aceita(this);
		System.out.println(")");
	}

	@Override
	public void visitaNumero(Numero numero) {
		System.out.println(numero.getNumero());
	}

}
