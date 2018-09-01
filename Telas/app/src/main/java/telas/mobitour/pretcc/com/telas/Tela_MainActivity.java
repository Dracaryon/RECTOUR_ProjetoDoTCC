package telas.mobitour.pretcc.com.telas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Tela_MainActivity extends AppCompatActivity {

    ImageView navegarMainId;
    ImageView historiasMainId;
    ImageView galeriaMainId;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_tela_main);

        navegarMainId = findViewById(R.id.navegarMainId);
        historiasMainId =  findViewById(R.id.historiasMainId);
        galeriaMainId =  findViewById(R.id.galeriaMainId);

        //Navegar
        navegarMainId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(Tela_MainActivity.this, Mapa_Dexcricao.class));
            }
        });
        //Histórias
        historiasMainId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(Tela_MainActivity.this, TelaHistorias.class));
            }
        });
        //Galerias
        galeriaMainId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(Tela_MainActivity.this, Tela_MainActivity.class));
            }
        });
    }

    void intents (){


    }
}


