package com.design.patterns.state.conta;

import java.util.Calendar;

public class Conta {

	private String titular;
	protected double saldo;
	private int numero;
	private int agencia;
	private Calendar dataAbertura;
	protected EstadoDaConta estadoDaConta;
	
	public Conta() {
		this.estadoDaConta = new Positivo();
	}
	
	public Conta(String titular, double saldo) {
		this.titular = titular;
		this.saldo = saldo;
		this.estadoDaConta = new Positivo();
	}
	
	public String getTitular() {
		return titular;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public int getAgencia() {
		return agencia;
	}

	public Calendar getDataAbertura() {
		return dataAbertura;
	}
	
	public void saca(double valor) {
		this.estadoDaConta.saca(this, valor);
	}
	
	public void deposita(double valor) {
		this.estadoDaConta.deposita(this, valor);
	}
	
}
