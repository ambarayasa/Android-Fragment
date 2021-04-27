package com.example.mytour;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class DescriptionFragment extends Fragment {
    private TextView textView;

    public DescriptionFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_description, container, false);
        textView = view.findViewById(R.id.desc);
        textView.setText("Pura Penataran Agung Lempuyang adalah sebuah pura yang terletak di lereng Gunung Lempuyang di Karangasem. Pura Penataran Agung Lempuyang dianggap sebagai bagian dari kompleks pura di sekitar Gunung Lempuyang, salah satu pura yang sangat dihormati di Bali.");

        return view;
    }
}