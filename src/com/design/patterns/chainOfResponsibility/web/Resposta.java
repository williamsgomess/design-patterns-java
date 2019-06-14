package com.design.patterns.chainOfResponsibility.web;

import com.design.patterns.strategy.Conta;

public interface Resposta {

	void responde(Requisicao req, Conta conta);
	
}
