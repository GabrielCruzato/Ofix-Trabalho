package com.example.Ofix;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Details extends AppCompatActivity implements View.OnClickListener {

    TextView nome, categoria, codigo, status, valorVenda,venda,lucro,custo;
    CardView cardView;
    String data1, data2, data3, data4, data5,data6,data7,data8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        nome = findViewById(R.id.nome);
        categoria = findViewById(R.id.categoria);
        codigo = findViewById(R.id.codigo);
        status = findViewById(R.id.status);
        valorVenda = findViewById(R.id.valorVenda);
        venda = findViewById(R.id.venda);
        lucro = findViewById(R.id.lucro);
        custo = findViewById(R.id.lucroCardTextView);
        cardView = findViewById(R.id.clickablecardview);


        getData();
        setData();

        cardView.setOnClickListener(this);
    }

    private void getData(){
        if(getIntent().hasExtra("s1") && getIntent().hasExtra("s2")  && getIntent().hasExtra("s3") && getIntent().hasExtra("s4") && getIntent().hasExtra("s5")
                && getIntent().hasExtra("s6") && getIntent().hasExtra("s7") && getIntent().hasExtra("s8")) {

            data1 = getIntent().getStringExtra("s1");
            data2 = getIntent().getStringExtra("s2");
            data3 = getIntent().getStringExtra("s3");
            data4 = getIntent().getStringExtra("s4");
            data5 = getIntent().getStringExtra("s5");
            data6 = getIntent().getStringExtra("s6");
            data7 = getIntent().getStringExtra("s7");
            data8 = getIntent().getStringExtra("s8");

        }else{
            Toast.makeText(this, "No data.", Toast.LENGTH_SHORT).show();
        }
    }

    private void setData(){
        nome.setText(data1);
        codigo.setText(data2);
        categoria.setText(data3);
        valorVenda.setText(data4);
        status.setText(data5);
        venda.setText(data6);
        lucro.setText(data7);
        custo.setText(data8);
    }


    @Override
    public void onClick(View v) {
        Intent i;
        i = new Intent(this,SavedData.class);
        startActivity(i);
    }
}