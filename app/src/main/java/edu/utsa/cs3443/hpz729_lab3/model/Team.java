package edu.utsa.cs3443.hpz729_lab3.model;

import android.content.Context;
import android.content.res.AssetManager;
import android.util.Log;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.io.BufferedReader;

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
    private Context context;

    /**
     * Default constructor that creates creates an ArrayList of Avenger objects and takes no arguments.
     */
    public Team() {
        avengerList = new ArrayList<>();
    }

    /**
     * Team constructor that takes in a Context context parameter and initializes an ArrayList of
     * Avenger objects.
     * @param context - Context
     */
    public Team(Context context) {
        this.context = context;
        avengerList = new ArrayList<>();
    }

    /**
     * Adds an Avenger object to an ArrayList Avenger objects
     * @param avenger - Avenger object
     */
    public void addAvenger(Avenger avenger) {
        avengerList.add(avenger);
    }

    /**
     * The getAvenger method takes in a string called alias
     * and returns and Avenger object if the alias if found. If
     * it is not null is returned.
     *
     * @param alias - String
     * @return avenger - Avenger
     */
    public Avenger getAvenger(String alias) {
        for (Avenger avenger : avengerList) {
            //Log.d("Avenger App:", avenger.toString());
            if (avenger.getAlias().equals(alias)) {
                return avenger;
            }
        }
        return null;
    }

    /**
     * Overridden toString method. Loops through the avenger arraylist and appends each one to a
     * String s which is returned on completion.
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
     * @throws Exception - I/O Exception (general exception) may throw NumberFormat or BooleanFormat
     * exceptions.
     */
    public void loadAvengers(Context context) throws Exception {
        AssetManager assetManager = context.getAssets();
        InputStream inputStream = assetManager.open("data.csv");
        String line = "";
        String separator = ",";
        try (BufferedReader buffer = new BufferedReader(new InputStreamReader(inputStream))) {
            while ((line = buffer.readLine()) != null) {
                String[] fields = line.split(separator);
                for(String s : fields)
                {
                    System.out.println(Log.d("ArrayTagggg", fields.toString()));
                }

                Avenger avenger = new Avenger(fields[0], fields[1], fields[2], fields[3], fields[4],
                        Float.parseFloat(fields[5]), Boolean.parseBoolean(fields[6]), fields[7]);

                avengerList.add(avenger);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}



