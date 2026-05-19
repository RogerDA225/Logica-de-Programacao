
package ex04trocavalores;

import java.util.Scanner;

public class Ex04TrocaValores {
   
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int A, B, C;
        System.out.println("Digite o valor de A: ");
        A = teclado.nextInt();
        System.out.println("Digite o valor de B: ");
        B = teclado.nextInt();
        C = B;
        B = A;
        A = C;
        System.out.println("Os valores trocados de A e B são: " + A + " e " + B);
        
    }
    
}
