package ex15idadenomedenadador;

import java.util.Scanner;

public class Ex15IdadeNomeDeNadador {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        String nome;
        int idade;
        System.out.println("Qual e o seu nome?");
        nome = teclado.next();
        System.out.println("Qual e sua idade?");
        idade = teclado.nextInt();
        if (idade < 5) {
            System.out.println(nome + ", sem categoria");
        } else {
            if (idade <= 7) {
                System.out.println(nome + ", infantil A");
            } else {
                if (idade <= 10) {
                    System.out.println(nome + ", ifantil B");
                } else {
                    if (idade <= 13) {
                        System.out.println(nome + ", juvenil A");
                    } else {
                        if (idade <= 17) {
                            System.out.println(nome + ", juvenil B");
                        } else {
                            System.out.println(nome + ", adulto");
                        }
                    }
                }
            }
        }
    }

}
