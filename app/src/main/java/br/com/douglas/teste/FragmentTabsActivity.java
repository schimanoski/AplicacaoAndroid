package br.com.douglas.teste;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import br.com.douglas.teste.fragments.FirstFragment;
import br.com.douglas.teste.fragments.Fragment2;
import br.com.douglas.teste.fragments.Fragment3;

public class FragmentTabsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragments2);
        ActionBar bar = getSupportActionBar();
        bar.setNavigationMode(android.app.ActionBar.NAVIGATION_MODE_TABS);

        ActionBar.Tab tab1 = bar.newTab().setText("Frag 1");
        tab1.setTabListener(new MyTabListener(this, new FirstFragment()));
        bar.addTab(tab1);

        ActionBar.Tab tab2 = bar.newTab().setText("Frag 2");
        tab2.setTabListener(new MyTabListener(this, new Fragment2()));
        bar.addTab(tab2);

        ActionBar.Tab tab3 = bar.newTab().setText("Frag 3");
        tab3.setTabListener(new MyTabListener(this, new Fragment3()));
        bar.addTab(tab3);

    }

    public class MyTabListener implements ActionBar.TabListener {
        Fragment f;
        Context ctx;
        public MyTabListener(Context ctx, Fragment f){
            this.f = f;
            this.ctx = ctx;
        }

        @Override
        public void onTabSelected(ActionBar.Tab tab, FragmentTransaction ft) {
            ft.replace(R.id.idFrament2, this.f, "fragmento 1");
        }

        @Override
        public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction ft) {

        }

        @Override
        public void onTabReselected(ActionBar.Tab tab, FragmentTransaction ft) {

        }
    }

    public Context getContext(){
        return  this;
    }

}
