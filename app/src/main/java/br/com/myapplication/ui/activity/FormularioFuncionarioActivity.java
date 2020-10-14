package br.com.myapplication.ui.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import br.com.myapplication.R;
import br.com.myapplication.dao.FuncionarioDAO;
import br.com.myapplication.model.Funcionario;

import static br.com.myapplication.ui.activity.Constantes.CHAVE;

public class FormularioFuncionarioActivity extends AppCompatActivity {

    public static final String TITULO_APPBAR = "Novo Funcionário";
    private EditText campoNome;
    private EditText campoEmail;
    private EditText campoTelefone;
    private final FuncionarioDAO dao = new FuncionarioDAO();
    private Funcionario funcionario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario_funcionario);
        setTitle(TITULO_APPBAR);
        inicializarCampos();
        configurarBotaoSalvar();
        Intent dados = getIntent();
        if (dados.hasExtra(CHAVE)) {
            funcionario = (Funcionario) dados.getSerializableExtra(CHAVE);
            campoNome.setText(funcionario.getNome());
            campoEmail.setText(funcionario.getEmail());
            campoTelefone.setText(funcionario.getTelefone());
        } else {
            funcionario = new Funcionario();
        }
    }

    private void configurarBotaoSalvar() {
        Button botaoSalvar = findViewById(R.id.activity_formulario_funcionario_botao_salvar);
        botaoSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                prepararFuncionario();
                if (funcionario.isValidId()){
                    dao.editar(funcionario);
                } else {
                    dao.salva(funcionario);
                }
                finish();
            }
        });
    }

    private void inicializarCampos() {
        campoNome = findViewById(R.id.activity_formulario_funcionario_nome);
        campoEmail = findViewById(R.id.activity_formulario_funcionario_email);
        campoTelefone = findViewById(R.id.activity_formulario_funcionario_telefone);
    }

    private void prepararFuncionario() {
        String nome = campoNome.getText().toString();
        String email = campoEmail.getText().toString();
        String telefone = campoTelefone.getText().toString();

        funcionario.setNome(nome);
        funcionario.setEmail(email);
        funcionario.setTelefone(telefone);
    }
}

