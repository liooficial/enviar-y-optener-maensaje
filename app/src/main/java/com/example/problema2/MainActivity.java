package com.example.problema2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button mensaje;
    EditText etmensaje;
    TextView tvmensaje;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etmensaje=(EditText) findViewById(R.id.et_mensaje);
        tvmensaje=(TextView) findViewById(R.id.tv_mensaje);
        mensaje=(Button) findViewById(R.id.btn_menaje);

        mensaje.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvmensaje.setText(etmensaje.getText().toString());
            }
        });
    }
}