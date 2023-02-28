package edu.utsa.cs3443.hpz729_lab3.controller;

import android.content.Context;
import android.view.View;
import android.content.res.AssetManager;
import android.widget.Toast;

import java.io.IOException;
import java.io.InputStream;

import edu.utsa.cs3443.hpz729_lab3.model.*;

public class AvengersController implements View.OnClickListener {
    private Team team;
    private Avenger avenger;
    private String alias;
    private Context context;
    private String message;

    public AvengersController(String alias, Context context) {
        this.alias = alias;
        this.context = context;
    }

    @Override
    public void onClick(View view) {
        team = new Team();
        AssetManager assetManager = context.getAssets();

        try {
            InputStream inputStream = assetManager.open("data.csv");
            team.loadAvengers(inputStream);

        } catch (Exception e) {
            e.printStackTrace();
        }

        avenger = team.getAvenger(alias);
//        if (avenger != null) {
//
            Toast.makeText(view.getContext(), avenger.getAlias(), Toast.LENGTH_SHORT).show();
//        }
//        else {
//            Toast.makeText(view.getContext(), "Avenger not found", Toast.LENGTH_SHORT).show();
//        }
    }


    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public Avenger getAvenger() {
        return avenger;
    }

    public void setAvenger(Avenger avenger) {
        this.avenger = avenger;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
