package br.com.douglas.teste;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v4.app.*;

import br.com.douglas.teste.R;
import br.com.douglas.teste.fragments.FirstFragment;

public class Fragments2Activity extends MinhaActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragments2);
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        Fragment f = new FirstFragment();
        ft.add(R.id.idFrament2, f, "Fragment");
        ft.commit();
    }
}
