package atividade01;
import java.util.Scanner;

public class Exercicio05 {
  public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        String password = "javalog";

        System.out.print("Digite a senha: ");
        String userPassword = input.nextLine();

        while (!userPassword.equals(password)) {
            System.out.println("Senha incorreta! Tente novamente: ");
            System.out.print("Digite a senha: ");
            userPassword = input.nextLine();
        }

        System.out.println("Acesso permitido!");

        
    }
}
