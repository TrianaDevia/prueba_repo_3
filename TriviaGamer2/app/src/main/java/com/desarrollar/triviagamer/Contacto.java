package com.desarrollar.triviagamer;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Contacto extends AppCompatActivity {

    Button btnenvcontacto;
    ImageButton volverayuda;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacto);

        btnenvcontacto= findViewById(R.id.button10);
        volverayuda = findViewById(R.id.backButtoncontac);
        btnenvcontacto.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Contacto.this, Home.class);
                startActivity(intent);
            }
        });
        volverayuda.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Contacto.this, ayuda.class);
                startActivity(intent);
            }
        });
    }

}