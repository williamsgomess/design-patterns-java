package com.design.patterns.decorator;

import com.design.patterns.state.orcamento.Orcamento;
import com.design.patterns.strategy.impostos.ICMS;
import com.design.patterns.strategy.impostos.Imposto;

public class TesteDeImpostoComposto {
	
	public static void main(String[] args) {
		Imposto imposto = new ImpostoMuitoAlto(new ICMS());
		
		Orcamento orcamento = new Orcamento(500.0);
		
		System.out.println(imposto.calcula(orcamento));
	}

}
