package com.example.demosimpleclick;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    TextView tvDisplay;
    Button btnDisplay;
    EditText etInput;
    ToggleButton tgBtn;
    RadioGroup rgGender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvDisplay = findViewById(R.id.textViewDisplay);
        btnDisplay = findViewById(R.id.buttonDisplay);
        etInput = findViewById(R.id.editTextInput);
        tgBtn = findViewById(R.id.toggleButtonEnabled);
        rgGender = findViewById(R.id.radioGroupGender);


        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){

                String stringResponse;
                if (tgBtn.isChecked()) {
                    stringResponse = etInput.getText().toString();
                    int checkedRadioId = rgGender.getCheckedRadioButtonId();
                    if(checkedRadioId == R.id.radioButtonGenderMale){
                        stringResponse = "He says " + stringResponse;
                    } else{
                        stringResponse = "She says " + stringResponse;

                    }
                    tvDisplay.setText(stringResponse);
                    ;
                }
        };


    });
    }}