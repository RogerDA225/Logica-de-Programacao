
package ex30mediaaproveitamento;

import java.util.Scanner;

public class Ex30MediaAproveitamento {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int identificacao;
        double N1, N2, N3, me, ma;
        System.out.println("Informe a identificacao do aluno: ");
        identificacao = teclado.nextInt();
        System.out.println("Digite a primeira nota: ");
        N1 = teclado.nextDouble();
        System.out.println("Digite a segunda nota: ");
        N2 = teclado.nextDouble();
        System.out.println("Digite a terceira nota: ");
        N3 = teclado.nextDouble();
        me = (N1 + N2 + N3) / 3.0;
        ma = (N1 + N2 * 2 + N3 * 3 + me) / 7.0;
        if (ma < 4.0) {
            System.out.println("Numero do aluno: " + identificacao + ", " + N1 + ", " + N2 + ", " + N3 + ", " + me + ", " + ma + ", Reprovado E");
        } else {
            if (ma < 6.0) {
                System.out.println("Numero do aluno: " + identificacao + ", " + N1 + ", " + N2 + ", " + N3 + ", " + me + ", " + ma + ", Reprovado D");
            } else {
                if (ma < 7.5) {
                    System.out.println("Numero do aluno: " + identificacao + ", " + N1 + ", " + N2 + ", " + N3 + ", " + me + ", " + ma + ", Aprovado C");
                } else {
                    if (ma < 9.0) {
                        System.out.println("Numero do aluno: " + identificacao + ", " + N1 + ", " + N2 + ", " + N3 + ", " + me + ", " + ma + ", Aprovado B");
                    } else {
                        System.out.println("Numero do aluno: " + identificacao + ", " + N1 + ", " + N2 + ", " + N3 + ", " + me + ", " + ma + ", Aprovado A");
                    }
                }
            }
        }
    }
    
}
