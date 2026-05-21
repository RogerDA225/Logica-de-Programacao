package ex10ordemcrescente;

import java.util.Scanner;

public class Ex10OrdemCrescente {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double N1, N2;
        System.out.println("Digite o primeiro numero: ");
        N1 = teclado.nextDouble();
        System.out.println("Digite o segundo numero: ");
        N2 = teclado.nextDouble();
        if (N1 >= N2) {
            System.out.println(N2 + ", " + N1);
        } else {
            System.out.println(N1 + ", " + N2);
        }
    }

}
