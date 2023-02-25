package edu.utsa.cs3443.hpz729_lab3.model;

import java.util.ArrayList;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;

/** Team.java is a class that contains an ArrayList of Avenger objects. It contains methods to
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

    public Team()
    {

    }


    /**
     * The getAvenger method takes in a string called alias
     * and returns and Avenger object if the alias if found. If
     * it is not null is returned.
     *
     * @param alias
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
        for(int i = 0;i < avengerList.size();i++)
        {
            s += avengerList.get(i).toString() + "\n";
        }
        return s;
    }

    /**
     * @param directoryName - String of input files to build Avenger objects
     * @throws Exception
     */
    public void loadAvengers(String directoryName) throws Exception {
        String line = "";
        String seperator = ",";
        File folder = new File(directoryName);
        File[] listOfFiles = folder.listFiles();
        for (int i = 0; i < listOfFiles.length; i++) {
            if (listOfFiles[i].isFile() && listOfFiles[i].getName().endsWith(".csv")) {
                try (BufferedReader buffer = new BufferedReader(new FileReader(listOfFiles[i]))) {
                    while ((line = buffer.readLine()) != null) {
                        String[] fields = line.split(seperator);
                        //Steve Rogers,Captain America,male,6,2,240,T,Pentagon
                        Avenger avenger = new Avenger(fields[0], Integer.parseInt(fields[1]), Integer.parseInt(fields[2]), fields[3], fields[4], Boolean.parseBoolean(fields[5]));
                        avengerList.add(avenger);
                    }
                }
            }
        }
    }
}
