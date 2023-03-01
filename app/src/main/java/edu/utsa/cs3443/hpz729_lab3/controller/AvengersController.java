package edu.utsa.cs3443.hpz729_lab3.controller;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import edu.utsa.cs3443.hpz729_lab3.model.*;

/**
 * AvengersController.java is a java class that implements a View.OnClickListener. I contains a team,
 * an avenger, an alias, a context, and a message. It contains all relevant getters and setters as
 * well as an onClick method that creates avenger objects populated from an assets/data.csv folder.
 *
 * @author Mickey Clarke (abc123)
 * UTSA CS 3443
 * - Lab 3 Spring 2023
 */
public class AvengersController implements View.OnClickListener {
    private Team team;
    private Avenger avenger;
    private String alias;
    private Context context;
    private String message;

    /**
     * AvengersController constructor takes in a Context context
     *
     * @param context - Context
     */
    public AvengersController(Context context) {
        this.context = context;
    }

    /**
     * AvengersController constructor takes in String alias, and Context context.
     *
     * @param alias   - String
     * @param context - Context
     */
    public AvengersController(String alias, Context context) {
        this.alias = alias;
        this.context = context;
    }

    /**
     * onClick takes in a View object, it then creates a team object. Next the loadAvengers method
     * is called to create an Avenger to add to our Team object. Then the created avenger is added
     * to the team list according to its alias. Finally a null check is performed and either "Avenger
     * not found" or the avengers current location will be displayed in a Toast message.
     *
     * @param view - View
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
     * Team getter
     * @return team - Team
     */
    public Team getTeam() {
        return team;
    }

    /**
     * Team setter
     * @param team - Team
     */
    public void setTeam(Team team) {
        this.team = team;
    }

    /**
     * Avenger getter
     * @return avenger - Avenger
     */
    public Avenger getAvenger() {
        return avenger;
    }

    /**
     * Avenger setter
     * @param avenger - Avenger
     */
    public void setAvenger(Avenger avenger) {
        this.avenger = avenger;
    }

    /**
     * Alias getter
     * @return alias - String
     */
    public String getAlias() {
        return alias;
    }

    /**
     * Alias setter
     * @param alias - String
     */
    public void setAlias(String alias) {
        this.alias = alias;
    }

    /**
     * Context getter
     * @return context - Context
     */
    public Context getContext() {
        return context;
    }

    /**
     * Context setter
     * @param context - Context
     */
    public void setContext(Context context) {
        this.context = context;
    }

    /**
     * Message getter
     * @return - String
     */
    public String getMessage() {
        return message;
    }

    /**
     * Message setter
     * @param message - String
     */
    public void setMessage(String message) {
        this.message = message;
    }
}
