
package ex29homensmulheres;

import java.util.Scanner;

public class Ex29HomensMulheres {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int idadeh1, idadeh2, idadem1, idadem2, soma, produto;
        System.out.println("Digite a idade do primeiro homem: ");
        idadeh1 = teclado.nextInt();
        System.out.println("Digite a idade do segundo homem: ");
        idadeh2 = teclado.nextInt();
        System.out.println("Digite a idade da primeira mulher: ");
        idadem1 = teclado.nextInt();
        System.out.println("Digite a idade da segunda mulher: ");
        idadem2 = teclado.nextInt();
        if (idadeh1 < idadeh2) {
            if (idadem1 < idadem2) {
                soma = idadeh2 + idadem1;
                produto = idadeh1 * idadem2;
                System.out.println(soma + " e " + produto);
            } else {
                soma = idadeh2 + idadem2;
                produto = idadeh1 * idadem1;
                System.out.println(soma + " e " + produto);
            }
        } else {
            if (idadem1 < idadem2) {
                soma = idadeh1 + idadem1;
                produto = idadeh2 * idadem2;
                System.out.println(soma + " e " + produto);
            } else {
                soma = idadeh1 + idadem2;
                produto = idadeh2 * idadem1;
                System.out.println(soma + " e " + produto);
            }
        }
        
    }
    
}
