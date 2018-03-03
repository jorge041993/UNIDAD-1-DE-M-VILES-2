package com.example.george.eva1_2_fragmentos;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;


public class BlueFragment extends Fragment {

    Principal principal;
    Context context;

    String[] items = {"carro","perro","gato","silla","mesa","espejo","buro","estante","estufa","cuadro","triangulo"};

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        context = getActivity();
        principal = (Principal) getActivity();

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        LinearLayout llAzul = (LinearLayout) inflater.inflate(R.layout.fragment_blue, container, false);

        ListView listView = (ListView)  llAzul.findViewById(R.id.lstVwBlue);


        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(context,
                android.R.layout.simple_list_item_1, items);

        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long l) {

                principal.onMsgFromToMain("BLUE_FRAG",items[i]);
            }
        });
        return llAzul;
    }



}