package com.example.compras3000;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity {
    CheckBox cbArroz, cbLeite, cbCarne, cbFeijão;
    Button btTotal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cbArroz = (CheckBox) findViewById(R.id.cb1);
        cbLeite = (CheckBox) findViewById(R.id.cb2);
        cbCarne = (CheckBox) findViewById(R.id.cb3);
        cbFeijão = (CheckBox) findViewById(R.id.cb4);
        btTotal = (Button) findViewById(R.id.bt1);

        btTotal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double total = 0;

                if (cbArroz.isChecked()) {
                    total += 2.69;
                }
                if (cbLeite.isChecked()) {
                    total += 5;
                }
                if (cbCarne.isChecked()) {
                    total += 9.7;
                }
                if (cbFeijão.isChecked()) {
                    total += 2.3;
                }

                AlertDialog.Builder dialogo = new AlertDialog.Builder(MainActivity.this);
                dialogo.setTitle("Aviso");
                dialogo.setMessage("Valor total da compra" + total);
                dialogo.setNeutralButton("ok", null);
                dialogo.show();
            }
        });
    }
}