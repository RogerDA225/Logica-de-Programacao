package ex1dowhile;

import java.util.Scanner;

public class Ex1DoWhile {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int senha = 1234, senhaUsuario;
        do {
            System.out.println("Digite a senha: ");
            senhaUsuario = teclado.nextInt();
        } while (senhaUsuario != senha);
        System.out.println("Senha correta");
        
    }

}
