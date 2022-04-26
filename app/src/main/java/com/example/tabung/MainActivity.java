package com.example.tabung;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{
    EditText txtjari, txttinggi;
    Button btnvolume;
    Button btnselimut;
    TextView txthasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtjari=findViewById(R.id.jari);
        txttinggi=findViewById(R.id.tinggi);
        btnvolume=findViewById(R.id.hitung2);
        btnselimut=findViewById(R.id.hitung);
        txthasil=findViewById(R.id.hasil);

        btnvolume.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int r;
                int t;
                float v;

                if(txtjari.getText().toString().isEmpty()){
                    txtjari.setError("harap diisi dahulu");
                    return;
                }
                if(txttinggi.getText().toString().isEmpty()){
                    txttinggi.setError("harap diisi dahulu");
                    return;
                }

                r=Integer.parseInt(txtjari.getText().toString());
                t=Integer.parseInt(txttinggi.getText().toString());

                v= (float) (3.14*r*r*t);

                txthasil.setText(String.valueOf(v));
            }
        });
        btnselimut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int r;
                int t;
                float v;

                if(txtjari.getText().toString().isEmpty()){
                    txtjari.setError("harap diisi dahulu");
                    return;
                }
                if(txttinggi.getText().toString().isEmpty()){
                    txttinggi.setError("harap diisi dahulu");
                    return;
                }

                r=Integer.parseInt(txtjari.getText().toString());
                t=Integer.parseInt(txttinggi.getText().toString());

                v= (float) (2*3.14*r*t);

                txthasil.setText(String.valueOf(v));
            }
        });
    }
}
