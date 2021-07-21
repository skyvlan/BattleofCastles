package com.uasmoop.battleofcastle;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.uasmoop.battleofcastle.castlebase.UnitClass;
import com.uasmoop.battleofcastle.castlebase.Infantry;

import org.w3c.dom.Text;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView Wtext1 = findViewById(R.id.P1WinnerText);
        TextView Wtext2 = findViewById(R.id.P2WinnerText);
        Button Button1 = findViewById(R.id.fightButton1);
        Button Button2 = findViewById(R.id.fightButton2);
        Wtext1.setText("");
        Wtext2.setText("");

        BattleManager Battle1 = new BattleManager(UnitClass.CAVALRY, UnitClass.INFANTRY);
        BattleManager Battle2 = new BattleManager(UnitClass.INFANTRY, UnitClass.MIXCAV);
        Button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int winner = Battle1.fight();
                if(winner == 1){
                    int Kill = Battle1.getC1KillCount();
                    int Casualties = Battle1.getC1Casualties();
                    int LKill = Battle1.getC2KillCount();
                    int LCasualities = Battle1.getC2Casualties();
                    Wtext1.setText("Cavalry\nWinner.\nKills: "+ Kill + "\nRemaining: "+Casualties);
                    Wtext2.setText("Infantry\nLoser.\nKills: "+ LKill + "\nRemaining: "+LCasualities);
                }
                else if(winner == 2){
                    int Kill = Battle1.getC2KillCount();
                    int Casualties = Battle1.getC2Casualties();
                    int LKill = Battle1.getC2KillCount();
                    int LCasualities = Battle1.getC2Casualties();
                    Wtext2.setText("Cavalry\nWinner.\nKills: "+ Kill + "\nRemaining: "+Casualties);
                    Wtext1.setText("Infantry\nLoser.\nKills: "+ LKill + "\nRemaining: "+LCasualities);
                }
            }
        });
        Button2.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                int winner = Battle2.fight();
                if(winner == 1){
                    int Kill = Battle2.getC1KillCount();
                    int Casualties = Battle2.getC1Casualties();
                    int LKill = Battle2.getC2KillCount();
                    int LCasualities = Battle2.getC2Casualties();
                    Wtext1.setText("Winner.\nKills: "+ Kill + "\nRemaining: "+Casualties);
                    Wtext2.setText("Loser.\nKills: "+ LKill + "\nRemaining: "+LCasualities);
                }
                else if(winner == 2){
                    int Kill = Battle2.getC2KillCount();
                    int Casualties = Battle2.getC2Casualties();
                    int LKill = Battle2.getC1KillCount();
                    int LCasualities = Battle2.getC1Casualties();
                    Wtext2.setText("Infantry\nWinner.\nKills: "+ Kill + "\nRemaining: "+Casualties);
                    Wtext1.setText("Ranged + Cavalry\nLoser.\nKills: "+ LKill + "\nRemaining: "+LCasualities);
                }
            }

        });
    }
}