package ex13media.de.aluno;

import java.util.Scanner;

public class Ex13MediaDeAluno {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double N1, N2, N3, media;
        System.out.println("Digite a primeira nota: ");
        N1 = teclado.nextDouble();
        System.out.println("Digite a segunda nota: ");
        N2 = teclado.nextDouble();
        System.out.println("Digite a terceira nota: ");
        N3 = teclado.nextDouble();
        media = (N1 + N2 + N3) / 3.0;
        if (media >= 6) {
            System.out.println("Aprovado " + media);
        } else {
            System.out.println("Reprovado " + media);
        }
    }

}
