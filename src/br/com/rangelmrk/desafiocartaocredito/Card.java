package br.com.rangelmrk.desafiocartaocredito;

import java.util.ArrayList;
import java.util.List;

public class Card {
    private double limite;
    private double saldo;
    private List<Produto> carrinho;

    public Card(double limite) {
        this.limite = limite;
        this.saldo = limite;
        this.carrinho = new ArrayList<>();
    }

    public boolean verificarSaldo(Produto produto){
        if(this.saldo > produto.getValorProduto()){
            this.saldo -= produto.getValorProduto();
            this.carrinho.add(produto);
            return true;
        }
        return false;
    }

    public double getLimite() {
        return limite;
    }

    public double getSaldo() {
        return saldo;
    }

    public List<Produto> getCarrinho() {
        return carrinho;
    }
}
