package exercicio8;

import java.util.Scanner;

public class Exercicio8 {

  public static void main(String[] args) {
    System.out.println("EXERCÍCIO 8");
    System.out.println("Elabore um algoritmo que efetue a apresentação do valor da\n"
            + "conversão em real (R$) de um valorlido em dólar (US$). O algoritmo deverá\n"
            + "solicitar o valor da cotação do dólar e também aquantidade de dólares\n"
            + "disponíveis com ousuário;");
    System.out.println("----------------------------------");
    
    Scanner leitor = new Scanner(System.in);
        
    System.out.println("Digite o valor da cotação do dólar em Reais: ");
    System.out.print("R$ ");
    float valorCotacaoDolar = leitor.nextFloat();
    
    System.out.println("Digite o valor em dólar que deseja converter em Reais: ");
    System.out.print("US$ ");
    float valorConverter= leitor.nextFloat();
    
    float valorConvertidoReais = valorConverter / valorCotacaoDolar;
    
    System.out.println("----------------------------------");
    System.out.printf("Valor convertido em Reais: R$ %.2f", valorConvertidoReais);
    System.out.println();
    System.out.println("----------------------------------");
    
  }
  
}
