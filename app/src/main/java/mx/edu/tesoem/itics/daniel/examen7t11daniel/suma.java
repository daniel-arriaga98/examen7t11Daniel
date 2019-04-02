package mx.edu.tesoem.itics.daniel.examen7t11daniel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class suma extends AppCompatActivity {

    EditText num1, num2;
    TextView res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suma);

        num1 = (EditText) findViewById(R.id.editText3);
        num2 = (EditText) findViewById(R.id.editText4);
        res = (TextView) findViewById(R.id.textView4);
    }


        public void calculasuma (View v){
            int a, b, c;
            a=Integer.parseInt(num1.getText().toString());
            b=Integer.parseInt(num2.getText().toString());
            c=a+b;
            res.setText(String.valueOf(c));



    }

}
