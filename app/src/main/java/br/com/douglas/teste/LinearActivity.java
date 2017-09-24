package br.com.douglas.teste;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.TextView;

public class LinearActivity extends MinhaActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_linear);

        LinearLayout layout = (LinearLayout) findViewById(R.id.layout1);
        for (int i = 2; i < 100; i++) {
            LayoutInflater inflater = LayoutInflater.from(this);
            TextView text = (TextView) inflater.inflate(R.layout.text_view, layout, false);
            text.setText("texto: " + i);
            layout.addView(text);
        }
    }
}
