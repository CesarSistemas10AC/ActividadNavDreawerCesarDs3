package com.example.actividadnavdreawercesar;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link nav_otroapk#newInstance} factory method to
 * create an instance of this fragment.
 */
public class nav_otroapk extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public nav_otroapk() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment nav_otroapk.
     */
    // TODO: Rename and change types and number of parameters
    public static nav_otroapk newInstance(String param1, String param2) {
        nav_otroapk fragment = new nav_otroapk();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    ImageButton calcu,playstore,youtube,mensajes;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View view =  inflater.inflate(R.layout.fragment_nav_otroapk, container, false);

        calcu = view.findViewById(R.id.imagebtn1);
        playstore = view.findViewById(R.id.imagebtn2);
        youtube = view.findViewById(R.id.imagebtn3);
        mensajes = view.findViewById(R.id.imagebtn4);


        return view;
    }



}