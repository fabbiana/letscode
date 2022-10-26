package br.com.letscode.turmaitau.cestaProduto;

import br.com.letscode.turmaitau.operacoes.Somar;

import java.util.Scanner;

public class CestaProduto {

    String[] nomeProduto;
    Double[] precoProduto;

    public static void main(String[] args) {

        Scanner entrada = new Scanner (System.in);
        System.out.println("Digite a quantidade de produtos: ");
        int qtdeProduto = entrada.nextInt();

        for(int i=0; i < qtdeProduto; i++){

            System.out.println("Informe o nome do produto: ");
            this.nomeProduto[i] = entrada.next();

            System.out.println("Informe o valor do produto: ");
            this.precoProduto[i] = entrada.nextDouble();
        }

        calculaProdutoMaisCaro(qtdeProduto);
        calculaProdutoMaisBarato(qtdeProduto);

    }

    public void calculaProdutoMaisCaro(int qtdeProduto) {

        int idProdutoMaisCaro = 0;

        for (int i = 0; i < qtdeProduto; i++) {
            if (this.precoProduto[i] > this.precoProduto[idProdutoMaisCaro]) {
                idProdutoMaisCaro = i;
            }
        }

        this.exibeProduto(idProdutoMaisCaro, "caro");

    }

    public void calculaProdutoMaisBarato(int qtdeProduto) {

        int idProdutoMaisBarato = 0;

        for (int i = 0; i < qtdeProduto; i++) {
            if (this.precoProduto[i] < this.precoProduto[idProdutoMaisBarato]) {
                idProdutoMaisBarato = i;
            }
        }

        this.exibeProduto(idProdutoMaisBarato, "barato");

    }

    public void exibeProduto(int index, String tipoPreco) {

        System.out.println("Produto mais " + tipoPreco + " : " +  this.nomeProduto[index] + "| Preço: " + this.precoProduto[index]);

    }

}
