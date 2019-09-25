package net.iessochoa.marccoves.practica1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class MainActivity extends AppCompatActivity {

    private EditText txtNombre;
    private Button btnAceptar;
    private Button btnDimeHora;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNombre=findViewById(R.id.txtNombre);
        btnAceptar=findViewById(R.id.btnAceptar);
        btnDimeHora=findViewById(R.id.btnDimeHora);

        //Para obtener la hora.
        Calendar calendario=new GregorianCalendar();
        final int minuto, hora, segundo;
        minuto=calendario.get(Calendar.MINUTE);
        hora=calendario.get(Calendar.HOUR_OF_DAY);
        segundo=calendario.get(Calendar.SECOND);
        final String horaTotal;
        horaTotal = String.format(getString(R.string.HoraFormateada),hora, minuto, segundo);

        btnDimeHora.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Creamos el intent.
                Intent intent=new Intent(MainActivity.this, HoraActivity.class);
                //Creamos la información a pasar entre actividades.
                Bundle b=new Bundle();
                b.putString("HORAFINAL",getResources().getString(R.string.IntroHora)+horaTotal);
                intent.putExtras(b);

                startActivity(intent);
            }
        });
        btnAceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, SaludoActivity.class);
                Bundle b=new Bundle();
                b.putString("SALUDOFINAL",getResources().getString(R.string.IntroSaludoSimple)+txtNombre.getText().toString());
                intent.putExtras(b);

                startActivity(intent);
            }
        });
    }

}
