package br.com.rangelmrk.desafiocartaocredito;

import java.util.*;

public class Principal {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o Limite do Cartão");
        double limite = leitor.nextDouble();
        Card cartao = new Card(limite);


        while (true) {

            System.out.println("Digite o produto a ser Comprado");
            String nomeProduto = leitor.next();

            System.out.println("Digite o Valor da Compra");
            double valorProduto = leitor.nextDouble();

            Produto produto = new Produto(nomeProduto, valorProduto);
            boolean finalizarCompra = cartao.verificarSaldo(produto);

            if (!finalizarCompra){
            System.out.println("Saldo insuficiente no cartão");
            break;
                }

            System.out.println("Produto Comprado!");
            System.out.println("Digite 0 para sair ou 1 para continuar");
            int continuar = leitor.nextInt();
            if (continuar == 0){
            break;
            }
        }

        Collections.sort(cartao.getCarrinho());
        System.out.println("Compra Finalizada:");
        for (Produto produto: cartao.getCarrinho()){
            System.out.println(produto.getNomeProduto() + " - " + produto.getValorProduto());
        }
        System.out.println("Saldo do Cartão: " + cartao.getSaldo());





    }
}
