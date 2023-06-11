package com.prakash.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    Spinner fromSpinner;
    Spinner toSpinner;
    EditText editText;

    TextView solutionTextView;
    Button button,resetButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toSpinner = findViewById(R.id.toSpinner);
        fromSpinner = findViewById(R.id.fromSpinner);
        editText = findViewById(R.id.editText);
        button = findViewById(R.id.button);
        resetButton = findViewById(R.id.resetButton);

        solutionTextView = findViewById(R.id.solutionTextView);


        String[] units = {"Gram", "Kilogram", "Ton", "Pound", "Ounce", "Carat", "Newton","Celsius","Fahrenheit","Kelvin","Rankine"};


        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, units);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        fromSpinner.setAdapter(arrayAdapter);


        ArrayAdapter arrayAdapter1 = new ArrayAdapter(this, android.R.layout.simple_list_item_1, units);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        toSpinner.setAdapter(arrayAdapter1);

        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                solutionTextView.setText("");
                editText.setText("");
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String fromSelection = fromSpinner.getSelectedItem().toString();
                String toSelection = toSpinner.getSelectedItem().toString();
                String inputValStr = editText.getText().toString();
                if (inputValStr.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Please Provide a value", Toast.LENGTH_SHORT).show();

                } else {
                    double inputVal = Double.parseDouble(inputValStr);


                    switch (fromSelection) {
                        case "Gram":
                            switch (toSelection) {
                                case "Kilogram":
                                    double kgs = inputVal / 1000;
                                    solutionTextView.setText(String.valueOf(kgs));
                                    break;
                                case "Ton":
                                    double ton = inputVal / 1000000;
                                    solutionTextView.setText(String.valueOf(ton));
                                    break;
                                case "Pound":
                                    double pound = inputVal / 453.59237;
                                    solutionTextView.setText(String.valueOf(pound));
                                    break;
                                case "Ounce":
                                    double ounce = inputVal / 28.34952;
                                    solutionTextView.setText(String.valueOf(ounce));
                                    break;
                                case "Carat":
                                    double carat = inputVal / 0.2;
                                    solutionTextView.setText(String.valueOf(carat));
                                    break;
                                case "Newton":
                                    double newton = inputVal * 9.8;
                                    solutionTextView.setText(String.valueOf(newton));
                                    break;

                                case "Gram":
                                    solutionTextView.setText(String.valueOf(inputVal));
                                    break;


                            }
                            break;
                        case "Kilogram":
                            switch (toSelection) {
                                case "Gram":

                                    double gram = inputVal * 1000;
                                    solutionTextView.setText(String.valueOf(gram));
                                    break;
                                case "Ton":
                                    double ton = inputVal / 1000;
                                    solutionTextView.setText(String.valueOf(ton));
                                    break;
                                case "Pound":
                                    double pound = inputVal * 2.20462;
                                    solutionTextView.setText(String.valueOf(pound));
                                    break;
                                case "Ounce":
                                    double ounce = inputVal * 35.27396;
                                    solutionTextView.setText(String.valueOf(ounce));
                                    break;
                                case "Carat":
                                    double carat = inputVal * 5000;
                                    solutionTextView.setText(String.valueOf(carat));
                                    break;
                                case "Newton":
                                    double newton = inputVal * (9.8);
                                    solutionTextView.setText(String.valueOf(newton));
                                    break;
                                case "Kilogram":
                                    solutionTextView.setText(String.valueOf(inputVal));
                                    break;
                            }
                            break;
                        case "Ton":

                            switch (toSelection) {
                                case "Gram":
                                    double gram = inputVal * 1000000;
                                    solutionTextView.setText(String.valueOf(gram));

                                    break;
                                case "Kilogram":
                                    double kilogram = inputVal * 1000;
                                    solutionTextView.setText(String.valueOf(kilogram));

                                    break;
                                case "Pound":
                                    double pound = inputVal * 2204.62;
                                    solutionTextView.setText(String.valueOf(pound));

                                    break;
                                case "Ounce":
                                    double ounce = inputVal * 35273.96;
                                    solutionTextView.setText(String.valueOf(ounce));

                                    break;
                                case "Carat":
                                    double carat = inputVal * 500000;
                                    solutionTextView.setText(String.valueOf(carat));

                                    break;
                                case "Newton":
                                    double newton = inputVal * 9806.65;
                                    solutionTextView.setText(String.valueOf(newton));

                                    break;
                                case "Ton":

                                    solutionTextView.setText(String.valueOf(inputVal));
                                    break;
                            }

                            break;
                        case "Pound":

                            switch (toSelection) {
                                case "Gram":
                                    double gram = inputVal * 453.59237;
                                    solutionTextView.setText(String.valueOf(gram));

                                    break;
                                case "Kilogram":
                                    double kilogram = inputVal * 0.45359237;
                                    solutionTextView.setText(String.valueOf(kilogram));

                                    break;

                                case "Ounce":
                                    double ounce = inputVal * 0.0625;
                                    solutionTextView.setText(String.valueOf(ounce));
                                    break;
                                case "Carat":

                                    double carat = inputVal * 2267.96185;
                                    solutionTextView.setText(String.valueOf(carat));
                                    break;
                                case "Newton":

                                    double newton = inputVal * 4.44822162;
                                    solutionTextView.setText(String.valueOf(newton));
                                    break;

                                case "Ton":

                                    double ton = inputVal * 0.00045359237;
                                    solutionTextView.setText(String.valueOf(ton));


                                    break;
                                case "Pound":

                                    solutionTextView.setText(String.valueOf(inputVal));
                                    break;
                            }

                            break;

                        //Ounce
                        case "Ounce":

                            switch (toSelection) {
                                case "Gram":
                                    double gram = inputVal * 28.3495;
                                    solutionTextView.setText(String.valueOf(gram));

                                    break;
                                case "Kilogram":

                                    double kilogram = inputVal * 0.0283495;
                                    solutionTextView.setText(String.valueOf(kilogram));
                                    break;
                                case "Ton":
                                    double ton = inputVal * 0.00002835;
                                    solutionTextView.setText(String.valueOf(ton));

                                case "Pound":

                                    double pound = inputVal * 0.0625;
                                    solutionTextView.setText(String.valueOf(pound));
                                    break;

                                case "Carat":

                                    double carat = inputVal * 141.7476;
                                    solutionTextView.setText(String.valueOf(carat));
                                    break;
                                case "Newton":

                                    double newton = inputVal * 0.2780139;
                                    solutionTextView.setText(String.valueOf(newton));

                                    break;


                                case "Ounce":

                                    solutionTextView.setText(String.valueOf(inputVal));
                                    break;
                            }

                            break;

                        //Carat
                        case "Carat":

                            switch (toSelection) {
                                case "Gram":
                                    double gram = inputVal * 0.2;
                                    solutionTextView.setText(String.valueOf(gram));

                                    break;
                                case "Kilogram":
                                    double kilogram = inputVal * 0.0002;
                                    solutionTextView.setText(String.valueOf(kilogram));

                                    break;
                                case "Ton":
                                    double ton = inputVal * 0.0000002;
                                    solutionTextView.setText(String.valueOf(ton));
                                    break;
                                case "Pound":
                                    double pound = inputVal * 0.000440924;
                                    solutionTextView.setText(String.valueOf(pound));
                                    break;
                                case "Ounce":
                                    double ounce = inputVal * 0.00705479;
                                    solutionTextView.setText(String.valueOf(ounce));

                                    break;

                                case "Newton":
                                    double newton = inputVal * 0.0196133;
                                    solutionTextView.setText(String.valueOf(newton));

                                    break;
                                case "Carat":
                                    solutionTextView.setText(String.valueOf(inputVal));
                                    break;

                            }

                            break;
// Newton
                        case "Newton":

                            switch (toSelection) {
                                case "Gram":
                                    double gram = inputVal * 101.9716213;
                                    solutionTextView.setText(String.valueOf(gram));

                                    break;
                                case "Kilogram":
                                    double kilogram = inputVal * 0.1019716213;
                                    solutionTextView.setText(String.valueOf(kilogram));

                                    break;
                                case "Ton":

                                    double ton = inputVal * 0.0001019716213;
                                    solutionTextView.setText(String.valueOf(ton));
                                case "Pound":

                                    double pound = inputVal * 0.224808943;
                                    solutionTextView.setText(String.valueOf(pound));
                                    break;
                                case "Ounce":

                                    double ounce = inputVal * 3.52739619;
                                    solutionTextView.setText(String.valueOf(ounce));
                                    break;
                                case "Carat":

                                    double carat = inputVal * 5082.329941;
                                    solutionTextView.setText(String.valueOf(carat));
                                    break;

                                case "Newton":

                                    solutionTextView.setText(String.valueOf(inputVal));

                                    break;
                            }

                            break;
                        case "Celsius":
                            switch(toSelection)
                            {
                                case "Fahrenheit":
                                    double fah = (inputVal * 9/5.0) + 32;
                                    solutionTextView.setText(String.valueOf(fah));
                                    break;
                                case "Kelvin":
                                    double kelvin = (inputVal + 273.15);
                                    solutionTextView.setText(String.valueOf(kelvin));
                                    break;

                                case "Rankine":
                                    double rankine = (inputVal  + 273.15) * 9/5.0;
                                    solutionTextView.setText(String.valueOf(rankine));
                                    break;
                                case "Celsius":
                                    solutionTextView.setText(String.valueOf(inputVal));
                                    break;
                            }
                            break;



                        case "Fahrenheit":
                            switch(toSelection)
                            {
                                case "Celsius":
                                    double celsius = (inputVal - 32) * 5/9.0;
                                    solutionTextView.setText(String.valueOf(celsius));
                                    break;
                                case "Kelvin":
                                    double kelvin = (inputVal + 459.67)* 5/9.0;
                                    solutionTextView.setText(String.valueOf(kelvin));
                                    break;

                                case "Rankine":
                                    double rankine = (inputVal  + 459.67);
                                    solutionTextView.setText(String.valueOf(rankine));
                                    break;
                                case "Fahrenheit":
                                    solutionTextView.setText(String.valueOf(inputVal));
                                    break;
                            }
                            break;



                        case "Kelvin":
                            switch(toSelection)
                            {
                                case "Celsius":
                                    double celsius = (inputVal - 273.15);
                                    solutionTextView.setText(String.valueOf(celsius));
                                    break;

                                case "Kelvin":

                                    solutionTextView.setText(String.valueOf(inputVal));
                                    break;

                                case "Rankine":
                                    double rankine = (inputVal  * 9/5.0);
                                    solutionTextView.setText(String.valueOf(rankine));
                                    break;
                                case "Fahrenheit":
                                    double fah = (inputVal * 9/5.0) - 457.67;
                                    solutionTextView.setText(String.valueOf(fah));
                                    break;
                            }
                            break;


                        case "Rankine":
                            switch(toSelection)
                            {
                                case "Celsius":
                                    double celsius = (inputVal - 491.67) * 5/9.0;
                                    solutionTextView.setText(String.valueOf(celsius));
                                    break;

                                case "Kelvin":

                                    double kelvin = (inputVal * 5/9.0);
                                    solutionTextView.setText(String.valueOf(kelvin));
                                    break;

                                case "Rankine":
                                    solutionTextView.setText(String.valueOf(inputVal));
                                    break;
                                case "Fahrenheit":
                                    double fah = (inputVal - 457.67);
                                    solutionTextView.setText(String.valueOf(fah));
                                    break;
                            }
                            break;
                    }

                }
            }

        });

    }
}