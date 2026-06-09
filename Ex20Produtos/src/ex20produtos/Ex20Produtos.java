
package ex20produtos;

import java.util.Scanner;

public class Ex20Produtos {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int quantidade5, quantidade6, quantidade2, quantidade12, total;
        System.out.println("Digite a quantidade de produtos de codigo 5: ");
        quantidade5 = teclado.nextInt();
        System.out.println("Digite a quantidade de produtos de codigo 6: ");
        quantidade6 = teclado.nextInt();
        System.out.println("Digite a quantidade de produtos de codigo 2: ");
        quantidade2 = teclado.nextInt();
        System.out.println("Digite a quantidade de produtos de codigo 12: ");
        quantidade12 = teclado.nextInt();
        total = quantidade5 * 32 + quantidade6 * 45 + quantidade2 * 37 + quantidade12 * 44;
        System.out.println("Total: " + total + " reais");
        
    }
    
}
