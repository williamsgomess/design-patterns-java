package com.design.patterns.facade;

public class Fatura {

	private Cliente cliente;
	private double valor;

	public Fatura(Cliente cliente, double valor) {
		this.cliente = cliente;
		this.valor = valor;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	
	public double getValor() {
		return valor;
	}

}
