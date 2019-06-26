package com.design.patterns.visitor;

import com.design.patterns.interpreter.Numero;
import com.design.patterns.interpreter.Soma;
import com.design.patterns.interpreter.Subtracao;

public interface Visitor {
	
	void visitaSoma(Soma soma);
	void visitaSubtracao(Subtracao subtracao);
	void visitaNumero(Numero numero);

}
