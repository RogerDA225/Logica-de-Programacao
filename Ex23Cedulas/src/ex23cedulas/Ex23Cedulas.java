
package ex23cedulas;

import java.util.Scanner;

public class Ex23Cedulas {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int valor, N100, N50, N10, N5, N1;
        System.out.println("Digite o valor inteiro em reais: ");
        valor = teclado.nextInt();
        N100 = valor / 100;
        N50 = (valor - N100 * 100) / 50;
        N10 = (valor - N100 * 100 - N50 * 50) / 10;
        N5 = (valor - N100 * 100 - N50 * 50 - N10 * 10) / 5;
        N1 = (valor - N100 * 100 - N50 * 50 - N10 * 10 - N5 * 5);
        
        System.out.println(N100 + " de cem, " + N50 + " de cinquenta, " + N10 + " de dez, " + N5 + " de cinco e " + N1 + " de um");
    }
    
}
