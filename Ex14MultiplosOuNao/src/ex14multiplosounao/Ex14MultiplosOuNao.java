
package ex14multiplosounao;

import java.util.Scanner;

public class Ex14MultiplosOuNao {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        int A, B;
        System.out.println("Digite um numero inteiro: ");
        A = teclado.nextInt();
        System.out.println("Digite outro numero inteiro: ");
        B = teclado.nextInt();
        if (A % B == 0 || B % A == 0) {
            System.out.println("Sao multiplos!");
        } else {
            System.out.println("Nao sao multiplos");
        }
    }
    
}
