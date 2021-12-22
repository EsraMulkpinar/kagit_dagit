package com.example.kart_dagit;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {

    ImageView arka, kart_1, kart_2, kart_3, kart_4, kart_5, kart_6, kart_7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        arka = (ImageView) findViewById(R.id.arka);
        kart_1 = (ImageView) findViewById(R.id.kart_1);
        kart_2 = (ImageView) findViewById(R.id.kart_2);
        kart_3 = (ImageView) findViewById(R.id.kart_3);
        kart_4 = (ImageView) findViewById(R.id.kart_4);
        kart_5 = (ImageView) findViewById(R.id.kart_5);
        kart_6 = (ImageView) findViewById(R.id.kart_6);
        kart_7 = (ImageView) findViewById(R.id.kart_7);

        kart_1.setVisibility(View.VISIBLE);
        kart_2.setVisibility(View.VISIBLE);
        kart_3.setVisibility(View.VISIBLE);
        kart_4.setVisibility(View.VISIBLE);
        kart_5.setVisibility(View.VISIBLE);
        kart_6.setVisibility(View.VISIBLE);
        kart_7.setVisibility(View.VISIBLE);

        ArrayList<Integer> card = new ArrayList<Integer>();

        card.add(109); // maca 9
        card.add(110); // maca 10
        card.add(111); // maca as
        card.add(112); // maca vale
        card.add(113); // maca kız
        card.add(114); // maca papaz

        card.add(209); // karo 9
        card.add(210); // karo 10
        card.add(211); // karo as
        card.add(212); // karo vale
        card.add(213); // karo kız
        card.add(214); // karo papaz

        card.add(309); // kupa 9
        card.add(310); // kupa 10
        card.add(311); // kupa as
        card.add(312); // kupa vale
        card.add(313); // kupa kız
        card.add(314); // kupa papaz

        card.add(409); // sinek 9
        card.add(410); // sinek 10
        card.add(411); // sinek as
        card.add(412); // sinek vale
        card.add(413); // sinek kız
        card.add(414); // sinek papaz


        arka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Collections.shuffle(card);

                kartlara_atamak(card.get(0), kart_1);
                kartlara_atamak(card.get(1), kart_2);
                kartlara_atamak(card.get(2), kart_3);
                kartlara_atamak(card.get(3), kart_4);
                kartlara_atamak(card.get(4), kart_5);
                kartlara_atamak(card.get(5), kart_6);
                kartlara_atamak(card.get(6), kart_7);

                kart_1.setVisibility(View.VISIBLE);
                kart_2.setVisibility(View.VISIBLE);
                kart_3.setVisibility(View.VISIBLE);
                kart_4.setVisibility(View.VISIBLE);
                kart_5.setVisibility(View.VISIBLE);
                kart_6.setVisibility(View.VISIBLE);
                kart_7.setVisibility(View.VISIBLE);
            }
        });
    }


    public void kartlara_atamak(int card, ImageView image) {


        switch (card) {
            case 109:
                image.setImageResource(R.drawable.maca_9);
                break;
            case 110:
                image.setImageResource(R.drawable.maca_10);
                break;

            case 111:
                image.setImageResource(R.drawable.maca_as);
                break;

            case 112:
                image.setImageResource(R.drawable.maca_vale);
                break;
            case 113:
                image.setImageResource(R.drawable.maca_kiz);
                break;

            case 114:
                image.setImageResource(R.drawable.maca_papaz);
                break;


            case 209:
                image.setImageResource(R.drawable.karo_9);
                break;
            case 210:
                image.setImageResource(R.drawable.karo_10);
                break;

            case 211:
                image.setImageResource(R.drawable.karo_as);
                break;

            case 212:
                image.setImageResource(R.drawable.karo_vale);
                break;

            case 213:
                image.setImageResource(R.drawable.karo_kiz);
                break;

            case 214:
                image.setImageResource(R.drawable.karo_papaz);
                break;


            case 309:
                image.setImageResource(R.drawable.kupa_9);
                break;

            case 310:
                image.setImageResource(R.drawable.kupa_10);
                break;

            case 311:
                image.setImageResource(R.drawable.kupa_as);
                break;

            case 312:
                image.setImageResource(R.drawable.kupa_vale);
                break;

            case 313:
                image.setImageResource(R.drawable.kupa_kiz);
                break;

            case 314:
                image.setImageResource(R.drawable.kupa_papaz);
                break;


            case 409:
                image.setImageResource(R.drawable.sinek_9);
                break;

            case 410:
                image.setImageResource(R.drawable.sinek_10);
                break;

            case 411:
                image.setImageResource(R.drawable.sinek_as);
                break;

            case 412:
                image.setImageResource(R.drawable.sinek_vale);
                break;

            case 413:
                image.setImageResource(R.drawable.sinek_kiz);
                break;

            case 414:
                image.setImageResource(R.drawable.sinek_papaz);
                break;

        }


    }


}