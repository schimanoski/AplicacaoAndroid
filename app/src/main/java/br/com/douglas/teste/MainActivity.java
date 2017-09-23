package br.com.douglas.teste;

import android.Manifest;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.Layout;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity {
    AlertDialog dialog;
    @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AlertDialog.Builder b = new AlertDialog.Builder(MainActivity.this);
        b.setIcon(R.mipmap.ic_launcher);
        b.setTitle("Olá, deseja continuar?");
        b.setMessage("minha menssagem");
        b.setPositiveButton("Nao", new DialogInterface.OnClickListener(){
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Intent it = new Intent(MainActivity.this, LinearActivity.class);
                startActivity(it);
                return;
            }
        });
        b.setNegativeButton("Sim", new DialogInterface.OnClickListener(){
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Intent it = new Intent(MainActivity.this, LinearActivity.class);
                startActivity(it);
                return;
            }
        });
        dialog = b.create();

        View.OnClickListener on = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(MainActivity.this, ScrollViewActivity.class);
                startActivity(it);
            }
        };


        Button bt = (Button)findViewById(R.id.button4);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.show();
            }
        });

        Button btAdapter = (Button)findViewById(R.id.listAdapter);
        btAdapter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, ListViewAdapterActivity.class));
            }
        });

        Button btScroll = (Button)findViewById(R.id.buttonScroll);
        btScroll.setOnClickListener(on);

        Button btViewPager = (Button) findViewById(R.id.btViewPager);
        btViewPager.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(MainActivity.this, ViewPagerActivity.class);
                startActivity(it);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
}
