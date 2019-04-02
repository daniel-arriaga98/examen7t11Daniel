package mx.edu.tesoem.itics.daniel.examen7t11daniel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class potencia extends AppCompatActivity {

    EditText num1;
    TextView res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_potencia);

        num1 = (EditText) findViewById(R.id.editText7);
        res = (TextView) findViewById(R.id.textView7);
    }

    public void calculapotencia (View v){
        int a, c;
        a=Integer.parseInt(num1.getText().toString());
        c=a*a;
        res.setText(String.valueOf(c));
}}
