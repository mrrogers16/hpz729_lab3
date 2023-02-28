package edu.utsa.cs3443.hpz729_lab3.model;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.Objects;

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

    private ArrayList<Avenger> avengerList = new ArrayList<Avenger>();

    public Team() {

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
        for (int i = 0; i < avengerList.size(); i++) {
            if (avengerList.get(i).getAlias().equals(alias)) {
                return avengerList.get(i);
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
     * @param inputStream - InputStream of input files to build Avenger objects
     * @throws Exception
     */
    public void loadAvengers(InputStream inputStream) throws Exception {
        String line = "";
        String separator = ",";
        try (BufferedReader buffer = new BufferedReader(new InputStreamReader(inputStream))) {
            while ((line = buffer.readLine()) != null) {
                String[] fields = line.split(separator);
                //Steve Rogers,Captain America,male,6,2,240,T,Pentagon
                Avenger avenger = new Avenger(fields[0], Integer.parseInt(fields[3]),
                        Integer.parseInt(fields[4]), Integer.parseInt(fields[5]),
                        fields[2], fields[7], Boolean.parseBoolean(fields[6]), fields[2]);

                avengerList.add(avenger);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


