
package ex5vetoresfor;

import java.util.Scanner;

public class Ex5VetoresFor {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        int tamanho = 5, tamanho_aleatorio = 100;
        int vet_aleatorio[] = new int [tamanho_aleatorio];
        int vet_numeros[] = new int [tamanho];
        int numeroAleatorio = (int) (Math.random() * 10);
        
        for (int i = 0; i < tamanho; i++) {
            System.out.println("Digite o " + (i+1) + "o numero: ");
            vet_numeros[i] = teclado.nextInt();
        }
        
        for (int i = 0; i < tamanho_aleatorio; i++) {
            vet_aleatorio[i] = numeroAleatorio;
            numeroAleatorio = (int) (Math.random() * 10);
        }
        
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho_aleatorio; j++) {
                if (vet_numeros[i] == vet_aleatorio[j]) {
                    System.out.println("O " + vet_numeros[i] + " esta na posicao " + j + " do primeiro vetor");
                }
            }
        }
    }
    
}
