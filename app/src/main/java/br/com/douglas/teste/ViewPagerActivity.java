package br.com.douglas.teste;

import android.app.Activity;
import android.content.Context;
import android.content.pm.ChangedPackages;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;

public class ViewPagerActivity extends MinhaActivity {
    List<List<Object>> list;
    int[] imagens = {R.mipmap.ic_launcher, R.mipmap.ic_launcher2, R.mipmap.ic_launcher_round};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager);
        carregaMap();
        ViewPager vp = (ViewPager) findViewById(R.id.pager);
        vp.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                Toast.makeText(ViewPagerActivity.this, "Imagem: " + position, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
        vp.setAdapter(new MyPagerAdapter(ViewPagerActivity.this, list));
    }
    private class MyPagerAdapter extends PagerAdapter {
        List img;
        Context ctx;
        public MyPagerAdapter(Context ctx, List imagens) {
            this.ctx= ctx;
            img = imagens;
        }
        @Override
        public CharSequence getPageTitle(int position) {
            return (CharSequence)list.get(position).get(1);
        }

        @Override
        public int getCount() {
            return imagens != null ? imagens.length : 0;
        }
        @Override
        public Object instantiateItem(ViewGroup container, int position) {
            View view = LayoutInflater.from(MyPagerAdapter.this.ctx).inflate(R.layout.image_view, container, false);
            ImageView imagem = (ImageView) view.findViewById(R.id.imgView);
            imagem.setImageResource((Integer)list.get(position).get(0));
            ((ViewGroup)container).addView(view);
            return view;
        }
        @Override
        public boolean isViewFromObject(View view, Object object) {
            return view == object;
        }
        @Override
        public void destroyItem(View container, int position, Object object) {
            ((ViewPager) container).removeView((View) object);
        }
    }

    protected void carregaMap(){
        list = new ArrayList<>();
        List l = new ArrayList();

        l.add(imagens[0]);
        l.add("Android - cabeça verde");
        list.add(l);

        l = new ArrayList();
        l.add(imagens[1]);
        l.add("Android - preto");
        list.add(l);

        l = new ArrayList();
        l.add(imagens[2]);
        l.add("Android - verde");
        list.add(l);
    }
}
