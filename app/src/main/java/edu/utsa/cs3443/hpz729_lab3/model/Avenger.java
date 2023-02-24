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
    private String alias;//Extends person class and inherits name, weight, and height
    private String current_location;//Super hero's current location
    private boolean powers;//Boolean indicating if the hero has powers or not.



    /**
     * @param name - String
     * @param height - int
     * @param weight - int
     * @param alias - String
     * @param current_location - String
     * @param powers - Boolean
     */
    public Avenger(String name, int height, int weight, String alias,
                   String current_location, boolean powers) {
        super(name, height, weight);//Extends person class and inherits name, weight, and height
        this.alias = alias; //Super hero's alias (nickname)
        this.current_location = current_location; //Super hero's current location
        this.powers = powers; //Boolean indicating if the hero has powers or not.
    }

    /**
     * @return powers - Boolean indicating if the hero has powers or not.
     */
    public boolean isPowers() {
        return powers;
    }

    /**
     * @param powers - Boolean indicating if the hero has powers or not.
     */
    public void setPowers(boolean powers) {
        this.powers = powers;
    }

    /**
     * @return current_location - String representing the hero's current location
     */
    public String getCurrent_location() {
        return current_location;
    }

    /**
     * @param current_location - String representing the hero's current location.
     */
    public void setCurrent_location(String current_location) {
        this.current_location = current_location;
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
    public void setAlias(String alias) { this.alias = alias;}


    /**
     * @return s - String representation of an Avengers object
     */
    @Override
    public String toString()
    {
        String s = "Name: " + getName() + "\n Height: " + getHeight() + "\n Weight: " + getWeight()
                + "\n Alias: " + getAlias() + "\n Current Location: " + getCurrent_location() +
                "\n Has super powers?: " + isPowers();

        return s;
    }
}
