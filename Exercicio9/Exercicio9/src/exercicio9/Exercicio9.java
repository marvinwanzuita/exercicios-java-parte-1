package exercicio9;

import java.util.Scanner;

public class Exercicio9 {

  public static void main(String[] args) {
    
    System.out.println("EXERCÍCIO 9");
    System.out.println("Faça um algoritmo que receba um valor que foi depositado\n"
            + "e exiba o valor com rendimento após um mês. Considere fixo o juro da poupança\n"
            + "em 0,07% a. m;");
    System.out.println("----------------------------------");
    
    Scanner leitor = new Scanner(System.in);
        
    System.out.println("Digite o valor do depósito: ");
    System.out.print("R$ ");
    float valorDeposito = leitor.nextFloat();
    
    float valorRendimento = (valorDeposito * 0.0007f) + valorDeposito;
    
    System.out.println("----------------------------------");
    System.out.println("Valor do depósito com rendimento: ");
    System.out.printf("R$ %.2f", valorRendimento);
    System.out.println();
    System.out.println("----------------------------------");
    
  }
  
}
