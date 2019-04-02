package mx.edu.tesoem.itics.daniel.examen7t11daniel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class operaciones extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_operaciones);
    }

    public void llama(View v) {
        Intent intent = new Intent(this, suma.class);
        startActivity(intent);
    }

    public void llamo(View v) {
        Intent intent = new Intent(this, restar.class);
        startActivity(intent);
    }


    public void llame(View v) {
        Intent intent = new Intent(this, potencia.class);
        startActivity(intent);
    }


    public void llami(View v) {
        System.exit(0);
    }


}