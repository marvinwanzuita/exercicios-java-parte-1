package exercicio1;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        
        System.out.println("EXERCÍCIO 1");
        System.out.println("Faça um algoritmo que receba dois \nnúmeros e exiba o resultado da sua soma.");
        System.out.println("----------------------------------");
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o primeiro número:");
        int numero1 = leitor.nextInt();
        System.out.println("Digite o segundo número:");
        int numero2 = leitor.nextInt();
        
        int soma = numero1 + numero2;
        
        System.out.println("----------------------------------");
        
        System.out.println("Resultado = " + soma + ".");
        System.out.println("----------------------------------");
        
    }
    
}
