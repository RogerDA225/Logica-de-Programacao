package ex28times;

import java.util.Scanner;

public class Ex28Times {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int gols1, gols2;
        String time1, time2;
        System.out.println("Digite o nome do primeiro time: ");
        time1 = teclado.nextLine();
        System.out.println("Digite o nome do segundo time: ");
        time2 = teclado.nextLine();
        System.out.println("Informe o numero de gols do primeiro time: ");
        gols1 = teclado.nextInt();
        System.out.println("Informe o numero de gols do segundo time: ");
        gols2 = teclado.nextInt();
        if (gols1 > gols2) {
            System.out.println(time1 + " vencedor");
        }
        if (gols2 > gols1) {
            System.out.println(time2 + " vencedor");
        }
        if (gols1 == gols2) {
            System.out.println("Empate");
        }
    }

}
