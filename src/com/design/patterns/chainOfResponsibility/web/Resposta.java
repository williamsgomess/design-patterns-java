package com.design.patterns.chainOfResponsibility.web;

import com.design.patterns.state.conta.Conta;

public interface Resposta {

	void responde(Requisicao req, Conta conta);
	
}
