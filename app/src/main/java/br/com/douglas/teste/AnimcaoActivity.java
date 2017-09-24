package br.com.douglas.teste;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class AnimcaoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animcao);

        ImageView im = (ImageView)findViewById(R.id.imageViewAnimacao);
        Animatable anim = (AnimationDrawable)im.getDrawable();
        anim.start();

    }
}
