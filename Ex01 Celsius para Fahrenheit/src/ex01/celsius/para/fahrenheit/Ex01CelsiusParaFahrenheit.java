
package ex01.celsius.para.fahrenheit;

import java.util.Scanner;

public class Ex01CelsiusParaFahrenheit {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        double C, F;
        System.out.println("Informe a temperatura em Celsius");
        C = teclado.nextDouble();
        F = (9*C + 160)/5.0;
        System.out.println("A temperatura em Fahrenheit é " + F);
    }

}
