package com.design.patterns.interpreter;

import com.design.patterns.visitor.Visitor;

public interface Expressao {
	
	int avalia();
	void aceita(Visitor visitor);

}
