package exercicio4;

import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {
        
        System.out.println("EXERCÍCIO 4");
        System.out.println("Escreva um algoritmo que leia o nome de um vendedor,\n"
                + "o seu salário fixo e o total de vendas efetuadas por ele no mês (em dinheiro).\n"
                + "Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas,\n"
                + "informar o seu nome, o salário fixo e salário no final do mês;");
        System.out.println("----------------------------------");
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o nome do vendedor: ");
        String vendedor = leitor.nextLine();
        System.out.println("Digite o salário fixo do vendedor: ");
        float salarioFixo = leitor.nextInt();
        
        float salarioComissao = salarioFixo * 1.15f;
        
        System.out.println("----------------------------------");
        System.out.println("Nome do vendedor: " + vendedor);
        System.out.printf("Salário com comissão do vendedor: R$ %.2f", salarioComissao);
        System.out.println();
        System.out.println("----------------------------------");  
    }
    
}
