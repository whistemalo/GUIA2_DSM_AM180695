package sv.edu.udb.componentesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.CloseGuard;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class segundaActividad extends AppCompatActivity {
    private TextView tvNombre;
    private TextView tvEdad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_actividad);

        tvNombre = (TextView) findViewById(R.id.textViewNombre);
        tvEdad = (TextView) findViewById(R.id.textViewEdad);
        Bundle bundle = getIntent().getExtras();
        String sombre = bundle.getString("txtNombre");
        String dad = bundle.getString("txtEdad");
//        System.out.print(dad);
         tvNombre.setText(sombre);
         tvEdad.setText(dad);
    }

    public  void finalizar(View v){
        finish();
    }


}