package exercicio7;

import java.util.Scanner;

public class Exercicio7 {

    public static void main(String[] args) {
        
        System.out.println("EXERCÍCIO 7");
        System.out.println("Leia uma temperatura em graus Celsius e apresentá-la convertida\n"
                + "em graus Fahrenheit. Afórmula de conversão é:F=(9*C+160) / 5,\n"
                + "sendo F a temperatura em Fahrenheit e C a temperatura emCelsius;");
        System.out.println("----------------------------------");
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite a temperatura em Celsius: ");
        float temperaturaCelcius = leitor.nextFloat();
        
        float temperaturaFahrenheit = ((9 * temperaturaCelcius) + 160) / 5;
        
        System.out.println("----------------------------------");
        System.out.printf("Temperatura em Fahrenheit: %.2f", temperaturaFahrenheit);
        System.out.println();
        System.out.println("----------------------------------");  
        
    }
    
}
