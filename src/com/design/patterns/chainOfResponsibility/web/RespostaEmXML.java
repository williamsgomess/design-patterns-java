package com.design.patterns.chainOfResponsibility.web;

import com.design.patterns.Conta;
import com.design.patterns.Requisicao;

public class RespostaEmXML implements Resposta {
	
	private Resposta outraResposta;
	
	public RespostaEmXML(Resposta outraResposta) {
		this.outraResposta = outraResposta;
	}

	@Override
	public void responde(Requisicao req, Conta conta) {
		if (req.getFormato() == Formato.XML) {
			System.out.println("<conta><titular>" + conta.getTitular() + "</titular>"
					+ "<saldo>" + conta.getSaldo() + "</saldo></conta>");
		} else outraResposta.responde( req, conta);
	}

}
