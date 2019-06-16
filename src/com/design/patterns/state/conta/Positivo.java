package com.design.patterns.state.conta;

public class Positivo implements EstadoDaConta {

	@Override
	public void saca(Conta conta, double valor) {
		conta.saldo -= valor;
		
		if (conta.getSaldo() < 0) conta.estadoDaConta = new Negativo();
	}

	@Override
	public void deposita(Conta conta, double valor) {
		conta.saldo += valor * 0.98;
	}

}
