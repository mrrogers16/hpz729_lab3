package edu.utsa.cs3443.hpz729_lab3.controller;

import android.view.View;
import android.widget.Toast;
import edu.utsa.cs3443.hpz729_lab3.model.*;

public class ThorButtonController implements View.OnClickListener {
    @Override
    public void onClick(View view) {

        Toast.makeText(view.getContext(), "The thor button.", Toast.LENGTH_SHORT).show();
    }
}
