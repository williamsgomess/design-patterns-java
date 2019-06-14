package com.design.patterns.templateMethods.relatorios;

import java.util.List;

import com.design.patterns.strategy.Conta;

public abstract class Relatorio {
	
	protected abstract void cabecalho();
	protected abstract void rodape();
	protected abstract void corpo(List<Conta> contas);
	
	public void imprime(List<Conta> contas) {
		cabecalho();
		corpo(contas);
		rodape();
	}

}
