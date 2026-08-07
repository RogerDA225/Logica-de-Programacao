
package ex02vetores;

import java.util.Scanner;

public class Ex02Vetores {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int tamanho = 5;
        int vet_numeros[] = new int [tamanho];
        for (int i = 0; i < tamanho; i++) {
            System.out.println("Informe o " + (i+1) + "o numero: ");
            vet_numeros[i] = teclado.nextInt();
        }
        for (int i = 0; i < tamanho; i++) {
            if (vet_numeros[i] % 2 == 0) {
                System.out.println(vet_numeros[i]);
            }
        }
    }
    
}
