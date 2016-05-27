package com.ojh.www.templatemethodpattern;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CaffeineBeverage beverage;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView tvResult = (TextView)findViewById(R.id.tvResult);

        btn = (Button)findViewById(R.id.btnCoffee);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                beverage = new Coffee();
                tvResult.setText(beverage.prepareRecipe());
            }
        });

        btn = (Button)findViewById(R.id.btnLemonTea);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                beverage = new LemonTea();
                tvResult.setText(beverage.prepareRecipe());
            }
        });

        btn = (Button)findViewById(R.id.btnTea);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                beverage = new Tea();
                tvResult.setText(beverage.prepareRecipe());
            }
        });

    }
}
