package com.example.amaliacocina_01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PantPerfil extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pant_perfil);

    }

    public void irCupones(View view){
        Intent i = new Intent(this,Cupones.class);
        startActivity(i);
    }
}