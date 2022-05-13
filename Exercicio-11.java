package exercicio11;

import java.util.Scanner;

public class Exercicio11 {

  public static void main(String[] args) {
    
    System.out.println("EXERCÍCIO 11");
    System.out.println("Faça um algoritmo que receba o preço de custo de um produto\n"
            + "e mostre o valor de venda. Sabe-se que o preço de custo receberá um acréscimo\n"
            + "de acordo com um percentual informado pelo usuário;");
    System.out.println("----------------------------------");
    
    Scanner leitor = new Scanner(System.in);
        
    System.out.println("Digite o preço de custo do produto: ");
    System.out.print("R$ ");
    float valorProduto = leitor.nextFloat();
    
    System.out.println("Digite a porcentagem de acréscimo: ");
    float percentualAcrescimo = leitor.nextFloat();
    
    float valorFinal = valorProduto + (valorProduto * (percentualAcrescimo / 100));
    
    System.out.println("----------------------------------");
    System.out.println("Valor do final do produto: ");
    System.out.printf("R$ %.2f", valorFinal);
    System.out.println();
    System.out.println("----------------------------------");
    
    
  }
  
}
