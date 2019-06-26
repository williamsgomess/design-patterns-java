package com.design.patterns.interpreter;

import com.design.patterns.visitor.Visitor;

public class RaizQuadrada implements Expressao {
	
	private Expressao expressao;
	
	public RaizQuadrada(Expressao expressao) {
		this.expressao = expressao;
	}

	@Override
	public int avalia() {
		return (int) Math.sqrt(expressao.avalia());
	}

	@Override
	public void aceita(Visitor visitor) {
		// TODO Auto-generated method stub
		
	}

}
