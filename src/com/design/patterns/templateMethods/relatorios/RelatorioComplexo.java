package com.design.patterns.templateMethods.relatorios;

import java.util.Calendar;
import java.util.List;

import com.design.patterns.strategy.Conta;

public class RelatorioComplexo extends Relatorio {

	@Override
	protected void cabecalho() {
		System.out.println("Banco XYZ");
		System.out.println("Rua da Lagoa, 10");
		System.out.println("(11) 81 99788-7457");
	}

	@Override
	protected void rodape() {
		System.out.println("williams.gomes@a.ficr.edu.br");
		System.out.println(Calendar.getInstance().getTime());
	}

	@Override
	protected void corpo(List<Conta> contas) {
		for (Conta conta : contas) {
			System.out.println(String.format("%s - %2f - %d - %d", 
					conta.getTitular(), conta.getSaldo(), conta.getNumero(), conta.getAgencia()));
		}
	}

}
