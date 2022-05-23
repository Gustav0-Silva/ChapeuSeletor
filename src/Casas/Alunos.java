package Casas;

import java.util.ArrayList;

public class Alunos extends Hogwarts{

    private String casa;

    public Alunos(String nome, String casa) {
        super(nome);
        this.casa = casa;
    }

    public String getCasa() {
        return casa;
    }
}
