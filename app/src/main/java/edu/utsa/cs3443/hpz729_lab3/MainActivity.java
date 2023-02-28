package edu.utsa.cs3443.hpz729_lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;

import edu.utsa.cs3443.hpz729_lab3.controller.*;
import edu.utsa.cs3443.hpz729_lab3.model.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button thor_btn = findViewById(R.id.thor);
        Button hulk_btn = findViewById(R.id.hulk);
        Button doctorS_btn = findViewById(R.id.doctor_strange);
        Button captain_btn = findViewById(R.id.capitan_america);
        Button spiderman_btn = findViewById(R.id.spiderman);

        thor_btn.setOnClickListener(new AvengersController("God of Thunder",this));
        hulk_btn.setOnClickListener(new AvengersController("Hulk", this));
        doctorS_btn.setOnClickListener(new AvengersController("Doctor Strange", this));
        captain_btn.setOnClickListener(new AvengersController("Captain America", this));
        spiderman_btn.setOnClickListener(new AvengersController("Spiderman", this));
    }
}