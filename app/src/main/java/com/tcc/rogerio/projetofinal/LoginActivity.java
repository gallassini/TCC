package com.tcc.rogerio.projetofinal;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends Activity {

    private TextView pv_texto_erro;
    private EditText pv_usuario;
    private EditText pv_senha;
    private Button pv_entrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        pv_texto_erro = (TextView) findViewById(R.id.txv_erro_login_id);
        pv_usuario = (EditText) findViewById(R.id.Usuario_login_id);
        pv_senha = (EditText) findViewById(R.id.Senha_login_id);
        pv_entrar = (Button) findViewById(R.id.bt_lg_entrar_id);

        pv_entrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String nome = "rogerio";
                String senhausuario = "1";
                String usuariodigitado;
                String senhadigitada;

                usuariodigitado = pv_usuario.getText().toString();
                senhadigitada = pv_senha.getText().toString();


                if (nome.equals(usuariodigitado)& senhausuario.equals(senhadigitada) ){
                    startActivity(new Intent(LoginActivity.this, MainActivity.class));
                }
                else{
                    pv_texto_erro.setText("Informações incorretas, tente novamente!" );
                }

            }
        });

    }
}
