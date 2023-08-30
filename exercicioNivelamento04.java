
package ExerciciosNivelamento;

import java.util.Scanner;

public class exercicioNivelamento04 {
      public static void main(String[] args){
          System.out.println("Ola");
          String cor;
          Scanner scan = new Scanner(System.in);
          System.out.println("Escolhauma cor: ");
          cor = scan.next();
          switch (cor) {
  case "vermelho":
    System.out.println("Vermelho");
    break;
  case "verde":
    System.out.println("Verde");
    break;
  case "amarelo":
    System.out.println("Amarelo");
    break;
  default:
    System.out.println("Cor inválida");
}
      }
}
