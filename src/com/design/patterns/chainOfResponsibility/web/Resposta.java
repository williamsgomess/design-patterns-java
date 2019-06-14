package com.design.patterns.chainOfResponsibility.web;

import com.design.patterns.Conta;
import com.design.patterns.Requisicao;

public interface Resposta {

	void responde(Requisicao req, Conta conta);
	
}
