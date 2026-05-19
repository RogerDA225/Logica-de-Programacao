package ex03volumelata;

import java.util.Scanner;

public class Ex03VolumeLata {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double R, h, V;
        System.out.println("Digite o valor do raio da lata: ");
        R = teclado.nextDouble();
        System.out.println("Digite o valor da altura da lata: ");
        h = teclado.nextDouble();
        V = 3.14 * R * R * h;
        System.out.println("O volume dessa lata é: " + V);

    }
}
