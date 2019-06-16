package com.design.patterns.builder;

public class ItemBuilder {
	
	private String descricao;
	private double valor;
	
	public ItemBuilder comDescricao(String descricao) {
		this.descricao = descricao;
		return this;
	}
	
	public ItemBuilder comValor(double valor) {
		this.valor = valor;
		return this;
	}
	
	public Item build() {
		return new Item(descricao, valor);
	}

}
