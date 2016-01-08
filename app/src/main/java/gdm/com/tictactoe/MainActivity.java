package gdm.com.tictactoe;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Typeface Police_1 = Typeface.createFromAsset(getAssets(), "fonts/libertylegion.ttf");
        Typeface Police_2 = Typeface.createFromAsset(getAssets(), "fonts/libertylegion.ttf");

        Button btn_mode_apprentissage = (Button) findViewById(R.id.button);
        Button btn_tictactoe = (Button) findViewById(R.id.mybouton_1);
        Button btn_1_vs_1 = (Button) findViewById(R.id.bouton_2);
        Button btn_1_vs_IA = (Button) findViewById(R.id.bouton_3);

        TextView texteView_1 = (TextView) findViewById(R.id.mybouton_1);
        TextView texteView = (TextView) findViewById(R.id.button);
        TextView texteView_2 = (TextView) findViewById(R.id.bouton_2);
        TextView texteView_3 = (TextView) findViewById(R.id.bouton_3);

        texteView.setTypeface(Police_1);
        texteView_1.setTypeface(Police_1);
        texteView_2.setTypeface(Police_1);
        texteView_3.setTypeface(Police_1);

        btn_1_vs_1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, scene_game.class);
                startActivity(intent);

            }
        });


    }
}
