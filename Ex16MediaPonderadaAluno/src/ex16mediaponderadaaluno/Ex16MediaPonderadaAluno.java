
package ex16mediaponderadaaluno;

import java.util.Scanner;

public class Ex16MediaPonderadaAluno {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        double N1, N2, N3, media;
        System.out.println("Digite a primeira nota: ");
        N1 = teclado.nextDouble();
        System.out.println("Digite a segunda nota: ");
        N2 = teclado.nextDouble();
        System.out.println("Digite a terceira nota: ");
        N3 = teclado.nextDouble();
        media = 0;
        if (N1 == N2 && N2 == N3) {
            media = (N3 * 4 + N1 * 3 + N2 * 3) / 10;
        }
        if (N1 == N2) {
            if (N1 < N3) {
                media = (N3 * 4 + N1 * 3 + N2 * 3) / 10;
            } else {
                media = (N1 * 4 + N2 * 3 + N3 * 3) / 10;
            }
        }
        if (N1 == N3) {
            if (N1 < N2) {
                media = (N2 * 4 + N1 * 3 + N3 * 3) / 10;
            } else {
                media = (N1 * 4 + N2 * 3 + N3 * 3) / 10;
            }
        }
        if (N2 == N3) {
            if (N2 < N1) {
                media = (N1 * 4 + N2 * 3 + N3 * 3) / 10;
            } else {
                media = (N2 * 4 + N1 * 3 + N3 * 3) / 10;
            }
        }
        if (N1 > N2 && N1 > N3) {
            media = (N1 * 4 + N2 * 3 + N3 * 3) / 10;
        }
        if (N2 > N1 && N2 > N3) {
            media = (N2 * 4 + N1 * 3 + N3 * 3) / 10;
        }
        if (N3 > N1 && N3 > N2) {
            media = (N3 * 4 + N1 * 3 + N2 * 3) / 10;
        }
        if (media >= 5) {
            System.out.println(N1 + ", " + N2 + ", " + N3 + ", " + media + ", Aprovado" );
        } else {
            System.out.println(N1 + ", " + N2 + ", " + N3 + ", " + media + ", Reprovado" );
        }
    }
    
}