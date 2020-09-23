package br.com.myapplication.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.myapplication.model.Funcionario;

public class FuncionarioDAO {

    private final static List<Funcionario> funcionarios = new ArrayList<>();
    private static int contadorDeIds = 1;

    public void salva(Funcionario funcionario) {
        funcionario.setId(contadorDeIds);
        funcionarios.add(funcionario);
        contadorDeIds++;
    }

    public void editar(Funcionario funcionario) {
        Funcionario funcionarioEncontrado = null;
        for (Funcionario f : funcionarios) {
            if (f.getId() == funcionario.getId()) {
                funcionarioEncontrado = f;
                break;
            }
        }
        if (funcionarioEncontrado != null) {
            int posicao = funcionarios.indexOf(funcionarioEncontrado);
            funcionarios.set(posicao, funcionario);
        }
    }

    public List<Funcionario> getAll() {
        return new ArrayList<>(funcionarios); // cópia
    }
}
