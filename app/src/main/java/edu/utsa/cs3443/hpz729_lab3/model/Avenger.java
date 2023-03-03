package edu.utsa.cs3443.hpz729_lab3.model;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 *
 * @author Mickey Clarke (abc123)
 * UTSA CS 3443
 * - Lab 3 Spring 2023
 */
public class Avenger extends Person {
    private String alias;//Super hero's alias
    private String current_location;//Super hero's current location
    private boolean powers;//Boolean indicating if the hero has powers or not.



    /**
     * @param name - String
     * @param height_feet - int
     * @param height_inches - int
     * @param weight - int
     * @param alias - String
     * @param current_location - String
     * @param powers - Boolean
     */
    public Avenger(String name, String alias, String gender, String height_feet, String height_inches,
                   float weight, Boolean powers, String current_location) {
        super(name, height_feet, height_inches, weight, gender);//Extends person class and inherits name, weight, and height
        this.alias = alias; //Super hero's alias (nickname)
        this.current_location = current_location; //Super hero's current location
        this.powers = powers; //Boolean indicating if the hero has powers or not.
    }


    /**
     * Powers getter
     * @return powers - Boolean indicating if the hero has powers or not.
     */
    public boolean isPowers() {
        return powers;
    }

    /**
     * Powers setter
     * @param powers - Boolean indicating if the hero has powers or not.
     */
    public void setPowers(boolean powers) {
        this.powers = powers;
    }

    /**
     * Current location getter
     * @return current_location - String representing the hero's current location
     */
    public String getCurrent_location() {
        return current_location;
    }

    /**
     * Current location setter
     * @param current_location - String representing the hero's current location.
     */
    public void setCurrent_location(String current_location) {
        this.current_location = current_location;
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
    public void setAlias(String alias) { this.alias = alias;}


    /**
     * Overridden toString method that returns a string representation of an Avenger object.
     * @return s - String representation of an Avengers object
     */
    @Override
    public String toString()
    {
        String s = "Name: " + getName() + "\n Height: " + getHeight_feet() + " ft "
                + getHeight_inches() + " inches" + "\n Weight: " + getWeight()
                + "\n Alias: " + getAlias() + "\n Current Location: " + getCurrent_location() +
                "\n Has super powers?: " + isPowers();

        return s;
    }
}
