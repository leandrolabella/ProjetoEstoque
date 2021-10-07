package me.devleo.PE.model;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Venda {

    private Integer id;
    private Date data;
    private Float subtotal;
    private Float pagamentoDinheiro;
    private Float pagamentoCartao;
    private final ArrayList<ItemVenda> itensVenda;
    private Integer qtdItens;
    private String NomeCliente;
    private String CPFCliente;

    public Venda() {
        itensVenda = new ArrayList<>();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public String getDataString() {
        SimpleDateFormat fd = new SimpleDateFormat("dd-MM-yyyy");
        return fd.format(data);
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Float getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Float subtotal) {
        this.subtotal = subtotal;
    }

    public Float getPagamentoDinheiro() {
        return pagamentoDinheiro;
    }

    public void setPagamentoDinheiro(Float pagamentoDinheiro) {
        this.pagamentoDinheiro = pagamentoDinheiro;
    }

    public Float getPagamentoCartao() {
        return pagamentoCartao;
    }

    public void setPagamentoCartao(Float pagamentoCartao) {
        this.pagamentoCartao = pagamentoCartao;
    }

    public ArrayList<ItemVenda> getItensVenda() {
        return itensVenda;
    }

    public void adicionarItem(ItemVenda itemVenda) {
        this.itensVenda.add(itemVenda);
    }

    public Integer getQtdItens() {
        return qtdItens;
    }

    public void setQtdItens(Integer qtdItens) {
        this.qtdItens = qtdItens;
    }

    public String getNomeCliente() {
        return NomeCliente;
    }

    public void setNomeCliente(String NomeCliente) {
        this.NomeCliente = NomeCliente;
    }

    public String getCPFCliente() {
        return CPFCliente;
    }

    public void setCPFCliente(String CPFCliente) {
        this.CPFCliente = CPFCliente;
    }

}
