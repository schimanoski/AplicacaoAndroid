package br.com.douglas.teste.fragments;


import android.os.Bundle;
import android.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import br.com.douglas.teste.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FirstFragment extends android.support.v4.app.Fragment {


    public FirstFragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        return inflater.inflate(R.layout.fragment_first, container, false);
    }

}
