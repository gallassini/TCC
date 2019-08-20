package com.tcc.rogerio.projetofinal;

import android.app.Activity;
import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.io.Serializable;

public class MainActivity extends Activity {
    private Eventos evento1, evento2, evento3, evento4, evento5;
    private ListView listadeeventos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        evento1 = new Eventos(1, "pedal santo antonio", "Brusque", "Santa Terezinha", "Rua luis alvez, 41", "Guabiruba", "lageado alto", "Mirante Santo antonio", "25/03/2019", "09:00", "medio", 1);
        evento2 = new Eventos(2, "pedal são jose", "Brusque", "Santa Terezinha", "Rua santus dumont", "Guabiruba", "planicie alta", "Mirante Sao jose", "28/03/2019", "15:00", "Alto", 5);
        evento3 = new Eventos(3, "brusque-navegates", "Brusque", "Steffen", "zem SA", "Navegantes", "Gravatá", "casa do amigo", "02/04/2019", "08:00", "baixo", 4);
        evento4 = new Eventos(4, "procissão madre paulina", "Blumenau", "itoupava", "rua 01","Nova trento", "vigolo", "santuario santa paulina", "02/04/2019", "12:00", "alto", 18);
        evento5 = new Eventos(5, "circuito beira rio", "Brusque", "Santa Terezinha", "Rua dorval luz", "brusque", "centro2", "apae", "22/03/2019", "18:00", "baixo", 2);

        final Eventos[] arraydeeventos = {evento1,evento2, evento3, evento4, evento5};

        listadeeventos = (ListView) findViewById(R.id.lista_eventos_id);

        ArrayAdapter<Eventos> adaptador = new ArrayAdapter<Eventos>(getApplicationContext(),android.R.layout.simple_list_item_1, android.R.id.text1, arraydeeventos);

        listadeeventos.setAdapter(adaptador);

        listadeeventos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int posicao = position;
               Eventos recuperado = arraydeeventos[posicao];
                Intent intent = new Intent(MainActivity.this, EventoActivity.class);
                intent.putExtra("evento", (Serializable) recuperado);
                startActivity(intent);
            }
        });
    }


}
