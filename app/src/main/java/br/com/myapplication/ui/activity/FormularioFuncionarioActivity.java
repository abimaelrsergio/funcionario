package br.com.myapplication.ui.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import br.com.myapplication.R;
import br.com.myapplication.model.Funcionario;

public class FormularioFuncionarioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario_funcionario);
        final EditText campoNome = findViewById(R.id.activity_formulario_funcionario_nome);
        final EditText campoEmail = findViewById(R.id.activity_formulario_funcionario_email);
        final EditText campoTelefone = findViewById(R.id.activity_formulario_funcionario_telefone);
        Button botaoSalvar = findViewById(R.id.activity_formulario_funcionario_botao_salvar);
        botaoSalvar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String nome = campoNome.getText().toString();
                String email = campoEmail.getText().toString();
                String telefone = campoTelefone.getText().toString();
                Funcionario funcionario = new Funcionario(nome, telefone, email);
            }
        });
    }
}