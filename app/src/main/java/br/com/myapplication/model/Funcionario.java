package br.com.myapplication.model;

public class Funcionario {

    private final String nome;
    private final String telefone;
    private final String email;

    public Funcionario(String nome, String telefone, String email) {

        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    @Override
    public String toString() {
        return nome;
    }
}

