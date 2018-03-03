package com.example.administrador.eva1_4_fragmentos;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class FragmentoDos extends Fragment {




    public FragmentoDos() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        // lo cambie a true
        return inflater.inflate(R.layout.fragment_fragmento_dos, container, false);
    }


}
