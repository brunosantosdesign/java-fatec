package Abstracoes;

public class Computador {
  String proc;
  String mem;
  String ssd;
  boolean ligado;

  void ligar() {
    // System.out.println(ssd);

    if (ssd != null && mem != null && proc != null) {
      System.out.println("Ligando...");
      System.out.println("Ligado!");
      ligado = true;
    }
  else {
    System.out.println("Piii Pii Pii");
  }
  }

  String desligar() {
   if (ligado == true) {
    ligado = false;
    return "Desligando... Desligado!";
   }
   else {
    return "Não está ligado";
   }
  }

  // void ligar() {
  //   System.out.println("Ligando...");
  //   System.out.println("Ligado!");
  // }
  // String desligar() {
  //   return "Desligando... Desligado!";
  // }
}
