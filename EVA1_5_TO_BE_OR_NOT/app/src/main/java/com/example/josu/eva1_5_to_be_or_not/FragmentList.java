package com.example.josu.eva1_5_to_be_or_not;


import android.content.Context;
import android.os.Bundle;
import android.app.Fragment;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentList extends Fragment {
    View view;
    Main main;
    Context context;


    public FragmentList() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        main = (Main) getActivity();
        context = getActivity();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_fragment_list, container, false);
        ListView lstVwTitles = view.findViewById(R.id.lstVwTitles);
        ArrayAdapter<String> adapter = new ArrayAdapter(main,
                android.R.layout.simple_list_item_1,
                Shakespeare.TITLES
                );
        lstVwTitles.setAdapter(adapter);
        lstVwTitles.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                main.onMsgFromFragToMain("TITLE", i);
            }
        });


        return view;
    }

}
