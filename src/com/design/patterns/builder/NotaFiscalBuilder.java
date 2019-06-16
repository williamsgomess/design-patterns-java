package com.design.patterns.builder;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class NotaFiscalBuilder {

	private String razaoSocial;
	private String cnpj;
	private Calendar dataEmissao;
	private double valorBruto;
	private double impostos;
	private List<Item> itens = new ArrayList<Item>();
	private String observacoes;
	
	public NotaFiscalBuilder() {
		this.dataEmissao = Calendar.getInstance();
	}

	public NotaFiscalBuilder paraEmpresa(String razaoSocial) {
		this.razaoSocial = razaoSocial;
		return this;
	}

	public NotaFiscalBuilder comCnpj(String cnpj) {
		this.cnpj = cnpj;
		return this;
	}

	public NotaFiscalBuilder naData(Calendar dataEmissao) {
		this.dataEmissao = dataEmissao;
		return this;
	}

	public NotaFiscalBuilder com(Item item) {
		this.itens.add(item);
		this.valorBruto += item.getValor();
		this.impostos += item.getValor() * 0.05;
		
		return this;
	}

	public NotaFiscalBuilder comObservacoes(String observacoes) {
		this.observacoes = observacoes;
		return this;
	}
	
	public NotaFiscal build() {
		return new NotaFiscal(razaoSocial, cnpj, dataEmissao, valorBruto, impostos, itens, observacoes);
	}

}
