package atividade01;
import java.util.Scanner;

public class Exercicio01 {
  public static void main(String[] args) throws Exception {
    Scanner input = new Scanner(System.in);
    int idade;
    System.out.print("Digite sua idade: ");
    idade = input.nextInt();

    if (idade >= 18 && idade <= 60) {
      System.out.println("Voce e adulto");
    } else if (idade >= 60) {
      System.out.println("Voce e idoso");
    }
    else {
      System.out.println("Voce e menor de idade");
    }
  }
}
