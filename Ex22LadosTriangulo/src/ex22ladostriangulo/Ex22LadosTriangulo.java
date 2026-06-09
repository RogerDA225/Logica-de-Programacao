
package ex22ladostriangulo;

import java.util.Scanner;

public class Ex22LadosTriangulo {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int L1, L2, L3;
        double area;
        System.out.println("Digite o primeiro lado: ");
        L1 = teclado.nextInt();
        System.out.println("Digite o segundo lado: ");
        L2 = teclado.nextInt();
        System.out.println("Digite o terceiro lado: ");
        L3 = teclado.nextInt();
        if (L1 < L2 + L3 && L2 < L1 + L3 && L3 < L1 + L2) {
            area = (L1 * L2) / 2;
            System.out.println("Area: " + area);
        } else {
            System.out.println(L1 + ", " + L2 + ", " + L3);
        }
        
    }
    
}
