package com.example.mytour;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class LocationFragment extends Fragment {
    private TextView textView;

    public LocationFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_location, container, false);
        textView = view.findViewById(R.id.loc);
        textView.setText("Bunutan, Abang, Seraya Bar., Kec. Karangasem, Kabupaten Karangasem, Bali 80852");

        return view;
    }
}