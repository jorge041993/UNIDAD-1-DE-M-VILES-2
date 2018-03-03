package com.example.george.eva1_2_fragmentos;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Date;


public class RedFragment extends Fragment {
    Context context;
    TextView txtVwRojo;
    Principal principal1;

    public RedFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        context = getActivity();
        principal1 = (Principal) getActivity();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, final ViewGroup container,
                             Bundle savedInstanceState) {
        LinearLayout redLayout = (LinearLayout) inflater.inflate(R.layout.fragment_red, container, false);
        Button btnSomeAction = redLayout.findViewById(R.id.btnAction);
        txtVwRojo = (TextView) redLayout.findViewById(R.id.txtVwRed);

        btnSomeAction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "Accion", Toast.LENGTH_SHORT).show();
                String sMensage = new Date().toString();
                txtVwRojo.setText(sMensage);
                principal1.onMsgFromToMain("RED_FRAG", sMensage);
            }
        });

        // Inflate the layout for this fragment
        return redLayout;
    }
    public void onMsgFromMain (String sVal){
        txtVwRojo.setText(sVal);
    }
}
