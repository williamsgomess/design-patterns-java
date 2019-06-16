package com.design.patterns.chainOfResponsibility.web;

import com.design.patterns.state.conta.Conta;

public class RespostaEmPorcento implements Resposta {
	
	private Resposta outraResposta;
	
	public RespostaEmPorcento(Resposta outraResposta) {
		this.outraResposta = outraResposta;
	}
	
	public RespostaEmPorcento() {
	}

	@Override
	public void responde(Requisicao req, Conta conta) {
		if (req.getFormato() == Formato.PORCENTO)
			System.out.println(String.format("%s % %d", conta.getTitular(), conta.getSaldo()));
		else if (outraResposta != null)	
			this.outraResposta = null;
		
		// não existe próxima na corrente, e ninguém atendeu a requisição!
        // poderíamos não ter feito nada aqui, caso não fosse necessário!
		else throw new RuntimeException("Formato de resposta não encontrado");
	}
}