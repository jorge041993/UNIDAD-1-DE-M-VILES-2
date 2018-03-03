package com.example.administrador.eva1_4_fragmentos;

import android.content.Intent;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Principal extends AppCompatActivity {
     boolean bPanel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
    }
    public void onMsgFromFragment (String sender, String msg){
        if(sender.equals("UNO")){//fragmento 1 genera la llamada
            //Verificando si el panel cambio existe y es visible
            //modo landscape
            //si es falso, estamos en modo lanscape
            View vwCambio = findViewById(R.id.fragmento_cambio);
            bPanel = vwCambio != null && vwCambio.getVisibility() == View.VISIBLE;
            if(bPanel){//modo lanscappe

                FragmentoDos dffragDos = (FragmentoDos)getSupportFragmentManager().findFragmentById(R.id.fragmento_cambio);
                if(dffragDos == null){
                    dffragDos = new FragmentoDos();
                    FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                    ft.replace(R.id.fragmento_cambio,dffragDos);
                    ft.commit();

                }

            }else{//modo portait
                Intent inDetalle = new Intent(this,DetalleActivity.class);
                startActivity(inDetalle);
            }
        }
    }
}
