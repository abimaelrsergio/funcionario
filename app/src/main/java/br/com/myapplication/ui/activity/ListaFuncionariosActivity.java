package br.com.myapplication.ui.activity;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.List;

import br.com.myapplication.R;
import br.com.myapplication.dao.FuncionarioDAO;
import br.com.myapplication.model.Funcionario;

public class ListaFuncionariosActivity extends AppCompatActivity {

    public static final String TITULO_APPBAR = "Lista de Funcionários";
    private final FuncionarioDAO funcionarioDao = new FuncionarioDAO();

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_funcionarios);
        setTitle(TITULO_APPBAR);
        configurarBotaoNovoAluno();
    }

    private void configurarBotaoNovoAluno() {
        FloatingActionButton botaoNovoFuncionario = findViewById(R.id.activity_lista_funcionarios_fab_novo_funcionario);
        botaoNovoFuncionario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirFormulario();
            }
        });
    }

    private void abrirFormulario() {
        startActivity(new Intent(this, FormularioFuncionarioActivity.class));
    }

    @Override
    protected void onResume() {
        super.onResume();
        configurarLista();
    }

    private void configurarLista() {
        ListView listaDeFuncionarios = findViewById(R.id.activity_lista_alunos_listview);
        final List<Funcionario> funcionarios = funcionarioDao.getAll();
        listaDeFuncionarios.setAdapter(new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                funcionarios));
        listaDeFuncionarios.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Funcionario funcionarioEscolhido = funcionarios.get(position);
                Intent irParaFormulario = new Intent(ListaFuncionariosActivity.this, FormularioFuncionarioActivity.class);
                irParaFormulario.putExtra("funcionario", funcionarioEscolhido);
                startActivity(irParaFormulario);
            }
        });
    }
}




