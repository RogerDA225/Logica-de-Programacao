
package ex24duracaojogo;

import java.util.Scanner;

public class Ex24DuracaoJogo {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int hi, mi, hf, mf, duracaom, hd, md;
        System.out.println("Digite a hora do inicio do jogo: ");
        hi = teclado.nextInt();
        System.out.println("Digite o minuto do inicio do jogo: ");
        mi = teclado.nextInt();
        System.out.println("Digite a hora do termino do jogo: ");
        hf = teclado.nextInt();
        System.out.println("Digite o minuto do termino do jogo");
        mf = teclado.nextInt();
        if (hf - hi >= 0) {
            duracaom = hf * 60 + mf - hi * 60 - mi;
            hd = duracaom / 60;
            md = duracaom - hd * 60;
            System.out.println("A duracao do jogo foi de " + hd + " horas e " + md + " minutos");
        } else {
            duracaom = 1440 - hi * 60 - mi + hf * 60 + mf;
            hd = duracaom / 60;
            md = duracaom - hd * 60;
            System.out.println("A duracao do jogo foi de " + hd + " horas e " + md + " minutos");
        }
    }
    
}
