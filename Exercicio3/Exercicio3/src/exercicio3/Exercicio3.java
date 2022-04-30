package exercicio3;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        System.out.println("EXERCÍCIO 3");
        System.out.println("Escreva um algoritmo para determinar o consumo médio\n"
                         + "de um automóvel sendo fornecida a distância total percorrida\n"
                         + "pelo automóvel e o total de combustível gasto.");
        System.out.println("----------------------------------");
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite a distância total percorrida (quilometros):");
        int distanciaTotal = leitor.nextInt();
        System.out.println("Digite o total de combustível gasto: (litros");
        int combustivelGasto = leitor.nextInt();
        
        float consumoMedio = ((float)distanciaTotal / combustivelGasto);
        
        System.out.println("----------------------------------");
        System.out.printf("Consumo médio do veículo: %.2f", consumoMedio);
        System.out.println();
        System.out.println("----------------------------------");
        
    }
    
}
