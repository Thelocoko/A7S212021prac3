package mx.edu.tesoem.isc.ecr.a7s212021prac3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    String[] strestados;
    List listEstado;
    ArrayAdapter<String> adaptador;

    Spinner spestados;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spestados = findViewById(R.id.sp_estados_D);
        strestados = new  String[]{"CDMX","Jalisco","Nuevo Leon","Durango","Tabasco"};
        listEstado = new ArrayList<String>();
        Collections.addAll(listEstado,strestados);
        adaptador = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item);
        spestados.setAdapter(adaptador);
        spestados.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String valor = spestados.getSelectedItem().toString();
        Toast.makeText(this, "Usted selecciono: " + valor, Toast.LENGTH_LONG).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}