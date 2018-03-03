package com.example.administrador.eva1_4_fragmentos;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;


public class FragmentoUno extends Fragment {
    Principal ppPrincipal;


    public FragmentoUno() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
            ppPrincipal=(Principal)getActivity();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View vwLayout = inflater.inflate(R.layout.fragment_fragmento_uno, container,false);
        Button btnMostrar = (Button)vwLayout.findViewById(R.id.btnMostrar);
        btnMostrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ppPrincipal.onMsgFromFragment("UNO", "HHUYIUIUIUI");
            }
        });

         return vwLayout;
    }


    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}

