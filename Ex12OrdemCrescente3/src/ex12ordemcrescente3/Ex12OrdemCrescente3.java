package ex12ordemcrescente3;

import java.util.Scanner;

public class Ex12OrdemCrescente3 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double N1, N2, N3;
        System.out.println("Digite o primeiro numero: ");
        N1 = teclado.nextDouble();
        System.out.println("Digite o segundo numero: ");
        N2 = teclado.nextDouble();
        System.out.println("Digite o terceiro numero: ");
        N3 = teclado.nextDouble();
        if (N1 == N2 && N1 == N3) {
            System.out.println("Os numeros sao iguais");
        }
        if (N1 == N2) {
            if (N1 < N3) {
                System.out.println(N1 + ", " + N2 + ", " + N3);
            } else {
                System.out.println(N3 + ", " + N1 + ", " + N2);
            }
        }
        if (N1 == N3) {
            if (N1 < N2) {
                System.out.println(N1 + ", " + N3 + ", " + N2);
            } else {
                System.out.println(N2 + ", " + N1 + ", " + N3);
            }
        }
        if (N2 == N3) {
            if (N2 < N1) {
                System.out.println(N2 + ", " + N3 + ", " + N1);
            } else {
                System.out.println(N1 + ", " + N2 + ", " + N3);
            }
        }
        if (N1 < N2 && N1 < N3) {
            if (N2 < N3) {
                System.out.println(N1 + ", " + N2 + ", " + N3);
            } else {
                System.out.println(N1 + ", " + N3 + ", " + N2);
            }
        }
        if (N2 < N1 && N2 < N3) {
            if (N1 < N3) {
                System.out.println(N2 + ", " + N1 + ", " + N3);
            } else {
                System.out.println(N2 + ", " + N3 + ", " + N1);
            }
        }
        if (N3 < N1 && N3 < N2) {
            if (N1 < N2) {
                System.out.println(N3 + ", " + N1 + ", " + N2);
            } else {
                System.out.println(N3 + ", " + N2 + ", " + N1);
            }
        }
    }

}
