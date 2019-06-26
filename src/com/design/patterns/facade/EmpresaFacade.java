package com.design.patterns.facade;

public class EmpresaFacade {

    public Cliente buscaCliente(String cpf) {
        return new ClienteDao().buscaPorCpf(cpf);
    }
    public Fatura criaFatura(Cliente cliente, double valor) {
        Fatura fatura = new Fatura(cliente, valor);
        return fatura;
    }

    public Cobranca geraCobranca(Fatura fatura) {
        Cobranca cobranca = new Cobranca(Tipo.BOLETO, fatura);
        cobranca.emite();

        return cobranca;
    }

    public ContatoCliente fazContato(Cliente cliente, Cobranca cobranca) {
        ContatoCliente contato = new ContatoCliente(cliente, cobranca);
        contato.dispara();

        return contato;
    }
}