package br.com.letscode.turmaitau;

public class PrimeiraClasse {

    public static void main (String[] args) {

        byte nomeVariavelByte = '1';
        System.out.println("byte = " + nomeVariavelByte);

        //conversao com cast
        byte conversaoByteCast = 65;
        System.out.println("byte = " + (char)conversaoByteCast);

        //var (vai imprimir como 98)
        var nomeVariavelInt = 98;
        System.out.println("var = " + nomeVariavelInt);

        //var (vai imprimir como b, por causa do cast)
        var nomeVariavelIntCast = 98;
        System.out.println("var = " + (char)nomeVariavelIntCast);

        //System.out.println("Hello Itau");
    }
}