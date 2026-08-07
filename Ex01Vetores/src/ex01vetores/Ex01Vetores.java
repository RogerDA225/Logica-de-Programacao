
package ex01vetores;

import java.util.Scanner;

public class Ex01Vetores {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int tamanho = 5;
        int vet_valores[] = new int [tamanho];
        for (int i = 0; i < tamanho; i++) {
            System.out.println("Digite o " + (i+1) + "o numero");
            vet_valores[i] = teclado.nextInt();
        }
        for (int i = 0; i < tamanho; i++) {
            System.out.println(vet_valores[i]);
        }
    }
    
}
