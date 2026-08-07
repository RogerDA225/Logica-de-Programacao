
package ex9dowhile;

import java.util.Scanner;

public class Ex9Dowhile {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcao_menu = 0, quantidade;
        char opcao_produto;
        double total = 0, valor, troco;
        do {
            System.out.println("1-Registrar venda de um produto 2-Apresentar total e calcular troco 3-Sair");
            opcao_menu = teclado.nextInt();
            if (opcao_menu == 1) {
                System.out.println("a-Agua 3,50 b-Salgado 5,00 c-Salada de Frutas 7,50");
                opcao_produto = teclado.next().charAt(0);
                if (opcao_produto == 'a') {
                    System.out.println("Digite a quantidade desejada: ");
                    quantidade = teclado.nextInt();
                    total = total + quantidade * 3.5;
                    opcao_menu = 0;
                }
                if (opcao_produto == 'b') {
                    System.out.println("Digite a quantidade desejada: ");
                    quantidade = teclado.nextInt();
                    total = total + quantidade * 5.0;
                    opcao_menu = 0;
                }
                if (opcao_produto == 'c') {
                    System.out.println("Digite a quantidade desejada: ");
                    quantidade = teclado.nextInt();
                    total = total + quantidade * 7.5;
                    opcao_menu = 0;
                }
            }
            if (opcao_menu == 2) {
                System.out.println(total + " reais. Digite o valor no qual a compra sera feita: ");
                valor = teclado.nextDouble();
                if (valor < total) {
                    System.out.println("Invalido");
                    opcao_menu = 0;
                } else {
                    troco = valor - total;
                    System.out.println("Seu troco: " + troco);
                    opcao_menu = 0;
                }
            }
            if (opcao_menu == 3) {
                System.out.println("Voce saiu!");
            }
        } while (opcao_menu == 0);
    }
    
}
