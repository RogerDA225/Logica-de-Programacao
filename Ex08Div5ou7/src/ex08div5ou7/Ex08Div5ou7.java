
package ex08div5ou7;

import java.util.Scanner;

public class Ex08Div5ou7 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int N;
        System.out.println("Digite um número inteiro: ");
        N = teclado.nextInt();
        if (N % 5 == 0 || N % 7 == 0) {
            System.out.println("O número é divisível  por 5 ou 7");
        } else {
            System.out.println("O número não é divisível por 5 ou 7");    
        }
    }
    
}
