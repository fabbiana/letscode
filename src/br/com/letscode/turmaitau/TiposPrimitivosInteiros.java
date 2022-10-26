package br.com.letscode.turmaitau;

public class TiposPrimitivosInteiros {

   //final não deixa a variável ser alterada, por convenção as variáveis estáticas são declaradas em maiúsculo
   final static int NUMERO_INT = 5;
   final static String RESULTADO =  "resultado da operação = ";

    public static void main(String[] args) {

        short b = 1;
        long numeroLong = 2;
        int numeroInt = 5;

        /*
            soma =
            subtração -
            divisão /
            multiplicação *
         */

        int soma = numeroInt + 10;
        System.out.println("soma = " + soma);

        int divisao = (int) (numeroInt / numeroLong);
        System.out.println("divisao = " + divisao);

        //essa atribuição dá erro, porque essa variável é estática, tem o final na declaração
        //NUMERO_INT = 10;
        somar(10, NUMERO_INT);
    }

    static void somar(int var1, int var2){
        int soma = var1 + var2 + NUMERO_INT;
        System.out.println(RESULTADO + soma);
    }
}
