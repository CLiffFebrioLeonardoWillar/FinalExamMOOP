package com.example.gamebattle;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;


import com.example.gamebattle.gameplay.BattleWorker;
import com.example.gamebattle.gameplay.Castle;
import com.example.gamebattle.gameplay.CavalryCastle;
import com.example.gamebattle.gameplay.InfantryCastle;

import  java.lang.Thread;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        final Activity myActivity = this;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final CavalryCastle c1 = new CavalryCastle();
        final InfantryCastle c2 = new InfantryCastle();


        Castle fightingCastles[] = new Castle[2];
        fightingCastles[0] = c1;
        fightingCastles[1] = c2;


        initCastleImageBattle(fightingCastles);

        final Button btn = findViewById(R.id.fightNowBtn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                BattleWorker bw= new BattleWorker(myActivity, c1,c2);
                new Thread(bw).run();
            }
        });
    }

    private void initCastleImageBattle(Castle[] castles) {
        Castle left = castles[0];
        Castle right = castles[1];

        loadCastleImage((ImageView) findViewById(R.id.CastleLeft), left);
        loadCastleImage((ImageView) findViewById(R.id.CastleRight), right);
    }

    private void loadCastleImage(ImageView iView, Castle ct) {
        if (ct instanceof CavalryCastle) {
            iView.setBackgroundResource(R.drawable.rk);
        } else if (ct instanceof InfantryCastle) {
            iView.setBackgroundResource(R.drawable.bk);
        } else {
            iView.setBackgroundResource(R.drawable.rk);
        }
    }

}