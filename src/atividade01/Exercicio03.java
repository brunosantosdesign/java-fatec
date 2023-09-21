package atividade01;
import java.util.Scanner;

public class Exercicio03 {
  public static void main(String[] args) throws Exception {
    Scanner input = new Scanner(System.in);
    
    String[] nomes = new String[5];	

    for (int i = 0; i < nomes.length; i++) {
      System.out.print("Digite o " + (i + 1) + "o nome: ");
      nomes[i] = input.nextLine();
    }
      
    System.out.print("Digite o nome que deseja: ");
    String novoNome = input.nextLine();

    for (int i = 0; i < nomes.length; i++) {
      if (nomes[i].equals(novoNome)) {
        System.out.println("O nome " + novoNome + " está na lista.");
        break;
      }else {
        if (i == nomes.length - 1) System.out.println("O nome " + novoNome + " não está na lista.");
      }
    }
  }
}
