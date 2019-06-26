package com.design.patterns.facade;

public class ClienteDao {

	public Cliente buscaPorCpf(String cpf) {
		System.out.println("Pesquisando cliente usando o CPF: " + cpf + "...");
		return new Cliente();
	}

}
