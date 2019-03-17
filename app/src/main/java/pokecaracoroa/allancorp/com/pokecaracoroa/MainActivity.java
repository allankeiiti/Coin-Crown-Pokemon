package pokecaracoroa.allancorp.com.pokecaracoroa;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import java.util.Random;

public class MainActivity extends Activity {

    private ImageView play;
    private String[] opcao = {"cara", "coroa"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        play =  findViewById(R.id.startId);

        play.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                //Gerar Numero aleatório de 0 a 1
                Random randomico = new Random();
                int numRandom = randomico.nextInt(2); //Pegar o 0 e o 1 (Cara e Coroa no Array)

                // opcao[numRandom]
                Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                intent.putExtra("opcao", opcao[numRandom]);

                startActivity(intent);
            }
        });


    }

}
