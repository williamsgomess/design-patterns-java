package com.design.patterns.chainOfResponsibility;

import com.design.patterns.Item;
import com.design.patterns.Orcamento;

public class TestaCorrente {
	
	public static void main(String[] args) {
		Desconto descontoPorCincoItens = new DescontoPorCincoItens();
		Desconto descontoPorMaisDeQuinhentosReais = new DescontoPorMaisDeQuinhentosReais();
		Desconto descontoPorVendaCasada = new DescontoPorVendaCasada();
		Desconto semDesconto = new SemDesconto();
		
		descontoPorCincoItens.setProximo(descontoPorMaisDeQuinhentosReais);
		descontoPorMaisDeQuinhentosReais.setProximo(descontoPorVendaCasada);
		descontoPorVendaCasada.setProximo(semDesconto);
		
		Item lapis = new Item("lapis", 15.00);
		Item caneta = new Item("Caneta", 10.00);
		Item borracha = new Item("BORRACHA", 5.00);
		
		Orcamento orcamento = new Orcamento(500.0);
		orcamento.adicionaItem(lapis);
		orcamento.adicionaItem(caneta);
		orcamento.adicionaItem(borracha);
		
		double desconto = descontoPorCincoItens.desconta(orcamento);
		System.out.println(desconto);
	}

}
