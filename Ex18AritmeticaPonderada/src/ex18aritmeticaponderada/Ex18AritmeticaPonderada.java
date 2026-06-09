
package ex18aritmeticaponderada;

import java.util.Scanner;

public class Ex18AritmeticaPonderada {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int opcao;
        double N1, N2, N3, media;
        System.out.println("Digite a primeira nota: ");
        N1 = teclado.nextDouble();
        System.out.println("Digite a segunda nota: ");
        N2 = teclado.nextDouble();
        System.out.println("Digite a terceira nota: ");
        N3 = teclado.nextDouble();
        System.out.println("1 para media aritmetica e 2 para media ponderada");
        opcao = teclado.nextInt();
        if (opcao != 1 && opcao != 2) {
            System.out.println("Invalido");
        }
        if (opcao == 1) {
            media = (N1 + N2 + N3) / 3.0;
            System.out.println("Sua media: " + media);
        }
        if (opcao == 2) {
            media = (N1 * 3 + N2 * 3 + N3 * 4) / 10.0;
            System.out.println("Sua media: " + media);
        }
    }
    
    
    
}
