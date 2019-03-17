package pokecaracoroa.allancorp.com.pokecaracoroa;

import android.app.Activity;
import android.content.Intent;
import android.media.Image;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class DetailActivity extends Activity {

    private ImageView coin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        coin = (ImageView) findViewById(R.id.coinId);

        Bundle extra = getIntent().getExtras();
        if(extra != null){
            String opcaoEscolhida = extra.getString("opcao");
            if(opcaoEscolhida.equals("cara")){
                // Imagem Cara
                coin.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.moeda_cara));
                Toast.makeText(getApplicationContext(), "Cara", Toast.LENGTH_SHORT).show();
            }else{
                // Imagem Coroa
                coin.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.moeda_coroa));
                Toast.makeText(getApplicationContext(), "Coroa", Toast.LENGTH_SHORT).show();
            }
        }

    }
}
