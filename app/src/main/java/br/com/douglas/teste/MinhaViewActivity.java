package br.com.douglas.teste;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MinhaViewActivity extends MinhaActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_minha_view);
    }
}
