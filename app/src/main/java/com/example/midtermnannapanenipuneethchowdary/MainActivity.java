package com.example.midtermnannapanenipuneethchowdary;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText editTextLiters;
    private TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextLiters = findViewById(R.id.editTextLiters);
        textViewResult = findViewById(R.id.textViewResult);
    }

    public void convertLitersToCups(View view) {
        String inputLiters = editTextLiters.getText().toString();
        if (inputLiters.isEmpty()) {
            textViewResult.setText("Please enter a value.");
            return;
        }

        double liters = Double.parseDouble(inputLiters);
        double cups = liters * 4.22;

        textViewResult.setText(String.format("%.2f liters = %.2f cups", liters, cups));
    }

    public void clearFields(View view) {
        editTextLiters.setText("");
        textViewResult.setText("Result");
    }
}
