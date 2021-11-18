package com.example.actividadnavdreawercesar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.Navigation;

public class nav_sitiowebb extends AppCompatActivity {

    EditText et1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_nav_sitioweb);

        //Enlazar la parte lógica y diseño
        et1 = (EditText) findViewById(R.id.txtVie);

    }

    public void navegar(View view) {
        //Se establecen cambios de pantallas o activitys
        Intent i = new Intent(this,webweb.class);
        //Enviar parametros intent, metodo put extra
        i.putExtra("SitioWeb", et1.getText().toString());
        startActivity(i);
    }

}
