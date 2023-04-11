package com.example.geradordeversiculos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void novoVersiculo(View view) {
        String[] frases = {
                "Pois onde estiver o teu tesouro, aí estará também o teu coração. (Mateus 6:21)",
                "Bom é o Senhor para os que nele esperam, para os que o buscam; (Lamentações 3:25)",
                "Então vocês me invocarão e virão orar a mim, e eu os ouvirei. (Jeremias 29:12)",
                "Não se entristeça, pois a alegria do Senhor é a sua força. (Neemias 8:10)",
                "No amor não há temor, mas o perfeito amor lança fora o medo. (1 João 4:18)",
                "Escolhi o caminho da fidelidade; Eu coloquei meu coração em suas leis. (Salmos 119:30)",
                "Retenhamos firme a confissão da nossa esperança, sem vacilar, porque aquele que prometeu é fiel. (Hebreus 10:23)",
                "Deleita-te também no Senhor, e ele te concederá os desejos do teu coração. (Salmos 37:4)",
                "Ao  ouvir o que diziam, Jesus lhe disse: “Não tenha medo; apenas acredite. (Marcos 5:36)",
                "Seja forte e corajoso; não se assuste nem se assuste, pois o Senhor, o seu Deus, está com você por onde você andar. (Josué 1:9 )"
        };
        int numero = new Random().nextInt(9);
        TextView texto = findViewById(R.id.textResultado);
        texto.setText(frases[numero]);
    }
}