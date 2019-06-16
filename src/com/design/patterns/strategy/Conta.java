package com.design.patterns.strategy;

import java.util.Calendar;

public class Conta {

	private String titular;
	private double saldo;
	private int numero;
	private int agencia;
	private Calendar dataAbertura;
	
	public Conta() {
	}
	
	public Conta(String titular, double saldo) {
		this.titular = titular;
		this.saldo = saldo;
	}
	
	public void deposita(double valor) {
		this.saldo += valor;
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
	
}
