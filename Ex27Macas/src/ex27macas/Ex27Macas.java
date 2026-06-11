
package ex27macas;

import java.util.Scanner;

public class Ex27Macas {

    public static void main(String[] args) {
       
       Scanner teclado = new Scanner(System.in);
       
       int quantidade;
       double preco;
       System.out.println("Digite a quantidade de macas que ira comprar: ");
       quantidade = teclado.nextInt();
       if (quantidade >= 12) {
           preco = quantidade;
           System.out.println(preco + " reais");
       } else {
           preco = quantidade * 1.3;
           System.out.println(preco + " reais");
       }
    }
    
}
