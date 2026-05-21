package ex11menornumero;

import java.util.Scanner;

public class Ex11MenorNumero {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double N1, N2, N3;
        System.out.println("Digite o primeiro numero: ");
        N1 = teclado.nextDouble();
        System.out.println("Digite o segundo numero: ");
        N2 = teclado.nextDouble();
        System.out.println("Digite o terceiro numero: ");
        N3 = teclado.nextDouble();
        if (N1 < N2 && N1 < N3) {
            System.out.println("O menor deles é " + N1);
        }
        if (N2 < N1 && N2 < N3) {
            System.out.println("O menor deles é " + N2);
        }
        if (N3 < N1 && N3 < N2) {
            System.out.println("O menor deles é " + N3);
        }
    }

}
