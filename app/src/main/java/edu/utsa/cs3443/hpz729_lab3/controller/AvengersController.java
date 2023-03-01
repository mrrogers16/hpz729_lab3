package edu.utsa.cs3443.hpz729_lab3.controller;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.widget.Toast;
import edu.utsa.cs3443.hpz729_lab3.model.*;

/**
 *
 */
public class AvengersController implements View.OnClickListener {
    private Team team;
    private Avenger avenger;
    private String alias;
    private Context context;
    private String message;

    /**
     * @param context
     */
    public AvengersController(Context context) {
        this.context = context;
    }

    /**
     * @param alias
     * @param context
     */
    public AvengersController(String alias, Context context) {
        this.alias = alias;
        this.context = context;
    }
    /**
     * @param view
     */
    @Override
    public void onClick(View view) {
        team = new Team();
        try {
            team.loadAvengers(context);
        } catch (Exception e) {
            e.printStackTrace();
        }

        avenger = team.getAvenger(alias);

        Log.d("Avengers App:", avenger.toString());
        if (avenger == null) {
            Toast.makeText(view.getContext(), "Avenger not found", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(view.getContext(), avenger.getCurrent_location(), Toast.LENGTH_SHORT).show();
        }
    }
    /**
     * @return team - Team
     */
    public Team getTeam() {
        return team;
    }

    /**
     * @param team - Team
     */
    public void setTeam(Team team) {
        this.team = team;
    }

    /**
     * @return avenger - Avenger
     */
    public Avenger getAvenger() {
        return avenger;
    }

    /**
     * @param avenger - Avenger
     */
    public void setAvenger(Avenger avenger) {
        this.avenger = avenger;
    }

    /**
     * @return alias - String
     */
    public String getAlias() {
        return alias;
    }

    /**
     * @param alias - String
     */
    public void setAlias(String alias) {
        this.alias = alias;
    }

    /**
     * @return context - Context
     */
    public Context getContext() {
        return context;
    }

    /**
     * @param context - Context
     */
    public void setContext(Context context) {
        this.context = context;
    }

    /**
     * @return - String
     */
    public String getMessage() {
        return message;
    }

    /**
     * @param message - String
     */
    public void setMessage(String message) {
        this.message = message;
    }
}
