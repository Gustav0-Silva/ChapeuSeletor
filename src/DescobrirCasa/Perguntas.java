package DescobrirCasa;

import Casas.Hogwarts;

import java.util.Scanner;

public class Perguntas extends Hogwarts {

    public Perguntas(String nome) {
        super(nome);
    }

    public void p1(Scanner sc){

        boolean ciclo = false;
        String resposta;

        do {
            System.out.println();
            System.out.printf("Vejamos ... Que tipo de aluno é %s ... ? %n", nome);
            System.out.println();
            System.out.println("1 - Aquele que se junta aos que gostam de uma aventura ... ?");
            System.out.println("2 - Aquele que se junta aos inteligentes ... ?");
            System.out.println("3 - Aquele que se junta aos que melhor te acolhem ... ?");
            System.out.println("4 - Ou talvez, ache que não preceise se juntar a alguém ... ?");

            resposta = sc.next();
            System.out.println();

            if (resposta.equals("1")){
                System.out.println("...");
                pontoGrifinoria = pontoGrifinoria +1;
                System.out.println("Entendo... pode dar trabalho...");
                System.out.println("...");
                ciclo = true;
            } else if (resposta.equals("2")) {
                System.out.println("...");
                pontoCorvinal = pontoCorvinal + 1;
                System.out.println("Hum... Uma escolha inteligente...");
                System.out.println("...");
                ciclo = true;
            } else if (resposta.equals("3")) {
                System.out.println("...");
                pontoLufa = pontoLufa + 1;
                System.out.println("As vezes é o que realmente precisamos...");
                System.out.println("...");
                ciclo = true;
            } else if (resposta.equals("4")) {
                System.out.println("...");
                pontoSonserina = pontoSonserina + 1;
                System.out.println("Sozinho... Entendo...");
                System.out.println("...");
                ciclo = true;
            }else {
                System.out.println("...");
                System.out.println("Acho que não entende a seriedade disso, criança");
                System.out.println("Perguntarei novamente, responda da forma correta!");
                System.out.println("...");
            }
        }while(!ciclo);
    }

    public void p2(Scanner sc){
        boolean ciclo = false;
        String resposta;

        do {
            System.out.println();
            System.out.printf("Entao, %s, você considera é um bom motivo ir para detenção por ... ?" , nome);
            System.out.println();
            System.out.println("1 - Invadir a Seção Restrita da biblioteca... ? ");
            System.out.println("2 - Brigar com outro aluno para defender um amigo... ?");
            System.out.println("3 - Colocar sua vontade a frente das dos seus amigos e gerar confusao...? ");
            System.out.println("4 - Explorar a Floresta Proibida de Hogwarts... ?");

            resposta = sc.next();
            System.out.println();

            if (resposta.equals("1")){
                System.out.println("...");
                pontoCorvinal = pontoCorvinal + 1;
                System.out.printf("As vezes um sábio pode ser tolo, %s... %n" , nome);
                System.out.println("...");
                ciclo = true;
            } else if (resposta.equals("2")) {
                System.out.println("...");
                pontoLufa = pontoLufa + 1;
                System.out.printf("Nobre causa %s... %n", nome);
                System.out.println("...");
                ciclo = true;
            } else if (resposta.equals("3")) {
                System.out.println("...");
                pontoSonserina = pontoSonserina + 1;
                System.out.println("Determinação... estúpido, porém determinado");
                System.out.println("...");
                ciclo = true;
            } else if (resposta.equals("4")) {
                System.out.println("...");
                pontoGrifinoria = pontoGrifinoria +1;
                System.out.printf("Podemos ver que uma vida longa não agrada %s... %n" , nome);
                System.out.println("...");
                ciclo = true;
            }else {
                System.out.println("...");
                System.out.println("Acho que não entende a seriedade disso, criança");
                System.out.println("Perguntarei novamente, responda da forma correta!");
                System.out.println("...");
            }
        }while(!ciclo);
    }

    public void p3(Scanner sc){
        boolean ciclo = false;
        String resposta;
        do {
            System.out.println();
            System.out.printf("Vejamos... qual ofensa é pior para %s...? %n", nome);
            System.out.println();
            System.out.println("1 - Idiota... ?");
            System.out.println("2 - Bárbaro... ? ");
            System.out.println("3 - Irrelevante... ?");
            System.out.println("4 - Covarde...?");

            resposta = sc.next();
            System.out.println();

            if (resposta.equals("1")){
                System.out.println("...");
                pontoCorvinal = pontoCorvinal + 1;
                System.out.println("Interessante...");
                System.out.println("...");
                ciclo = true;
            } else if (resposta.equals("2")) {
                System.out.println("...");
                pontoLufa = pontoLufa + 1;
                System.out.printf("Vejo bondade em seu coração %s... %n", nome);
                System.out.println("...");
                ciclo = true;
            } else if (resposta.equals("3")) {
                System.out.println("...");
                pontoSonserina = pontoSonserina + 1;
                System.out.printf("%s não gosta de ser deixado de lado... ", nome);
                System.out.println("...");
                ciclo = true;
            } else if (resposta.equals("4")) {
                System.out.println("...");
                pontoGrifinoria = pontoGrifinoria +1;
                System.out.println("Entendo... ");
                System.out.println("...");
                ciclo = true;
            }else {
                System.out.println("...");
                System.out.println("Acho que não entende a seriedade disso, criança");
                System.out.println("Perguntarei novamente, responda da forma correta!");
                System.out.println("...");
            }
        }while (!ciclo);
    }

    public void p4(Scanner sc){
        boolean ciclo = false;
        String resposta;

        do {
            System.out.println();
            System.out.println("Um Hipogrifo pegou dois alunos e só você viu... um que você não conhece ...");
            System.out.println("... E o outro que só lhe faz coisas ruins ... o que fazer ... ?");
            System.out.println();
            System.out.println("1 - Chama professores e alerta a todos o quanto antes ... ? ");
            System.out.println("2 - Cria um plano, que até envolva outras pessoas e tenta resgata-los ...?");
            System.out.println("3 - Não faz diferença, não deveriam ter se metido com o Hipogrifo... ?");
            System.out.println("4 - Sobe imiediatamente em sua vassoura e tenta ajudar... ?");

            resposta = sc.next();
            System.out.println();

            if (resposta.equals("1")){
                System.out.println("...");
                pontoLufa = pontoLufa + 1;
                System.out.printf("Há bondade em você %s ... porém, coragem... %n", nome);
                System.out.println("...");
                ciclo = true;
            } else if (resposta.equals("2")) {
                System.out.println("...");
                pontoCorvinal = pontoCorvinal + 1;
                System.out.println("Um plano bem elaborado, pelo que vejo...");
                System.out.println("...");
                ciclo = true;
            } else if (resposta.equals("3")) {
                System.out.println("...");
                pontoSonserina = pontoSonserina + 1;
                System.out.println("Um impiedoso que reafirma seus ideais com seus sentimentos...");
                System.out.println("...");
                ciclo = true;
            } else if (resposta.equals("4")) {
                System.out.println("...");
                pontoGrifinoria = pontoGrifinoria +1;
                System.out.printf("Espero que pelo menos voe bem, %s %n" , nome);
                System.out.println("...");
                ciclo = true;
            } else {
                System.out.println("...");
                System.out.println("Acho que não entende a seriedade disso, criança");
                System.out.println("Perguntarei novamente, responda da forma correta!");
                System.out.println("...");
            }
        }while(!ciclo);
    }

    public void p5 (Scanner sc){
        boolean ciclo = false;
        String resposta;

        do{
            System.out.println();
            System.out.printf("Pelo que gostaria de ser lembrado, %s ... ? %n",nome);
            System.out.println();
            System.out.println("1 - Pela sua bravura e lealdade ...?");
            System.out.println("2 - Por sua bondade e zelo com seus amigos ...?");
            System.out.println("3 - Pela sua grandeza e força ... ?");
            System.out.println("4 - Por sua inteligência e criatividade ... ?");
            resposta = sc.next();
            System.out.println();

            if (resposta.equals("1")){
                System.out.println("...");
                pontoGrifinoria = pontoGrifinoria +1;
                System.out.printf("Bom... mas tome cuidado, até onde a bravura pode te levar, %s %n" , nome);
                System.out.println("...");
                ciclo = true;
            } else if (resposta.equals("2")) {
                System.out.println("...");
                pontoLufa = pontoLufa + 1;
                System.out.printf("Seu coração é bom, %s ... mas cuidado, alguns veem isso como fraqueza... %n", nome);
                System.out.println("...");
                ciclo = true;
            } else if (resposta.equals("3")) {
                System.out.println("...");
                pontoSonserina = pontoSonserina + 1;
                System.out.println("Já era esperado...");
                System.out.println("...");
                ciclo = true;
            } else if (resposta.equals("4")) {
                System.out.println("...");
                pontoCorvinal = pontoCorvinal + 1;
                System.out.println("Entendo... e isso pode ser possivel...");
                System.out.println("...");
                ciclo = true;
            } else {
                System.out.println("...");
                System.out.println("Acho que não entende a seriedade disso, criança");
                System.out.println("Perguntarei novamente, responda da forma correta!");
                System.out.println("...");
            }

        }while (!ciclo);
    }

}
