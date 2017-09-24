package br.com.douglas.teste;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class ListViewAdapterActivity extends MinhaActivity {
    final String[] nomes = {"douglas", "felipe", "Schimanoski", "junior", "rafael", "schimanoski", "cledir", "elidia", "schimanoski", "celso", "antonio", "schimanoski"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_adapter);

        MeuAdapter arrayAdapter = new MeuAdapter();

        ListView listView = (ListView) findViewById(R.id.listViewAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText( getApplicationContext(), "Estado selecionado: " + nomes[ i ], Toast.LENGTH_SHORT ).show();
            }
        });
        listView.setAdapter(arrayAdapter);
    }

    class MeuAdapter extends ArrayAdapter{
        public MeuAdapter() {
            super(ListViewAdapterActivity.this, R.layout.text_view, nomes);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View result = convertView;
            LayoutInflater inflater = (LayoutInflater) getSystemService( LAYOUT_INFLATER_SERVICE );
            //jeito 1//View view = inflater.inflate(R.layout.text_view, parent, false);
            result = inflater.inflate(R.layout.text_view, null);

            TextView t = (TextView) result.findViewById(R.id.linha_texto);
            t.setText(nomes[position].toString());
            return result;
        }
    }



}
