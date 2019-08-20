package com.tcc.rogerio.projetofinal;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class EventoActivity extends Activity {
    private String aux;
    private TextView nome, nivel, data, hora, qtdade;
    private Button localizacao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_evento);

        Bundle extra = getIntent().getExtras();
        nome = (TextView) findViewById(R.id.tx_descricao_id);
        nivel = (TextView) findViewById(R.id.tx_nivel_id);
        data = (TextView) findViewById(R.id.tx_data_id);
        hora = (TextView) findViewById(R.id.tx_hora_id);
        qtdade = (TextView) findViewById(R.id.tx_qt_pessoas_id);
        Eventos recuperado;
        if(extra != null){
            recuperado = (Eventos) extra.getSerializable("evento");
            nome.setText(recuperado.getNome_evento());
            nivel.setText(recuperado.getNivel_evento());
            data.setText(recuperado.getData_evento());
            hora.setText(recuperado.getHorario_evento());
            qtdade.setText(Integer.toString(recuperado.getQtd_pessoas()));
        }

        localizacao = (Button) findViewById(R.id.bt_localizacao_id);

        localizacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"toa aqui", Toast.LENGTH_LONG).show();
                startActivity(new Intent(EventoActivity.this, MapasActivity.class));
            }
        });


        //Toast.makeText(getApplicationContext(),posicaodoevento, Toast.LENGTH_LONG).show();
    }
}
