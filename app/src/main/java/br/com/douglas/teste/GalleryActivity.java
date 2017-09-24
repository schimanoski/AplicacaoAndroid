package br.com.douglas.teste;

import android.content.Context;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;

public class GalleryActivity extends MinhaActivity {

    int[] img = {R.mipmap.ic_launcher, R.mipmap.ic_launcher2, R.mipmap.ic_launcher_round};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);

        Gallery gallery = (Gallery)findViewById(R.id.widgetGallery);
        ImageAdpter ia = new ImageAdpter(GalleryActivity.this, img);
        gallery.setAdapter(ia);

    }

    class ImageAdpter extends BaseAdapter{
        Context ctx;
        int[] imagens;
        public ImageAdpter(Context ctx, int[] imagens){
            this.ctx = ctx;
            this.imagens = imagens;
        }
        @Override
        public int getCount() {
            return this.imagens.length;
        }

        @Override
        public Object getItem(int i) {
            return i;
        }

        @Override
        public long getItemId(int i) {
            return i;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            View v = LayoutInflater.from(this.ctx).inflate(R.layout.image_view, viewGroup, false);
            ImageView img = (ImageView)v.findViewById(R.id.imgView);
            img.setImageResource(imagens[i]);
            return v;
        }
    }
}
