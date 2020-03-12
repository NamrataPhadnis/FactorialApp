package com.example.factorialapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button;
    TextView textview;
    EditText edittext;
    String string1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edittext=findViewById(R.id.et1);
        button=findViewById(R.id.bt1);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int fact=1;
                int i=1;

                string1=edittext.getText().toString().trim();
                int numb= Integer.parseInt(string1);
                for(i=1;i<=numb;i++)
                {
                    fact=fact*i;

                }
                Toast.makeText(MainActivity.this, "result is="+fact, Toast.LENGTH_SHORT).show();

            }
        });

    }
}
