package br.mdan.gameslist;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Objects;

public class GamesDetail extends AppCompatActivity {

    ImageView recebeFoto;
    TextView recebeNome;
    TextView ano;
    TextView estudio;
    //int[] year = {0, 1, 2};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game_detail);

        recebeFoto = findViewById(R.id.ivRecebeFoto);
        recebeNome = findViewById(R.id.tvRecebeNome);
        ano = findViewById(R.id.tvYear);
        estudio = findViewById(R.id.tvStudio);

        Intent intent = getIntent();

        int foto = intent.getIntExtra("foto_jogo", 0);
        String nome = intent.getStringExtra("nome_jogo");
        String lancamento = intent.getStringExtra("ano_jogo");
        String desenvolvedora = intent.getStringExtra("studio_jogo");

        recebeFoto.setImageResource(foto);
        recebeNome.setText(nome);
        ano.setText(lancamento);
        estudio.setText(desenvolvedora);

        //getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            onBackPressed();

        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {
        //super.onBackPressed();
        //finish();
        //Intent intent = new Intent(getApplicationContext(),MainActivity.class);
        //startActivity(intent);
        super.onBackPressed();
    }

//    @Override
//    public boolean onSupportNavigateUp() {
//        startActivity(new Intent(this, MainActivity.class));
//        finish();
//        return true;
//    }

}
