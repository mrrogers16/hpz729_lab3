package edu.utsa.cs3443.hpz729_lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import edu.utsa.cs3443.hpz729_lab3.controller.AvengersController;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AvengersController avengersController = new AvengersController();

        Button thor_btn = findViewById(R.id.thor);
        Button hulk_btn = findViewById(R.id.hulk);
        Button doctorS_btn = findViewById(R.id.doctor_strange);
        Button capitan_btn = findViewById(R.id.capitan_america);
        Button spiderman_btn = findViewById(R.id.spiderman);


        thor_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Thor's info will be shown.", Toast.LENGTH_LONG).show();
            }
        });
        hulk_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Hulk's info will be shown", Toast.LENGTH_LONG).show();
            }
        });

    }
}