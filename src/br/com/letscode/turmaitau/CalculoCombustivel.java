package br.com.letscode.turmaitau;

import java.util.Scanner;

public class CalculoCombustivel {
    final static int KM_LITRO = 12;

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);

        System.out.println("Digite o tempo gasto na viagem (horas): ");
        double tempoViagem = entrada.nextDouble();

        System.out.println("Digite a velocidade média (km/h): ");
        double velocidadeMedia = entrada.nextDouble();

        double distancia = tempoViagem * velocidadeMedia;
        double litrosUsados = distancia /  KM_LITRO;

        System.out.println("Velocidade média: " + velocidadeMedia);
        System.out.println("Tempo gasto: " + tempoViagem);
        System.out.println("Distância percorrida: " + distancia);
        System.out.println("Quantidade de litros usados na viagem: " + litrosUsados);
    }
}
