package br.com.douglas.teste;

import android.app.Activity;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

//Para usar trablahar com os fragments na activity a classe deve estender FragmentActivity
//ou a próprio AppCompactActivvity que já herda de FragmentActivity,
//a classe MinhaActivity herda de AppCompactActivity que consequentemente herda de FragmentActivity.

public class FragmentsActivity extends MinhaActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feagments);
        //FragmentManager fm = getSupportFragmentManager();
    }
}
