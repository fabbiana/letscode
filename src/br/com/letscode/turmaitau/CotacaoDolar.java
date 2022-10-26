package br.com.letscode.turmaitau;

import java.util.Scanner;

public class CotacaoDolar {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);

        System.out.println("Digite o valor em dólar (U$$): ");
        double valorDolar = entrada.nextDouble();

        System.out.println("Digite a cotação do dólar (R$): ");
        double cotacaoDolar = entrada.nextDouble();

        System.out.println("Valor total convertido em R$ " + valorDolar * cotacaoDolar);
    }
}
