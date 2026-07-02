package ex2dowhile;

import java.util.Scanner;

public class Ex2DoWhile {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double cont = 0, numero, media, soma = 0;
        do {
            System.out.println("Digite o numero: ");
            numero = teclado.nextDouble();
            soma = soma + numero;
            cont++;
        } while (numero != 0);
        media = soma / cont;
        System.out.println("Foram digitados " + cont + " numeros e a media: " + media);
    }

}
