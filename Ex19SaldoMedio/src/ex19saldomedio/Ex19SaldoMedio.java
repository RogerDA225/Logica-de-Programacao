
package ex19saldomedio;

import java.util.Scanner;

public class Ex19SaldoMedio {
   
    public static void main(String[] args) {
      
        Scanner teclado = new Scanner(System.in);
        
        double saldo, credito;
        System.out.println("Digite seu saldo medio: ");
        saldo = teclado.nextDouble();
        if (saldo <= 200) {
            System.out.println("Seu saldo: " + saldo + " nenhum credito");
        } else {
            if (saldo <= 400) {
                credito = 0.2 * saldo;
                System.out.println("Seu saldo: " + saldo + " seu credito: " + credito);
            } else {
                if (saldo <= 600) {
                    credito = 0.3 * saldo;
                    System.out.println("Seu saldo: " + saldo + " seu credito: " + credito);
                } else {
                    credito = 0.4 * saldo;
                    System.out.println("Seu saldo: " + saldo + " seu credito: " + credito);
                }
            }
        }
    }
    
}
