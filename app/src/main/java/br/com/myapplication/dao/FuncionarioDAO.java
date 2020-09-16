package br.com.myapplication.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.myapplication.model.Funcionario;

public class FuncionarioDAO {

    private final static List<Funcionario> funcionarios = new ArrayList<>();

    public void salva(Funcionario funcionario){
        funcionarios.add(funcionario);
    }

    public List<Funcionario> getAll() {
        return new ArrayList<>(funcionarios); // cópia
    }
}
