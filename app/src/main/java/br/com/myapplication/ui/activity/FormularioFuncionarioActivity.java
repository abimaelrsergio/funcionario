package br.com.myapplication.ui.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import br.com.myapplication.R;

public class FormularioFuncionarioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // improte a classe R abaixo
        setContentView(R.layout.activity_formulario_funcionario);
    }
}