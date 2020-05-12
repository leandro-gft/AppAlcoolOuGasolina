package br.com.gft.appalcoolougasolina;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText etanol;
    private EditText gasolina;
    private Button calcular;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etanol = findViewById(R.id.et_etanol);
        gasolina = findViewById(R.id.et_gasolina);
        calcular = findViewById(R.id.bt_calcular);
        resultado = findViewById(R.id.text_opcao);

    }

    public void calcular(View v){
        double calculo = Double.valueOf(etanol.getText().toString())/Double.valueOf(gasolina.getText().toString());
        if (calculo < 0.70) {
            resultado.setText("Melhor utilizar etanol");
        } else {
            resultado.setText("Melhor utilizar gasolina");
        }

    }

}
