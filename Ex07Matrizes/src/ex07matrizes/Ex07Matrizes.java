package ex07matrizes;

import java.util.Scanner;

public class Ex07Matrizes {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String vet_disciplina[] = new String[10];
        String vet_alunos[] = new String[40];
        String nome_aluno = " ", nome_disciplina = " ";
        double mat_medias[][] = new double[40][10];
        int opcao_menu = 7, cont_disciplina = 0, cont_aluno = 0;
        while (opcao_menu == 7) {
            nome_aluno = " ";
            nome_disciplina = " ";
            System.out.println("1 – Cadastrar um nome Disciplina \n"
                    + "2 – Cadastrar um nome de Aluno \n"
                    + "3 – Cadastrar uma Média de aluno em disciplina \n"
                    + "4 – Listar disciplinas;\n"
                    + "5 – Listar alunos;\n"
                    + "6 – listar alunos e respectiva média em determinada disciplina;\n"
                    + "0 – Sair");
            opcao_menu = teclado.nextInt();
            teclado.nextLine();
            if (opcao_menu == 0) {
                teclado.close();
            } else if (opcao_menu == 1) {
                if (cont_disciplina == 9) {
                    System.out.println("Todas disciplinas foram digitadas");
                    
                }
                System.out.println("Digite o nome da disciplina: ");
                vet_disciplina[cont_disciplina] = teclado.nextLine();
                cont_disciplina++;
            } else if (opcao_menu == 2) {
                if (cont_aluno == 39) {
                    System.out.println("Todos alunos foram digitados");
                    
                }
                System.out.println("Digite o nome do aluno: ");
                vet_alunos[cont_aluno] = teclado.nextLine();
                cont_aluno++;
            } else if (opcao_menu == 3) {
                System.out.println("Digite o nome desse aluno: ");
                nome_aluno = teclado.nextLine();
                for (int i = 0; i < cont_aluno; i++) {
                    if (nome_aluno.equals(vet_alunos[i])) {
                        System.out.println("Digite o nome da disciplina: ");
                        nome_disciplina = teclado.nextLine();
                        for (int j = 0; j < cont_disciplina; j++) {
                            if (nome_disciplina.equals(vet_disciplina[j])) {
                                System.out.println("Cadastre a media desse aluno nessa disciplina: ");
                                mat_medias[i][j] = teclado.nextDouble();
                                teclado.nextLine();
                                
                            }
                        }

                    }
                }
            } else if (opcao_menu == 4) {
                for (int i = 0; i < cont_disciplina; i++) {
                    System.out.println(vet_disciplina[i]);
                    
                }
            } else if (opcao_menu == 5) {
                for (int i = 0; i < cont_aluno; i++) {
                    System.out.println(vet_alunos[i]);
                    
                }
            } else if (opcao_menu == 6) {
                for (int i = 0; i < cont_aluno; i++) {
                    for (int j = 0; j < cont_disciplina; j++) {
                        System.out.println(vet_alunos[i] + " em " + vet_disciplina[j] + " tirou " + mat_medias[i][j]);
                        
                    }
                }
            }
          opcao_menu = 7;  
        }
    }

}
