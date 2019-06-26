package com.design.patterns.command;

import java.util.Calendar;

public class Pedido {
	
	private String cliente;
	private double valor;
	private Status status;
	private Calendar dataFinalizacao;
	
	public Pedido(String cliente, double valor) {
		super();
		this.cliente = cliente;
		this.valor = valor;
	}
	
	public String getCliente() {
		return cliente;
	}
	
	public double getValor() {
		return valor;
	}
	
	public Status getStatus() {
		return status;
	}
	
	public Calendar getDataFinalizacao() {
		return dataFinalizacao;
	}
	
	public void paga() {
		status = Status.PAGO;
	}
	
	public void finaliza() {
		dataFinalizacao = Calendar.getInstance();
		status = Status.ENTREGUE;
	}
	
}
