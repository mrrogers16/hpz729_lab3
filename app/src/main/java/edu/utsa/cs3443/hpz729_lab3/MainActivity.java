package edu.utsa.cs3443.hpz729_lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import edu.utsa.cs3443.hpz729_lab3.controller.*;

/**
 * This is the main method
 *
 * This class represents the main method of the Avengers app program (hpz729_lab3).
 * It contains an onCreate method which creates an AvengersController which takes a context argument.
 * The buttons objects are created and then linked to a onClickListener which takes in an String alias
 * and/or and Context context.
 *
 * @author Mickey Clarke hpz729
 * UTSA CS 3443 - Lab 2
 * Spring 2023
 * */
public class MainActivity extends AppCompatActivity {
/**
 * Called when the activity is first created.
 *
 * This method is responsible for initializing the activity's UI components and
 * data structures, setting up any event listeners, and restoring the activity's
 * state if it has been previously saved.
 * @param savedInstanceState - Bundle object
 */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button thor_btn = findViewById(R.id.thor);
        Button hulk_btn = findViewById(R.id.hulk);
        Button doctorS_btn = findViewById(R.id.doctor_strange);
        Button captain_btn = findViewById(R.id.capitan_america);
        Button spiderman_btn = findViewById(R.id.spiderman);

        thor_btn.setOnClickListener(new AvengersController("God of Thunder", this));
        hulk_btn.setOnClickListener(new AvengersController("Hulk", this));
        doctorS_btn.setOnClickListener(new AvengersController("Doctor Strange", this));
        captain_btn.setOnClickListener(new AvengersController("Captain America", this));
        spiderman_btn.setOnClickListener(new AvengersController("Spiderman", this));
    }
}