package ex25iabc;

import java.util.Scanner;

public class Ex25Iabc {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int i, a, b, c;
        System.out.println("Digite o  valor de a: ");
        a = teclado.nextInt();
        System.out.println("Digite o valor de b: ");
        b = teclado.nextInt();
        System.out.println("Digite o valor de c: ");
        c = teclado.nextInt();
        System.out.println("1 para ordem crescente, 2 para ordem decrescente e 3 para que o maior fique entre os dois");
        i = teclado.nextInt();
        if (i != 1 && i != 2 && i != 3) {
            System.out.println("Invalido");
        }
        if (i == 1) {
            if (a <= b && a <= c) {
                if (b <= c) {
                    System.out.println(a + ", " + b + ", " + c);
                } else {
                    System.out.println(a + ", " + c + ", " + b);
                }
            }
            if (b < a && b < c) {
                if (a < c) {
                    System.out.println(b + ", " + a + ", " + c);
                } else {
                    System.out.println(b + ", " + c + ", " + a);
                }
            }
            if (c < a && c < b) {
                if (a < b) {
                    System.out.println(c + ", " + a + ", " + b);
                } else {
                    System.out.println(c + ", " + b + ", " + a);
                }
            }
        }
        if (i == 2) {
            if (a <= b && a <= c) {
                if (b <= c) {
                    System.out.println(c + ", " + b + ", " + a);
                } else {
                    System.out.println(b + ", " + c + ", " + a);
                }
            }
            if (b < a && b < c) {
                if (a < c) {
                    System.out.println(c + ", " + a + ", " + b);
                } else {
                    System.out.println(a + ", " + c + ", " + b);
                }
            }
            if (c < a && c < b) {
                if (a < b) {
                    System.out.println(b + ", " + a + ", " + c);
                } else {
                    System.out.println(a + ", " + b + ", " + c);
                }
            }
            
        }
        if (i == 3) {
            if (a <= b && a <= c) {
                if (b <= c) {
                    System.out.println(a + ", " + c + ", " + b);
                } else {
                    System.out.println(a + ", " + b + ", " + c);
                }
            }
            if (b < a && b < c) {
                if (a < c) {
                    System.out.println(b + ", " + c + ", " + a);
                } else {
                    System.out.println(b + ", " + a + ", " + c);
                }
            }
            if (c < a && c < b) {
                if (a < b) {
                    System.out.println(c + ", " + b + ", " + a);
                } else {
                    System.out.println(c + ", " + a + ", " + b);
                }
            }
        }
        
    
    }
    
}

































































































