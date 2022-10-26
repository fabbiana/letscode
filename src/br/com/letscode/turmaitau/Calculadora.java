package br.com.letscode.turmaitau;

import br.com.letscode.turmaitau.operacoes.Dividir;
import br.com.letscode.turmaitau.operacoes.Multiplicar;
import br.com.letscode.turmaitau.operacoes.Somar;
import br.com.letscode.turmaitau.operacoes.Subtrair;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {

        Scanner entrada = new Scanner (System.in);

        System.out.println("Digite o primeiro número: ");
        double numero1 = entrada.nextDouble();

        System.out.println("Digite o segundo número: ");
        double numero2 = entrada.nextDouble();

        System.out.println("Digite a operação: ");
        System.out.println("+ : soma; - : subtração; * : multiplicação; / : divisão");

        String operacao = entrada.next();

        switch (operacao) {
            case "+":
                new Somar().realizarOperacao(numero1, numero2);
                break;
            case "-":
                new Subtrair().realizarOperacao(numero1, numero2);
                break;
            case "*":
                new Multiplicar().realizarOperacao(numero1, numero2);
                break;
            case "/":
                new Dividir().realizarOperacao(numero1, numero2);
                break;
            default:
                System.out.println("Operador inválido.");
                break;
        }
    }
}
