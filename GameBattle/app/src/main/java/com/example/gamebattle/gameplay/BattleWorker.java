package com.example.gamebattle.gameplay;

import android.app.Activity;
import android.widget.Toast;

public class BattleWorker implements Runnable {

    private Castle c1, c2;
    private Activity a;
    public Castle winner;

    public BattleWorker(Activity ac ,Castle c1, Castle c2){
        this.a = ac;
        this.c1 = c1;
        this.c2 = c2;
        this.winner = null;
    }

    @Override
    public void run() {

        winner = c1.battleTo(c2);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } Castle winner = c1.battleTo(c2);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (c1.equals(winner)) {
            Toast.makeText(a.getApplicationContext(), "winner is " + c1.CastleType, Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(a.getApplicationContext(), "winner is " + c2.CastleType, Toast.LENGTH_SHORT).show();
        }
    }

    public Castle getWinner(){
        return this.winner;
    }
}
