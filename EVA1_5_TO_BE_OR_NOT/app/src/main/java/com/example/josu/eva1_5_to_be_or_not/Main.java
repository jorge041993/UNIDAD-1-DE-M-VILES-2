package com.example.josu.eva1_5_to_be_or_not;

import android.content.Intent;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class Main extends AppCompatActivity {
boolean bDual;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        View vDetail = findViewById(R.id.frameDetail);
    
        /*  verificamos en onCreate si la vista está en modo landscape,
            y si lo está añadimos el fragmento evitando que esté sea nulo
        */
        bDual = vDetail != null && vDetail.getVisibility() == View.VISIBLE;
        if(bDual){//Landscape
            FragmentDetail fragmentDetail = (FragmentDetail)getSupportFragmentManager().findFragmentById(R.id.frameDetail);
            if(fragmentDetail == null) {
                fragmentDetail = new FragmentDetail();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.add(R.id.frameDetail,fragmentDetail);
                transaction.commit();
            }

        }

    }

    public void onMsgFromFragToMain(String sender, int Msg){
        if(sender.equals("TITLE")){//Fragment List
            View vDetail = findViewById(R.id.frameDetail);
            bDual = vDetail != null && vDetail.getVisibility() == View.VISIBLE;
            if(bDual){//Landscape
                FragmentDetail fragmentDetail = (FragmentDetail)getSupportFragmentManager().findFragmentById(R.id.frameDetail);
                if(fragmentDetail == null) {
                    fragmentDetail = new FragmentDetail();
                    FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                    transaction.add(R.id.frameDetail,fragmentDetail);
                    transaction.commit();
                }
                fragmentDetail.onMsgFromMain(Msg);

            }else{//Portrait
                Intent intent = new Intent(this, DetailActivity.class);
                Bundle bundle = new Bundle();
                bundle.putInt("INDEX", Msg);
                intent.putExtras(bundle);
                startActivity(intent);

            }

        }else{//Fragment With Detail

        }
    }
}
