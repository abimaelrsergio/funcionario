package br.com.myapplication;
import androidx.annotation.Nullable;
import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends Activity {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<String> funcionarios = new ArrayList<>(Arrays.asList("Nefi", "Jaco","Abimael", "Jarom", "Tiago", "Paulo","Patricia","Maria"));
        ListView listaDeFuncionarios = findViewById(R.id.activity_main_lista_funcionarios);
        // o simple_list_item_1 é um layout pronto do Android com um textView já incluído
        listaDeFuncionarios.setAdapter(new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,funcionarios));
    }
}


