package com.example.dd.fragmentexample;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class pastoFragment extends Fragment {

    View view;
    ImageView imagepasto;
    TextView pastotext;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
// Inflate the layout for this fragment
        view = inflater.inflate(R.layout.pasto, container, false);
// get the reference of Button
        imagepasto = (ImageView) view.findViewById(R.id.imagepasto);
        pastotext=(TextView) view.findViewById(R.id.pastotext);

// perform setOnClickListener on second Button
        imagepasto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
// display a message by using a Toast
                Toast.makeText(getActivity(), "breead", Toast.LENGTH_LONG).show();
            }
        });
        return view;
    }
}