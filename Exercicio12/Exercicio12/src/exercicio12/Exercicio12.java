package exercicio12;

import java.util.Scanner;

public class Exercicio12 {

  public static void main(String[] args) {
    
    System.out.println("EXERCÍCIO 12");
    System.out.println("O custo de um carro novo ao consumidoré a soma do custo de fábrica\n"
            + "mais o percentual do distribuidor e dos impostos aplicados (primeiro os impostos\n"
            + "são aplicados sobre o custo de fábrica, e depois o percentual do distribuidor\n"
            + "sobre o resultado). Supondo que o percentual do distribuidor seja de 28%\n"
            + "e os impostos 45%, escreva um algoritmo que leia o custo de fábrica\n"
            + "de um carro e informe o custo ao consumidor do mesmo;");
    System.out.println("----------------------------------");
    
    Scanner leitor = new Scanner(System.in);
        
    System.out.println("Digite o valor de custo do carro de fábrica: ");
    System.out.print("R$ ");
    float valorCustoCarro = leitor.nextFloat();
    
    float valorComImpostos = valorCustoCarro + (valorCustoCarro * 0.45f);
    
    float valorComPercDistribuidor = valorComImpostos + (valorComImpostos * 0.28f);
    
    System.out.println("----------------------------------");
    System.out.println("Valor do final do carro: ");
    System.out.printf("R$ %.2f", valorComPercDistribuidor);
    System.out.println();
    System.out.println("----------------------------------");
    
    
  }
  
}
