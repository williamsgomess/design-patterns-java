package com.design.patterns.observer;

import com.design.patterns.builder.Item;
import com.design.patterns.builder.NotaFiscalBuilder;

public class TesteObservable {

	public static void main(String[] args) {
		NotaFiscalBuilder builder = new NotaFiscalBuilder();
		builder.adicionaAcao(new EnviadorDeEmail())
			.adicionaAcao(new NotaFiscalDAO())
			.adicionaAcao(new Multiplicador(2))
			.adicionaAcao(new Multiplicador(3))
			.adicionaAcao(new Multiplicador(5.5))
			.paraEmpresa("Linx")
			.comCnpj("123.456.789/0001-10")
			.com(new Item("Storex", 2000))
			.com(new Item("Novo AV", 15000))
			.comObservacoes("Sistema de frente de loja")
			.build();
	}

}
