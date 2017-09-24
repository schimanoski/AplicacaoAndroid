package br.com.douglas.teste;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ImageSwitcher;
import android.widget.ImageView;

public class ImageSwitcherActivity extends MinhaActivity {
    int[] imagens = {R.mipmap.ic_launcher_round, R.mipmap.ic_launcher, R.mipmap.ic_launcher2};
    int id = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_switcher);
        final ImageSwitcher imageSwitcher = (ImageSwitcher)findViewById(R.id.widgetImageSwitcher);
        imageSwitcher.setFactory(new ImageSwitcher.ViewFactory(){
            @Override
            public View makeView() {
                ImageView img = new ImageView(getBaseContext());
                img.setScaleType(ImageView.ScaleType.FIT_CENTER);
                img.setLayoutParams(new ImageSwitcher.LayoutParams(ImageSwitcher.LayoutParams.MATCH_PARENT, ImageSwitcher.LayoutParams.MATCH_PARENT));
               // img.setImageResource(imagens[0]);
                return img;
            }
        });
        //imageSwitcher.setInAnimation(AnimationUtils.loadAnimation(this, android.R.anim.fade_out));

        imageSwitcher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(imagens.length == id)id=0;
                imageSwitcher.setImageResource(imagens[id++]);
                if(id%2 == 1){
                    imageSwitcher.setInAnimation(AnimationUtils.loadAnimation(ImageSwitcherActivity.this, android.R.anim.slide_in_left));
                }
                else{
                    imageSwitcher.setInAnimation(AnimationUtils.loadAnimation(ImageSwitcherActivity.this, android.R.anim.slide_out_right));
                }
            }
        });
    }
}
