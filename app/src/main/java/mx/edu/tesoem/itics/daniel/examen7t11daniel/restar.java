package mx.edu.tesoem.itics.daniel.examen7t11daniel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class restar extends AppCompatActivity {

    EditText num1, num2;
    TextView res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restar);

        num1 = (EditText) findViewById(R.id.editText5);
        num2 = (EditText) findViewById(R.id.editText6);
        res = (TextView) findViewById(R.id.textView6);
    }

    public void calcularesta(View v) {
        int a, b, c;
        a = Integer.parseInt(num1.getText().toString());
        b = Integer.parseInt(num2.getText().toString());
        c = a - b;
        res.setText(String.valueOf(c));
    }

}