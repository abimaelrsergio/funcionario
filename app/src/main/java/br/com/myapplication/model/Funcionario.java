package br.com.myapplication.model;

public class Funcionario {

    private final String nome;
    private final String telefone;
    private final String email;

    // usar alt + enter em cima da variável para criar os fields
    public Funcionario(String nome, String telefone, String email) {

        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    // usar alt + Insert para criar os getters

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public String getNome() {
        return nome;
    }
}
