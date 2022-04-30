package exercicio5;

import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {
        System.out.println("EXERCÍCIO 5");
        System.out.println("Escreva um algoritmo que leia o nome de um aluno e as notas\n"
                + "das três provas que ele obteve no semestre. No final informar o nome do aluno\n"
                + "e a sua média (aritmética);");
        System.out.println("----------------------------------");
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o nome do aluno: ");
        String aluno = leitor.nextLine();
        System.out.println("Digite a nota da primeira prova: ");
        double prova1 = leitor.nextDouble();
         System.out.println("Digite a nota da segunda prova: ");
        double prova2 = leitor.nextDouble();
        System.out.println("Digite a nota da terceira prova: ");
        double prova3 = leitor.nextDouble();
        
        double mediaProvas = (prova1 + prova2 + prova3) / 3;
        
        System.out.println("----------------------------------");
        System.out.println("Nome do aluno: " + aluno);
        System.out.printf("Média das provas: %.2f", mediaProvas);
        System.out.println();
        System.out.println("----------------------------------");
    }
    
}
