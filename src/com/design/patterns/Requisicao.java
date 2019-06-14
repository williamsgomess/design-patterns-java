package com.design.patterns;

import com.design.patterns.chainOfResponsibility.web.Formato;

public class Requisicao {
	
	private Formato formato;

	public Requisicao(Formato formato) {
		this.formato = formato;
	}

	public Formato getFormato() {
		return formato;
	}
}
