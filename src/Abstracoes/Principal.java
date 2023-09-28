package Abstracoes;

public class Principal {
  public static void main(String[] args) {
    Computador comp1 = new Computador();

    comp1.proc = "i7";
    comp1.mem = "8GB";
    comp1.ssd = "480GB";

    // comp1.ligar();

    // System.out.println(comp1.ssd);
    // comp1.ligar();
    // System.out.println(comp1.desligar());
    // System.out.println(comp1.desligar());
    // comp1.ligar();
    // System.out.println(comp1.desligar());

    Computador comp2 = new Computador();
    comp2.proc = "Celeron";
    comp2.mem = "2GB";
    comp2.ssd = "128GB";

    comp1.ligar();
    System.out.println(comp2.desligar());
    System.out.println(comp1.proc + " x " + comp2.proc);
  }
}
