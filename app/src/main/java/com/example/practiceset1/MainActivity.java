package com.example.practiceset1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    TextView text;
    EditText num1,num2;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Toast.makeText(getApplicationContext(), "Good Morning", Toast.LENGTH_SHORT).show();
        text = findViewById(R.id.textDisplay);
//        text.setText("Good Morning");
        num1 = findViewById(R.id.editTextNumber);
//        num2 = findViewById(R.id.editTextNumber2);
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                int sum = Integer.parseInt(num1.getText().toString())+ Integer.parseInt(num2.getText().toString());
                int number = Integer.parseInt(num1.getText().toString());
                String output = "";
                for(int i = 1;i <= 10; i++){
                output += number+" * "+i+" = "+(number*i)+"\n";
                }
                text.setText(output.toString());
            }
        });

    }

}