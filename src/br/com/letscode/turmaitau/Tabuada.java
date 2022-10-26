package br.com.letscode.turmaitau;

import java.util.Scanner;

public class Tabuada {

    public static void main(String[] args) {

        Scanner entrada = new Scanner (System.in);

        System.out.println("Digite o número a calcular a tabuada: ");
        double numeroTabuada = entrada.nextDouble();

        System.out.println("Tabuada do número : " + numeroTabuada);

        for(int i = 0; i<=10; i++){
            System.out.println(numeroTabuada + " * " + i + " = " + (numeroTabuada * i));
        }

    }
}
