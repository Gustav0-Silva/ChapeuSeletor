package DescobrirCasa;

import Casas.Alunos;
import Casas.Hogwarts;

import java.util.ArrayList;
import java.util.List;

public class Exibir {

    private static List<Alunos> listaAlunos = new ArrayList<>();

    public void add (String nome, String casa){
        Alunos aluno = new Alunos(nome, casa);
        listaAlunos.add(aluno);
    }

    public void exibir(){
        for (int i = 0; i < listaAlunos.size(); i++) {
            System.out.println("-----------------------------------------------");
            System.out.println("Casa: " + listaAlunos.get(i).getCasa());
            System.out.println("Nome do aluno: " + listaAlunos.get(i).getNome());
            System.out.println("-----------------------------------------------");
            System.out.println();
        }
    }

    public void exibirGrif(){
        int flag = 0;
        System.out.println();
        System.out.println("Alunos da casa Grifinória");
        System.out.println();
        for (int i = 0; i < listaAlunos.size(); i++) {
            String teste = listaAlunos.get(i).getCasa();
            if (teste.equals("Grifinória")){
                System.out.println("-----------------------------------------------");
                System.out.println("Nome do aluno: " + listaAlunos.get(i).getNome());
                System.out.println("-----------------------------------------------");
                System.out.println();
                flag = 1;
            }
        }
        if (flag == 0){
            System.out.println("Ainda não tem alunos nessa casa!");
        }
    }

    public void exibirCorv(){
        int flag = 0;
        System.out.println();
        System.out.println("Alunos da casa Corvinal");
        System.out.println();
        for (int i = 0; i < listaAlunos.size(); i++) {
            String teste = listaAlunos.get(i).getCasa();
            if (teste.equals("Corvinal")){
                System.out.println("-----------------------------------------------");
                System.out.println("Nome do aluno: " + listaAlunos.get(i).getNome());
                System.out.println("-----------------------------------------------");
                System.out.println();
                flag = 1;
            }
        }
        if (flag == 0){
            System.out.println("Ainda não tem alunos nessa casa!");
        }
    }

    public void exibirLufa(){
        int flag = 0;
        System.out.println();
        System.out.println("Alunos da casa Lufa-Lufa");
        System.out.println();
        for (int i = 0; i < listaAlunos.size(); i++) {
            String teste = listaAlunos.get(i).getCasa();
            if (teste.equals("Lufa-Lufa")){
                System.out.println("-----------------------------------------------");
                System.out.println("Nome do aluno: " + listaAlunos.get(i).getNome());
                System.out.println("-----------------------------------------------");
                System.out.println();
                flag = 1;
            }
        }
        if (flag == 0){
            System.out.println("Ainda não tem alunos nessa casa!");
        }
    }

    public void exibirSons(){
        int flag = 0;
        System.out.println();
        System.out.println("Alunos da casa Sonserina");
        System.out.println();
        for (int i = 0; i < listaAlunos.size(); i++) {
            String teste = listaAlunos.get(i).getCasa();
            if (teste.equals("Sonserina")){
                System.out.println("-----------------------------------------------");
                System.out.println("Nome do aluno: " + listaAlunos.get(i).getNome());
                System.out.println("-----------------------------------------------");
                System.out.println();
                flag = 1;
            }
        }
        if (flag == 0){
            System.out.println("Ainda não tem alunos nessa casa!");
        }
    }

}
