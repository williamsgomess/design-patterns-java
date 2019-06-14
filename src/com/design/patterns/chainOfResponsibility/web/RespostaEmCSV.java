package com.design.patterns.chainOfResponsibility.web;

import com.design.patterns.strategy.Conta;

public class RespostaEmCSV implements Resposta {
	
	private Resposta outraResposta;
	
	public RespostaEmCSV(Resposta outraResposta) {
		this.outraResposta = outraResposta;
	}

	@Override
	public void responde(Requisicao req, Conta conta) {
		if (req.getFormato() == Formato.CSV)
			System.out.println(String.format("%s, %d", conta.getTitular(), conta.getSaldo()));
		else outraResposta.responde(req, conta);
	}

}
