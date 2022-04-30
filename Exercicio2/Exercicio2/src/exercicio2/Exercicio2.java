package exercicio2;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        System.out.println("EXERCÍCIO 2");
        System.out.println("Faça um algoritmo que receba dois números e ao final\n" +
                           "mostre a soma, subtração, multiplicação e a divisão dos dois\n" +
                           "números lidos.");
        System.out.println("----------------------------------");
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o primeiro número:");
        int numero1 = leitor.nextInt();
        System.out.println("Digite o segundo número:");
        int numero2 = leitor.nextInt();
        
        int soma = numero1 + numero2;
        int subtracao = numero1 - numero2;
        int multiplicacao = numero1 * numero2;
        float divisao = ((float)numero1 / numero2);
        
        System.out.println("----------------------------------");
        System.out.println("Resultado Soma = " + soma + ".");
        System.out.println("Resultado Subtração = " + subtracao + ".");
        System.out.println("Resultado Multiplicação = " + multiplicacao + ".");
        System.out.printf("Resultado Divisão = %.2f", divisao);
        System.out.println();
        System.out.println("----------------------------------");
    }
    
}
