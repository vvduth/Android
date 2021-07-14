package org.mycode.uibasic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView txtHello ;
    private EditText edtTxtName ;
    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.btnHello:
                    //System.out.println("Hello beo.");

                //Toast.makeText(this, "SecondTexe")
                Toast.makeText(this,"Hello button clicked",Toast.LENGTH_SHORT).show();
                txtHello.setText("Hello " + edtTxtName.getText().toString());
                    //Toast mess is a pop up and will disappear in a while
                    break;
            case R.id.edtTxtName:
                Toast.makeText(this, "Attemping to type something",Toast.LENGTH_SHORT).show();
            default:
                    break;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnHello = findViewById(R.id.btnHello);
        btnHello.setOnClickListener(this);

         edtTxtName = findViewById(R.id.edtTxtName);
         edtTxtName.setOnClickListener(this);
         txtHello = findViewById(R.id.txtHello);

      /*  btnHello.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Toast.makeText(MainActivity.this, "dwdwdq", Toast.LENGTH_LONG).show();
                return true;
            }
        });*/
    }



}