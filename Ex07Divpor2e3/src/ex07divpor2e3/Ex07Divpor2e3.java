package ex07divpor2e3;

import java.util.Scanner;

public class Ex07Divpor2e3 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int N;
        System.out.println("Digite um número inteiro");
        N = teclado.nextInt();
        if (N % 6 == 0) {
            System.out.println("O número é divisível por 2 e por 3");
        } else {
            System.out.println("O número não é divisível por 2 e por 3");
        }

    }

}
