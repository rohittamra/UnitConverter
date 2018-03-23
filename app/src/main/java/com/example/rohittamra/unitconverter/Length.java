package com.example.rohittamra.unitconverter;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.rohittamra.unitconverter.Description.Inches_description;
import com.example.rohittamra.unitconverter.Description.Km_description;

public class Length extends AppCompatActivity {
Spinner spinner,spinner2;
EditText num,num2got;
double input_num=0.0d;
String unit,unit2;
Button convert;
TextView km,inches,meters,feet,yards,miles,mm,cm,hm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_length);
        spinner = (Spinner) findViewById(R.id.spinnerLength);
        num = (EditText) findViewById(R.id.editText);

        spinner2 = (Spinner) findViewById(R.id.spinnerLength2);
        num2got = (EditText) findViewById(R.id.editText2);
        unit2 = spinner2.getSelectedItem().toString().toLowerCase();

        convert = (Button) findViewById(R.id.startconvertingLength);
        km = (TextView) findViewById(R.id.km);
        inches = (TextView) findViewById(R.id.inches);
        meters = (TextView) findViewById(R.id.meters);
        feet = (TextView) findViewById(R.id.feet);
        yards = (TextView) findViewById(R.id.yards);
        miles = (TextView) findViewById(R.id.miles);
        mm = (TextView) findViewById(R.id.millimeters);
        cm = (TextView) findViewById(R.id.centimeters);
        hm = (TextView) findViewById(R.id.hectameters);

        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                InputMethodManager inputManager = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                inputManager.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), InputMethodManager.HIDE_NOT_ALWAYS);


                                    input_num=Double.parseDouble(num.getText().toString());
                                    unit=spinner.getSelectedItem().toString().toLowerCase();

                                    switch(unit)
                                    {
                                        case "inches":
                                                        km.setText(""+input_num * 0.0000254d+" km");
                                                        inches.setText(input_num+" inches");
                                                        meters.setText(input_num * 0.0254d+" meters");
                                                        feet.setText(input_num/ 12.0d +" feet");
                                                        yards.setText(input_num / 36.0d+" yards");
                                                        miles.setText(input_num/ 63360.0d +" miles");
                                                        mm.setText(input_num* 25.4d +" mm");
                                                        cm.setText(input_num * 2.54d+" cm");
                                                        break;
                                        case "feet":
                                            km.setText(""+input_num*0.0003048d+" km");
                                            inches.setText(input_num*12.0d+" inches");
                                            meters.setText(input_num*0.3048d+" meters");
                                            feet.setText(input_num+" feet");
                                            yards.setText(input_num /3.0d+" yards");
                                            miles.setText(input_num /5280.0d+" miles");
                                            mm.setText(input_num*304.8d +" mm");
                                            cm.setText(input_num *30.48d+" cm");
                                            break;
                                        case "yards":
                                            km.setText(""+input_num/1093.61d+" km");
                                            inches.setText(input_num* 36.0d+" inches");
                                            meters.setText(input_num*0.9144d+" meters");
                                            feet.setText(input_num* 3.0d+" feet");
                                            yards.setText(input_num +" yards");
                                            miles.setText(input_num / 1760.0d+" miles");
                                            mm.setText(input_num * 914.4d+" mm");
                                            cm.setText(input_num*91.44d +" cm");
                                            break;
                                        case "miles":
                                            km.setText(""+input_num*1.60934d+" km");
                                            inches.setText(input_num*6330.0d+" inches");
                                            meters.setText(input_num*1609.34d+" meters");
                                            feet.setText(input_num*5280.0d+" feet");
                                            yards.setText(input_num *1760.0d+" yards");
                                            miles.setText(input_num +" miles");
                                            mm.setText(input_num*1609340.0d +" mm");
                                            cm.setText(input_num*160934.0d +" cm");
                                            break;
                                        case "millimeters":
                                           // km.setText(""+input_num+" km");
                                            km.setText(" km");
                                            inches.setText(input_num*25.4d+" inches");
                                         //   meters.setText(input_num+" meters");
                                            meters.setText(" meters");
                                            feet.setText(input_num/304.8d+" feet");
                                            yards.setText(input_num/914.4d +" yards");
                                            miles.setText(input_num /1609000.0d+" miles");
                                            mm.setText(input_num +" mm");
                                       //     cm.setText(input_num +" cm");
                                            cm.setText(" cm");
                                            break;
                                        case "centimeters":
                                           // km.setText(""+input_num+" km");
                                            km.setText(" km");
                                            inches.setText(input_num/ 2.54d+" inches");
                                          //  meters.setText(input_num+" meters");
                                            meters.setText(" meters");
                                            feet.setText(input_num/ 30.48d+" feet");
                                            yards.setText(input_num/ 91.44d +" yards");
                                            miles.setText(input_num/160934.0d +" miles");
                                         //   mm.setText(input_num +" mm");
                                            mm.setText(" mm");
                                            cm.setText(input_num +" cm");
                                            break;
                                        case "meters":
                                        //    km.setText(""+input_num+" km");
                                            km.setText(" km");
                                            inches.setText(input_num* 39.3701d+" inches");
                                            meters.setText(input_num+" meters");
                                            feet.setText(input_num* 3.28084d+" feet");
                                            yards.setText(input_num*1.09361d +" yards");
                                            miles.setText(input_num /1609.34d+" miles");
                                      //      mm.setText(input_num +" mm");
                                            mm.setText(" mm");
                                        //    cm.setText(input_num +" cm");
                                            cm.setText(" cm");
                                            break;
                                        case "kilometers":
                                            km.setText(""+input_num+" km");
                                            inches.setText(input_num*39370.1d+" inches");
                                            meters.setText(input_num+" meters");
                                            feet.setText(input_num*3280.84d+" feet");
                                            yards.setText(input_num*1093.61d +" yards");
                                            miles.setText(input_num/1.60934d +" miles");
                                        //    mm.setText(input_num +" mm");
                                         ///   cm.setText(input_num +" cm");
                                            mm.setText(" mm");
                                            cm.setText(" cm");
                                            break;
                                     }
                double num1 = input_num;
                double num2 = 0.0d;

                String original = spinner.getSelectedItem().toString().toLowerCase();
                String newU = spinner2.getSelectedItem().toString().toLowerCase();

                switch (original) {
                    case "inches": {
                        switch (newU) {
                            case "inches":
                                num2 = num1;
                                break;
                            case "feet":

                                num2 = num1 / 12.0d;
                                break;
                            case "yards":

                                num2 = num1 / 36.0d;
                                break;
                            case "miles":

                                num2 = num1 / 63360.0d;
                                break;
                            case "millimeters":

                                num2 = num1 * 25.4d;
                                break;
                            case "centimeters":

                                num2 = num1 * 2.54d;
                                break;
                            case "meters":

                                num2 = num1 * 0.0254d;
                                break;
                            case "kilometers":

                                num2 = num1 * 0.0000254d;
                                break;
                        }
                        break;
                    }
                    case "feet": {
                        switch (newU) {
                            case "inches":

                                num2 = num1 * 12.0d;
                                break;
                            case "feet":
                                num2 = num1;
                                break;
                            case "yards":

                                num2 = num1 / 3.0d;
                                break;
                            case "miles":

                                num2 = num1 / 5280.0d;
                                break;
                            case "millimeters":

                                num2 = num1 * 304.8d;
                                break;
                            case "centimeters":

                                num2 = num1 * 30.48d;
                                break;
                            case "meters":

                                num2 = num1 * 0.3048d;
                                break;
                            case "kilometers":

                                num2 = num1 * 0.0003048d;
                                break;
                        }
                        break;
                    }
                    case "yards": {
                        switch (newU) {
                            case "inches":

                                num2 = num1 * 36.0d;
                                break;
                            case "feet":

                                num2 = num1 * 3.0d;
                                break;
                            case "yards":
                                num2 = num1;
                                break;
                            case "miles":

                                num2 = num1 / 1760.0d;
                                break;
                            case "millimeters":

                                num2 = num1 * 914.4d;
                                break;
                            case "centimeters":

                                num2 = num1 * 91.44d;
                                break;
                            case "meters":
                                num2 = num1 * 0.9144d;
                                break;
                            case "kilometers":

                                num2 = num1 / 1093.61d;
                                break;
                        }
                        break;
                    }
                    case "miles": {
                        switch (newU) {
                            case "inches":

                                num2 = num1 * 6330.0d;
                                break;
                            case "feet":

                                num2 = num1 * 5280.0d;
                                break;
                            case "yards":

                                num2 = num1 * 1760.0d;
                                break;
                            case "miles":
                                num2 = num1;
                                break;
                            case "millimeters":

                                num2 = num1 * 1609340.0d;
                                break;
                            case "centimeters":

                                num2 = num1 * 160934.0d;
                                break;
                            case "meters":

                                num2 = num1 * 1609.34d;
                                break;
                            case "kilometers":

                                num2 = num1 * 1.60934d;
                                break;
                        }
                        break;
                    }
                    case "millimeters": {
                        switch (newU) {
                            case "inches":
                                num2 = num1 * 25.4d;
                                break;
                            case "feet":
                                num2 = num1 / 304.8d;
                                break;
                            case "yards":
                                num2 = num1 / 914.4d;
                                break;
                            case "miles":
                                num2 = num1 / 1609000.0d;
                                break;
                            case "millimeters":
                                num2 = num1;
                                break;
                            case "centimeters":
                                //                num2 = metricConverter.metricConvert(num1, "milli", "centi");
                                break;
                            case "meters":
                                //              num2 = metricConverter.metricConvert(num1, "milli", "unit");
                                break;
                            case "kilometers":
                                //            num2 = metricConverter.metricConvert(num1, "milli", "kilo");
                                break;
                        }
                        break;
                    }

                    case "centimeters": {
                        switch (newU) {
                            case "inches":
                                num2 = num1 / 2.54d;
                                break;
                            case "feet":
                                num2 = num1 / 30.48d;
                                break;
                            case "yards":
                                num2 = num1 / 91.44d;
                                break;
                            case "miles":
                                num2 = num1 / 160934.0d;
                                break;
                            case "millimeters":
                                //                      num2 = metricConverter.metricConvert(num1, "centi", "milli");
                                break;
                            case "centimeters":
                                num2 = num1;
                                break;
                            case "meters":
                                //                    num2 = metricConverter.metricConvert(num1, "centi", "unit");
                                break;
                            case "kilometers":
                                //                  num2 = metricConverter.metricConvert(num1, "centi", "kilo");
                                break;
                        }
                        break;
                    }
                    case "meters": {
                        switch (newU) {
                            case "inches":
                                num2 = num1 * 39.3701d;
                                break;
                            case "feet":
                                num2 = num1 * 3.28084d;
                                break;
                            case "yards":
                                num2 = num1 * 1.09361d;
                                break;
                            case "miles":
                                num2 = num1 / 1609.34d;
                                break;
                            case "millimeters":
                                //            num2 = metricConverter.metricConvert(num1, "unit", "milli");
                                break;
                            case "centimeters":
                                //              num2 = metricConverter.metricConvert(num1, "unit", "centi");
                                break;
                            case "meters":
                                num2 = num1;
                                break;
                            case "kilometers":
                                //                num2 = metricConverter.metricConvert(num1, "unit", "kilo");
                                break;
                        }
                        break;
                    }
                    case "kilometers": {
                        switch (newU) {
                            case "inches":
                                num2 = num1 * 39370.1d;
                                break;
                            case "feet":
                                num2 = num1 * 3280.84d;
                                break;
                            case "yards":
                                num2 = num1 * 1093.61d;
                                break;
                            case "miles":
                                num2 = num1 / 1.60934d;
                                break;
                            case "millimeters":
                                //                  num2 = metricConverter.metricConvert(num1, "kilo", "milli");
                                break;
                            case "centimeters":
                                //                    num2 = metricConverter.metricConvert(num1, "kilo", "centi");
                                break;
                            case "meters":
                                //                      num2 = metricConverter.metricConvert(num1, "kilo", "unit");
                                break;
                            case "kilometers":
                                num2 = num1;
                                break;
                        }
                        break;
                    }
                }
                num2got.setText(""+num2);
            }




        });


        km.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), Km_description.class));
            }
        });

        inches.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), Inches_description.class));
            }
        });

    }
}
