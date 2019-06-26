package com.design.patterns.command;

public class ConcluiPedido implements Comando {
	
	private Pedido pedido;
	
	public ConcluiPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	@Override
	public void executa() {
		pedido.finaliza();
	}

}
