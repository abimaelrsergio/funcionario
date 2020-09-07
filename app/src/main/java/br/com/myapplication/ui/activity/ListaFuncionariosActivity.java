package br.com.myapplication.ui.activity;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import br.com.myapplication.R;

public class ListaFuncionariosActivity extends AppCompatActivity {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_funcionarios);
        setTitle("Lista de Funcionários");
        List<String> funcionarios = new ArrayList<>(Arrays.asList("Nefi", "Jaco","Abimael", "Jarom", "Tiago", "Paulo","Patricia","Maria", "Ingrid","Giselle","Maria das Dores", "Salvan", "Igor", "Irene", "Shirley", "Patricia", "Bruna", "Bruno", "Adriano", "David", "Jonhy"));
        ListView listaDeFuncionarios = findViewById(R.id.activity_lista_alunos_listview);
        // o simple_list_item_1 é um layout pronto do Android com um textView já incluído
        listaDeFuncionarios.setAdapter(new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,funcionarios));
    }
}


