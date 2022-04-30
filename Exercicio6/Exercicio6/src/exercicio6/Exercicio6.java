package exercicio6;

import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {
        
        System.out.println("EXERCÍCIO 6");
        System.out.println("Leia dois valores para as variáveis A e B, e efetuar as\n"
                + "trocas dos valores de forma que a variávelApasse a possuir ovalor\n"
                + "da variável B e a variável B passe a possuir o valor da variável A.\n"
                + "Apresentar osvalores trocados;");
        System.out.println("----------------------------------");
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite um número para a variável A: ");
        int variavelA = leitor.nextInt();
        System.out.println("Digite um número para a variável B: ");
        int variavelB = leitor.nextInt();
        
        int variavelAux = variavelA;
        variavelA = variavelB;
        variavelB = variavelAux;
        
        System.out.println("----------------------------------");
        System.out.println("Variável A com valor de B: " + variavelA);
        System.out.println("Variável B com valor de A: " + variavelB);
        
        
        
    }
    
}
