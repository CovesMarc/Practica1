package net.iessochoa.marccoves.practica1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class HoraActivity extends AppCompatActivity {
    private TextView tvSaludoHora;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hora);
        //Localizamos
        tvSaludoHora=findViewById(R.id.tvSaludoHora);

        //Recuperamos la información pasada en el intent.
        Bundle b=this.getIntent().getExtras();

        //Construimos el mensaje a mostrar:
        tvSaludoHora.setText(b.getString("MENSAJEFINAL"));


    }
}
