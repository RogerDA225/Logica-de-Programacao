package ex3vetores;

import java.util.Scanner;

public class Ex3Vetores {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int tamanho = 10;
        double vet_numeros[] = new double[tamanho];
        for (int i = 0; i < tamanho; i++) {
            System.out.println("Digite o " + (i + 1) + "o numero: ");
            vet_numeros[i] = teclado.nextDouble();
        }
        for (int i = 0; i < tamanho; i++) {
            if (vet_numeros[i] > 50) {
                System.out.println(vet_numeros[i]);
            }
        }
        
    }
}
