package ng.layer7.langlearn;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Phrases extends AppCompatActivity {

    ImageView goodmorning,goingto,wantwater;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases);

        goodmorning = (ImageView)findViewById(R.id.good_morn_sound);
        goingto = (ImageView) findViewById(R.id.goingto);
        wantwater = (ImageView) findViewById(R.id.wantwater);

        final MediaPlayer mediaPlayer1 = MediaPlayer.create(this,R.raw.goodmorning);
        final MediaPlayer mediaPlayer2 = MediaPlayer.create(this,R.raw.goingto);
        final MediaPlayer mediaPlayer3 = MediaPlayer.create(this,R.raw.wantsomewater);

        // play good morning audio
        goodmorning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer1.start();

            }
        });

        // play going to audio
        goingto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer2.start();

            }
        });

        // play want water audio
        wantwater.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer3.start();

            }
        });
    }
}
