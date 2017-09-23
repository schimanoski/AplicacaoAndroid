package br.com.douglas.teste;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class ViewPagerActivity extends Activity {

    int[] imagens = {R.mipmap.ic_launcher};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager);
        ViewPager vp = (ViewPager) findViewById(R.id.pager);
        vp.setAdapter(new ViewPagerAdapter(imagens));
    }


    class ViewPagerAdapter extends PagerAdapter {
        int[] img;
        public ViewPagerAdapter(int[] imagens) {
            img = imagens;
        }
        @Override
        public int getCount() {
            return 0;
        }

        @Override
        public Object instantiateItem(ViewGroup container, int position) {
            View view = LayoutInflater.from(ViewPagerActivity.this).inflate(R.layout.image_view, container, false);
            ImageView imagem = (ImageView) view.findViewById(R.id.imgView);
            imagem.setImageResource(img[position]);
            ((ViewGroup)container).addView(view);
            return view;
        }

        @Override
        public boolean isViewFromObject(View view, Object object) {
            return view == object;
        }


    }
}
