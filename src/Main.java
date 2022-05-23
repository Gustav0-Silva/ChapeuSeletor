import Casas.Hogwarts;
import DescobrirCasa.Exibir;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ciclo = 0;


        do {
            System.out.println();
            System.out.println("O que faremos agora...?");
            System.out.println();
            System.out.println("1 - Selecionar próximo aluno");
            System.out.println("2 - Exibir todos os alunos");
            System.out.println("3 - Exibir alunos da Corvinal");
            System.out.println("4 - Exibir alunos da Sonserina");
            System.out.println("5 - Exibir alunos da Grifinória");
            System.out.println("6 - Exibir alunos da Lufa-Lufa");
            System.out.println("7 - Guardar Chapéu Seletor");

            ciclo = sc.nextInt();

            if (ciclo == 1){

                String nome;

                System.out.println("Próximo aluno! ... ");
                System.out.println("...");
                System.out.println("Digite seu nome: ");
                nome = sc.next();
                System.out.println();
                System.out.println("----------------------------------------------------");
                System.out.println();

                Hogwarts hogwarts = new Hogwarts(nome);
                hogwarts.executar();

            } else if (ciclo == 2){
                Exibir exibir = new Exibir();
                exibir.exibir();

            } else if (ciclo == 3) {
                Exibir exibir = new Exibir();
                exibir.exibirCorv();

            } else if (ciclo == 4) {
                Exibir exibir = new Exibir();
                exibir.exibirSons();

            } else if (ciclo == 5) {
                Exibir exibir = new Exibir();
                exibir.exibirGrif();

            } else if (ciclo == 6) {
                Exibir exibir = new Exibir();
                exibir.exibirLufa();
            }


        }while(ciclo!=7);


    }
}