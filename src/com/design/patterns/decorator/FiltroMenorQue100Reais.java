package com.design.patterns.decorator;

import java.util.ArrayList;
import java.util.List;

import com.design.patterns.state.conta.Conta;

public class FiltroMenorQue100Reais extends Filtro {

	public FiltroMenorQue100Reais(Filtro outroFiltro) {
		super(outroFiltro);
	}

	public FiltroMenorQue100Reais() {
		super();
	}

	@Override
	public List<Conta> filtra(List<Conta> contas) {
		List<Conta> filtrada = new ArrayList<Conta>();
		for (Conta conta : filtrada) {
			if (conta.getSaldo() < 100) filtrada.add(conta);
		}
		
		filtrada.addAll(proximo(contas));
		return filtrada;
	}

}
