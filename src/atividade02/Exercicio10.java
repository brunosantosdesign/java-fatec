package atividade02;
import java.util.Random;

public class Exercicio10 {
  public static void main(String[] args) {
        Random random = new Random();

        int numeroDeLancamentos = 100;
        int contagemSete = 0;

        System.out.println("Resultados dos lancamentos:");
        System.out.println(); // Para pular linha
        
        for (int i = 0; i < numeroDeLancamentos; i++) {
            int dado1 = random.nextInt(6) + 1; // Numeros aleatorios de 1 a 6 no dado1
            int dado2 = random.nextInt(6) + 1; // Numeros aleatorios de 1 a 6 no dado2
            int soma = dado1 + dado2;          // Para somar os Dado1 e Dado2
            
            System.out.println("Dado 1 = " + dado1 + ", Dado 2 = " + dado2 + ", Soma = " + soma);
            
            if (soma == 7) {
                contagemSete++;
            }
        }
        System.out.println(); // Para pular linha
        System.out.println("Numero de vezes que a soma foi 7: " + contagemSete);
    }
}
