package mx.edu.tesoem.itics.daniel.examen7t11daniel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {

    Button saludarbtn;
    EditText txnombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        saludarbtn = (Button) findViewById(R.id.button);
        saludarbtn.setOnClickListener(this);



        txnombre = (EditText) findViewById(R.id.editText2);

    }

    @Override
    public void onClick(View view) {
        Toast.makeText(this, "bienvenido", Toast.LENGTH_LONG).show();
        saludarbtn.setEnabled(true);}



    public void nomb(View v) {
        Intent intent = new Intent(this,saludar.class);
        intent.putExtra("nombre",txnombre.getText().toString());
        startActivity(intent)
        ;}

        public void operaciones (View v){
            Intent intent = new Intent(this,operaciones.class);
            startActivity(intent);
        }
}
