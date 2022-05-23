package Casas;

import DescobrirCasa.Exibir;
import DescobrirCasa.Perguntas;

import java.util.ArrayList;
import java.util.Scanner;

public class Hogwarts {

    Scanner sc = new Scanner(System.in);
    protected static int pontoGrifinoria = 0;
    protected static int pontoSonserina = 0;
    protected static int pontoLufa = 0;
    protected static int pontoCorvinal = 0;



    protected String nome;

    public Hogwarts(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void executar(){
        Perguntas perguntas = new Perguntas(nome);
        perguntas.p1(sc);
        perguntas.p2(sc);
        perguntas.p3(sc);
        if (decisaoAntecipada()){
            pontoCorvinal = 0;
            pontoSonserina = 0;
            pontoGrifinoria = 0;
            pontoLufa = 0;
         return;
        }else {
            perguntas.p4(sc);
            perguntas.p5(sc);
            decisaoFinal();
            pontoCorvinal = 0;
            pontoSonserina = 0;
            pontoGrifinoria = 0;
            pontoLufa = 0;
        }
    }

    public boolean decisaoAntecipada(){
        if (pontoCorvinal == 3){
            System.out.printf("Não há necessidade de mais perguntas, %s irá para Corvinal!", nome);
            Exibir exibir = new Exibir();
            exibir.add(nome,"Corvinal");
            return true;
        } else if (pontoGrifinoria == 3) {
            System.out.printf("Há muita coragem em você, %s, para Grifinoria! %n", nome);
            Exibir exibir = new Exibir();
            exibir.add(nome,"Grifinória");
            return true;
        }else if (pontoLufa == 3){
            System.out.printf("Você tem um grandioso coração, %s, irá para Lufa-Lufa! %n", nome);
            Exibir exibir = new Exibir();
            exibir.add(nome,"Lufa-Lufa");
            return true;
        } else if (pontoSonserina == 3) {
            System.out.printf("Voce é astuto, jovem %s... porém extremamente ambicioso... Sonserina! %n", nome);
            Exibir exibir = new Exibir();
            exibir.add(nome,"Sonserina");
            return true;
        }
        return false;
    }

    public void decisaoFinal(){
        if (pontoCorvinal > pontoSonserina && pontoCorvinal > pontoLufa && pontoCorvinal > pontoGrifinoria){
            System.out.printf("Está decidido entao! %s irá para Corvinal! %n", nome);
            Exibir exibir = new Exibir();
            exibir.add(nome,"Corvinal");
        } else if (pontoGrifinoria > pontoCorvinal && pontoGrifinoria > pontoSonserina && pontoGrifinoria > pontoLufa){
            System.out.printf("3 pontos para Gr... digo, %s irá para Grifinoria! %n", nome);
            Exibir exibir = new Exibir();
            exibir.add(nome,"Grifinória");
        } else if (pontoLufa > pontoGrifinoria && pontoLufa > pontoSonserina && pontoLufa > pontoCorvinal){
            System.out.printf("Um coração bondoso... com certeza, %s irá para Lufa Lufa! %n",nome);
            Exibir exibir = new Exibir();
            exibir.add(nome,"Lufa-Lufa");
        } else if (pontoSonserina > pontoLufa && pontoSonserina > pontoGrifinoria && pontoSonserina > pontoCorvinal){
            System.out.printf("Entendo... muito ambicioso... %s irá para Sonseria! %n",nome);
            Exibir exibir = new Exibir();
            exibir.add(nome,"Sonserina");
        }
    }


}
