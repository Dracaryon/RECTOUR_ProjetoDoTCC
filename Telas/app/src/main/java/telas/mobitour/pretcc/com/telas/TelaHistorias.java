package telas.mobitour.pretcc.com.telas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class TelaHistorias extends AppCompatActivity {

    ImageView historiasFrevoId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_tela_historias);

        historiasFrevoId = findViewById(R.id.historiasClickFrevoId);


        //Navegar
        historiasFrevoId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(TelaHistorias.this, TelaHistoriasDetalheActivity.class));
            }
        });

    }
}
