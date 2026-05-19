
package ex05volumecaixa;

import java.util.Scanner;

public class Ex05VolumeCaixa {

    public static void main(String[] args) {
        
       Scanner teclado = new Scanner(System.in);
       
        double C, L, h, V;
        System.out.println("Digite o valor do comprimento da caixa: ");
        C = teclado.nextDouble();
        System.out.println("Digite o valor da largura da caixa: ");
        L = teclado.nextDouble();
        System.out.println("Digite a altura da caixa: ");
        h = teclado.nextDouble();
        V = C * L * h;
        System.out.println("O volume da caixa é: " + V);
    }
    
}
