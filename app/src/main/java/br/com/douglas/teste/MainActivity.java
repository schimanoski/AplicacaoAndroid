package br.com.douglas.teste;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Fragment;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
    AlertDialog dialog;
    @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AlertDialog.Builder b = new AlertDialog.Builder(getContext());
        b.setIcon(R.mipmap.ic_launcher);
        b.setTitle("MeuDialog");
        b.setMessage("Abrir lista?");
        b.setPositiveButton("Nao", new DialogInterface.OnClickListener(){
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                //Intent it = new Intent(MainActivity.this, LinearActivity.class);
                //startActivity(it);
                //return;
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

        Button bt = (Button)findViewById(R.id.btDaialog);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.show();
            }
        });

        Button btScroll = (Button)findViewById(R.id.btScroll);
        btScroll.setOnClickListener(getOnClickListener(getContext(), ScrollViewActivity.class));

        Button btViewPager = (Button) findViewById(R.id.btViewPager);
        btViewPager.setOnClickListener(getOnClickListener(getContext(), ViewPagerActivity.class));

        Button btAdapter = (Button)findViewById(R.id.btListAdapter);
        btAdapter.setOnClickListener(getOnClickListener(getContext(), ListViewAdapterActivity.class));

        Button btGallery = (Button)findViewById(R.id.btGallery);
        btGallery.setOnClickListener(getOnClickListener(getContext(), GalleryActivity.class));

        Button btImageSwitcher = (Button)findViewById(R.id.btImageSwitcher);
        btImageSwitcher.setOnClickListener(getOnClickListener(getContext(), ImageSwitcherActivity.class));

        Button btWebView = (Button)findViewById(R.id.btWebView);
        btWebView.setOnClickListener(getOnClickListener(getContext(), WebViewActivity.class));

        Button btMinhaView = (Button)findViewById(R.id.btMinhaView);
        btMinhaView.setOnClickListener(getOnClickListener(getContext(), MinhaViewActivity.class));

        Button btFragment1 = (Button)findViewById(R.id.btFragment1);
        btFragment1.setOnClickListener(getOnClickListener(getContext(), FragmentsActivity.class));

        Button btFragment2 = (Button)findViewById(R.id.btFragment2);
        btFragment2.setOnClickListener(getOnClickListener(getContext(), Fragments2Activity.class));

        Button btFragmentTab = (Button)findViewById(R.id.btFragmentTab);
        btFragmentTab.setOnClickListener(getOnClickListener(getContext(), FragmentTabsActivity.class));

        Button btAnimacaoDrawable = (Button)findViewById(R.id.btAnimacao);
        btAnimacaoDrawable.setOnClickListener(getOnClickListener(getContext(), AnimcaoActivity.class));
    }
    public View.OnClickListener getOnClickListener(final Context ctx, final Class<?> c){
        View.OnClickListener on = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(ctx, c);
                startActivity(it);
            }
        };
        return on;
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    public Context getContext(){
        return MainActivity.this;
    }
}
