package br.com.myapplication.model;

import java.io.Serializable;

public class Funcionario implements Serializable {

    private int id = 0;
    private String nome;
    private String telefone;
    private String email;

    public Funcionario() {
    }

    public Funcionario(String nome, String telefone, String email) {

        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return nome;
    }

    public void setId(int contadorDeIds) {
        this.id = contadorDeIds;
    }

    public int getId() {
        return id;
    }

    public boolean isValidId() {
        return id > 0;
    }
}

