package br.com.douglas.teste;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ScrollViewActivity extends MinhaActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scroll_view);
        LinearLayout layout = (LinearLayout) findViewById(R.id.linearScroll);
        for(int i = 0; i<200;i++) {
            LayoutInflater inflater = LayoutInflater.from(this);
            TextView text = (TextView) inflater.inflate(R.layout.text_view, layout, false);
            text.setText("douglas felipe schianoski");
            layout.addView(text);
        }
    }
}
