package br.com.myapplication.ui.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import br.com.myapplication.R;
import br.com.myapplication.dao.FuncionarioDAO;
import br.com.myapplication.model.Funcionario;

public class FormularioFuncionarioActivity extends AppCompatActivity {

    public static final String TITULO_APPBAR = "Novo Funcionário";
    private EditText campoNome;
    private EditText campoEmail;
    private EditText campoTelefone;
    final FuncionarioDAO dao = new FuncionarioDAO();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario_funcionario);
        setTitle(TITULO_APPBAR);
        inicializarCampos();
        configurarBotaoSalvar();
    }

    private void configurarBotaoSalvar() {
        Button botaoSalvar = findViewById(R.id.activity_formulario_funcionario_botao_salvar);
        botaoSalvar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Funcionario funcionario = criarFuncionario();
                salvarFuncionario(funcionario);
            }
        });
    }

    private void inicializarCampos() {
        campoNome = findViewById(R.id.activity_formulario_funcionario_nome);
        campoEmail = findViewById(R.id.activity_formulario_funcionario_email);
        campoTelefone = findViewById(R.id.activity_formulario_funcionario_telefone);
    }

    private void salvarFuncionario(Funcionario funcionario) {
        dao.salva(funcionario);
        finish();
    }

    private Funcionario criarFuncionario() {
        String nome = campoNome.getText().toString();
        String email = campoEmail.getText().toString();
        String telefone = campoTelefone.getText().toString();
        return new Funcionario(nome, telefone, email);
    }
}

