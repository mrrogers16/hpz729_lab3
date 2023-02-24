package edu.utsa.cs3443.hpz729_lab3.model;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;

/**
 * TODO//loadAvengers()
 *
 * @author Mickey Clarke (abc123)
 * UTSA CS 3443
 * - Lab 3 Spring 2023
 */
public class Team {

    private ArrayList<Avenger> avengerList = new ArrayList<Avenger>();


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
     * @return
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
