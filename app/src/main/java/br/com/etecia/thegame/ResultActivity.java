package br.com.etecia.thegame;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;
public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Button btnVoltar = findViewById(R.id.btnVoltar);
        ImageView imageResult = findViewById(R.id.imageView3);
        Random aleatorio = new Random();

        int numAlea = aleatorio.nextInt(0-1);

        if (numAlea == 1){
            imageResult.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.moeda_coroa));
        } else {
            imageResult.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.moeda_cara));
        }

    }
}
