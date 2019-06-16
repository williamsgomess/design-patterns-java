package com.design.patterns.state.orcamento;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.design.patterns.Item;

public class Orcamento {

	protected double valor;
	private List<Item> itens;
	protected EstadoDeUmOrcamento estadoAtual;

	public Orcamento(double valor) {
		this.valor = valor;
		this.itens = new ArrayList<Item>();
		this.estadoAtual = new EmAprovacao();
	}
	
	public Orcamento() {
		this.estadoAtual = new EmAprovacao();
	}

	public double getValor() {
		return valor;
	}

	public List<Item> getItens() {
		return Collections.unmodifiableList(itens);
	}
	
	public void adicionaItem(Item item) {
		itens.add(item);
	}

	public boolean possuiItemDeNome(String nomeDoItem) {
		for (Item item : itens) {
			if (item.getNome().equalsIgnoreCase(nomeDoItem)) return true;
		}
		
		return false;
	}
	
	public void aplicaDescontoExtra() {
		this.estadoAtual.aplicaDescontoExtra(this);
	}
	
	public void aprova() {
		this.estadoAtual.aprova(this);
	}
	
	public void reprova() {
		this.estadoAtual.reprova(this);
	}
	
	public void finaliza() {
		this.estadoAtual.finaliza(this);
	}
	
}
