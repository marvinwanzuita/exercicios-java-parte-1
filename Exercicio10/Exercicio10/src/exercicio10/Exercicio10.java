package exercicio10;

import java.util.Scanner;

public class Exercicio10 {

  public static void main(String[] args) {
    
    System.out.println("EXERCÍCIO 10");
    System.out.println("A Loja Mamão com Açúcar está vendendo seus produtos em\n"
            + "5(cinco)prestações sem juros. Faça um algoritmo que receba um valor\n"
            + "de uma compra e mostre o valor das prestações;");
    System.out.println("----------------------------------");
    
    Scanner leitor = new Scanner(System.in);
        
    System.out.println("Digite o valor da compra: ");
    System.out.print("R$ ");
    float valorCompra = leitor.nextFloat();
    
    float valorParcela = valorCompra / 5;
    
    System.out.println("----------------------------------");
    System.out.println("Valor da parcela de 5 vezes: ");
    System.out.printf("R$ %.2f", valorParcela);
    System.out.println();
    System.out.println("----------------------------------");
    
  }
  
}
