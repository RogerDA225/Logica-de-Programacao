package ex02.fahrenheit.para.celsius;

import java.util.Scanner;

public class Ex02FahrenheitParaCelsius {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double F, C;
        System.out.println("Informe a temperatura em Fahrenheit");
        F = teclado.nextDouble();
        C = 5 * (F - 32) / 9.0;
        System.out.println("A temperatura em Celsius é " + C);

    }

}
