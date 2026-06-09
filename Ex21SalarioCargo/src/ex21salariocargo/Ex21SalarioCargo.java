
package ex21salariocargo;

import java.util.Scanner;

public class Ex21SalarioCargo {
   
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        double salario, diferenca, salarioN;
        int codigo;
        System.out.println("Digite seu salario atual: ");
        salario = teclado.nextDouble();
        System.out.println("101 para gerente, 102 para engenheiro, 103 para tecnico e 104 para outro cargo");
        codigo = teclado.nextInt();
        if (codigo != 101 && codigo != 102 && codigo != 103 && codigo != 104) {
            System.out.println("Invalido");
        }
        if (codigo == 101) {
            salarioN = salario * 1.1;
            diferenca = salarioN - salario;
            System.out.println(salarioN + ", " + salario + ", " + diferenca);
        }
        if (codigo == 102) {
            salarioN = salario * 1.2;
            diferenca = salarioN - salario;
            System.out.println(salarioN + ", " + salario + ", " + diferenca);
        }
        if (codigo == 103) {
            salarioN = salario * 1.3;
            diferenca = salarioN - salario;
            System.out.println(salarioN + ", " + salario + ", " + diferenca);
        }
        if (codigo == 104) {
            salarioN = salario * 1.4;
            diferenca = salarioN - salario;
            System.out.println(salarioN + ", " + salario + ", " + diferenca);
        }
    }
    
}
