package br.com.myapplication;
import androidx.annotation.Nullable;
import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends Activity {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<String> times = new ArrayList<>(Arrays.asList("Corinthians", "São Paulo","Santos"));
        TextView primeiroTime = findViewById(R.id.textView);
        TextView segundoTime = findViewById(R.id.textView2);
        TextView terceiroTime = findViewById(R.id.textView3);
        primeiroTime.setText(times.get(0));
        segundoTime.setText(times.get(1));
        terceiroTime.setText(times.get(2));
    }
}


