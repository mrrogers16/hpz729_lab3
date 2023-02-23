package edu.utsa.cs3443.hpz729_lab3.model;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * TODO//loadAvengers()
 *
 *@author Mickey Clarke (abc123)
 * UTSA CS 3443
 * - Lab 1 Spring 2023
 */
public class Team {

    private ArrayList<Avenger> avengerList = new ArrayList<Avenger>();


    /**
     * @param filename
     */
    public void loadAvengers(String filename) {
        //@TODO
    }

    /**
     * The getAvenger method takes in a string of type avenger and returns and Avenger object
     * @param alias
     * @return Avenger
     */
public Avenger getAvenger(String alias)
{
    for(int i = 0; i < avengerList.size(); i++)
    {
        if(avengerList.get(i).getAlias().equals(alias))
        {
            return avengerList.get(i);
        }
    }
    return null;
}

    /**
     * @return
     */
@Override
public String toString()
{
    //TODO create toString
}