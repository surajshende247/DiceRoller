package com.diceroller.app;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ImageView imgDice;
    MediaPlayer mp1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mp1= MediaPlayer.create(this, R.raw.dice_rolling);







        imgDice = findViewById(R.id.imgDice);

        imgDice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (mp1 != null) {
                    mp1.stop();
                    mp1.release();
                    mp1 = null;
                }
                mp1= MediaPlayer.create(getApplicationContext(), R.raw.dice_rolling);

                        mp1.start();
                        Random random = new Random();
                        int num =  random.nextInt(6) + 1;
                        switch (num)
                        {
                            case 1:
                                imgDice.setImageResource(R.drawable.dice1);
                                break;
                            case 2:
                                imgDice.setImageResource(R.drawable.dice2);
                                break;
                            case 3:
                                imgDice.setImageResource(R.drawable.dice3);
                                break;
                            case 4:
                                imgDice.setImageResource(R.drawable.dice4);
                                break;
                            case 5:
                                imgDice.setImageResource(R.drawable.dice5);
                                break;
                            case 6:
                                imgDice.setImageResource(R.drawable.dice6);
                                break;
                        }




            }
        });
    }
}