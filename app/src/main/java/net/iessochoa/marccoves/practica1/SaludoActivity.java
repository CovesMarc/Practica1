package net.iessochoa.marccoves.practica1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SaludoActivity extends AppCompatActivity {
    private TextView tvSaludo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saludo);
        tvSaludo=findViewById(R.id.tvSaludo);

        Bundle b=this.getIntent().getExtras();

        tvSaludo.setText(b.getString("SALUDOFINAL"));

    }
}
