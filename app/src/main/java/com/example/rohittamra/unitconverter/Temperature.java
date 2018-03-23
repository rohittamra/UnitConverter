package com.example.rohittamra.unitconverter;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class Temperature extends AppCompatActivity {
    Spinner spinner;
    EditText num;
    double input_num = 0.0d;
    String unit;
    Button convert;
    TextView F, C, K;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temperature);
        spinner = (Spinner) findViewById(R.id.spinnerTemp);
        num = (EditText) findViewById(R.id.editText);
        convert = (Button) findViewById(R.id.startconvertingTemp);
        F = (TextView) findViewById(R.id.Fahrenheit);
        C = (TextView) findViewById(R.id.Celsius);
        K = (TextView) findViewById(R.id.Kelvin);
        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                InputMethodManager inputManager = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
                inputManager.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(),InputMethodManager.HIDE_NOT_ALWAYS);

                unit = spinner.getSelectedItem().toString().toLowerCase();
                input_num = Double.parseDouble(num.getText().toString());
                switch (unit) {
                    case "kelvin":
                        F.setText(  (input_num - 273.15) * 9/5 + 32+ " fahrenheit");
                        C.setText(input_num - 273.15+ " celsius");
                        K.setText(input_num + " kelvin");
                        break;
                    case "fahrenheit":
                        F.setText( input_num + " fahrenheit");
                        C.setText( (input_num - 32) * 5/9 + " celsius");
                        K.setText( (input_num - 32) * 5/9 + 273.15+ " kelvin");
                        break;
                    case "celsius":
                        F.setText(  (input_num * 9/5) + 32+ " fahrenheit");
                        C.setText(input_num + " celsius");
                        K.setText(input_num + 273.15+ " kelvin");
                        break;
                }
            }
        });
    }
}
