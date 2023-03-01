package edu.utsa.cs3443.hpz729_lab3.model;

import android.content.Context;
import android.content.res.AssetManager;
import android.util.Log;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/**
 * Team.java is a class that contains an ArrayList of Avenger objects. It contains methods to
 * retrieve a specific Avenger named getAvenger(), an overridden toString() method that returns a
 * String representation of all of the members of the team, and a loadAvengers method that takes
 * in a String filepath.csv and builds Avenger objects from the properly formatted .csv, it returns
 * nothing.
 *
 * @author Mickey Clarke (abc123)
 * UTSA CS 3443
 * - Lab 3 Spring 2023
 */
public class Team {

    private ArrayList<Avenger> avengerList;
    private String alias;
    private Context context;

    public Team() {
        avengerList = new ArrayList<>();
    }

    public Team(Context context) {
        this.context = context;
        avengerList = new ArrayList<>();
    }

    public void addAvenger(Avenger avenger) {
        avengerList.add(avenger);
    }

    /**
     * The getAvenger method takes in a string called alias
     * and returns and Avenger object if the alias if found. If
     * it is not null is returned.
     *
     * @param alias - String
     * @return Avenger
     */
    public Avenger getAvenger(String alias) {
        for (Avenger avenger : avengerList) {
            Log.d("Avenger App:", avenger.toString());
            if (avenger.getAlias().equals(alias)) {
                return avenger;
            }
        }
        return null;
    }

    /**
     * @return s - String representation of a Team of Avengers
     */
    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < avengerList.size(); i++) {
            s += avengerList.get(i).toString() + "\n";
        }
        return s;
    }

    /**
     * @param context - InputStream of input files to build Avenger objects
     * @throws Exception
     */
    public void loadAvengers(Context context) throws Exception {
        AssetManager assetManager = context.getAssets();
        InputStream inputStream = assetManager.open("data.csv");
        String line = "";
        String separator = ",";
        try (BufferedReader buffer = new BufferedReader(new InputStreamReader(inputStream))) {
            while ((line = buffer.readLine()) != null) {
                String[] fields = line.split(separator);
                for (int i = 0; i < fields.length; ++i) {
                    Log.d("Avengers App: hpz729", fields[i]);
                }
                //Steve Rogers,Captain America,male,6,2,240,T,Pentagon
                String name = fields[0];
                float weight = Float.parseFloat(fields[5]);
                String alias = fields[1];
                String current_location = fields[7];
                String height_feet = fields[3];
                String height_inches = fields[4];
                String gender = fields[2];
                boolean hasPowers = Boolean.parseBoolean(fields[6]);

                Avenger avenger = new Avenger(name, alias, gender, height_feet, height_inches,
                        weight, hasPowers, current_location);

                avengerList.add(avenger);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}



