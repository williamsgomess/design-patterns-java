package com.design.patterns.state.conta;

public class Negativo implements EstadoDaConta {

	@Override
	public void saca(Conta conta, double valor) {
		throw new RuntimeException("Conta está no vermelho! Não é possível sacar!");
	}

	@Override
	public void deposita(Conta conta, double valor) {
		conta.saldo += valor * 0.95;
		if (conta.getSaldo() > 0) conta.estadoDaConta = new Positivo();
	}

}
