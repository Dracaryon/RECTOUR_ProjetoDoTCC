package telas.mobitour.pretcc.com.telas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Telalogin extends AppCompatActivity {

    private Button botaoExplorar;
    private TextView botaoExplorarSemCad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_tela_login);

        botaoExplorar = findViewById(R.id.botaoLoginId);
        botaoExplorarSemCad =  findViewById(R.id.imgViewLoginSemCadId);

        botaoExplorar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(Telalogin.this, Tela_MainActivity.class));
            }
        });

        botaoExplorarSemCad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(Telalogin.this, Tela_MainActivity.class));
            }
        });
    }
}
