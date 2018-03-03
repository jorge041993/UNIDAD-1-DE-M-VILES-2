package com.example.josu.eva1_5_to_be_or_not;


import android.os.Bundle;
import android.app.Fragment;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentDetail extends android.support.v4.app.Fragment {
    View view;
    TextView txtVwDetail;


    public FragmentDetail() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_fragment_detail, container, false);
       txtVwDetail = view.findViewById(R.id.txtVwDetail);
        return view;
    }

    public void onMsgFromMain(int index){
        //Evaluamos si la vista es nula evitando un NullPointeException
            if(view != null){
                txtVwDetail.setText(Shakespeare.DIALOGUE[index]);
            }
    }

}
