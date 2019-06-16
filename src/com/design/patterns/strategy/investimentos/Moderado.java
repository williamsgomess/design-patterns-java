package com.design.patterns.strategy.investimentos;

import java.util.Random;

import com.design.patterns.state.conta.Conta;

public class Moderado implements Investimento {
	
	private Random random;
	
	public Moderado() {
		this.random = new Random();
	}

	@Override
	public double calcula(Conta conta) {
		if (random.nextInt(2) == 0) return conta.getSaldo() * 0.025;
		else return conta.getSaldo() * 0.007;
	}

}
