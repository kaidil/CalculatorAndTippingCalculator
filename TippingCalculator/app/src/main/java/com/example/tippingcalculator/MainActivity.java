package com.example.tippingcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button calcBtn = (Button) findViewById(R.id.calcBtn);
        calcBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText billAmount = (EditText) findViewById(R.id.billAmount);
                EditText tipPercent = (EditText) findViewById(R.id.tipPercent);
                TextView tipAmount = (TextView) findViewById(R.id.tipAmount);
                TextView finalAmount = (TextView) findViewById(R.id.finalAmount);

                int num1 = Integer.parseInt(billAmount.getText().toString());
                int num2 = Integer.parseInt(tipPercent.getText().toString());
               /*int num3 = Integer.parseInt(tipAmount.getText().toString());*/
                int tip = num1 * num2 / 100;
                int finalSum = num1 + tip;
                tipAmount.setText(tip + "");
                finalAmount.setText(finalSum + "");
            }
        });
    }
}
