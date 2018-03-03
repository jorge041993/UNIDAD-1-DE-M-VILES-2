package com.example.administrador.eva1_3_fragmentos;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Principal extends AppCompatActivity {

    FragmentManager fmManager;
    FragmentTransaction fttrans;

    AzulFragment afAzul;
    RojoFragment rjfragment;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        fmManager = getSupportFragmentManager();

    }

    public void onclickazul(View v){
        fttrans = fmManager.beginTransaction();
        //cREAMOS EL FRAGMENTO
        afAzul = new AzulFragment();
        fttrans.replace(R.id.layout_bye, afAzul);
        fttrans.commit();
    }

    public void onCkickrojo(View v){
        fttrans = fmManager.beginTransaction();
        //cREAMOS EL FRAGMENTO
        rjfragment = new RojoFragment();
        fttrans.replace(R.id.layout_bye, rjfragment);
        fttrans.commit();
    }
}
