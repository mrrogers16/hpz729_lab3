package edu.utsa.cs3443.hpz729_lab3.model;

/**
 * The Person.java class is abstract and contains a String name, int height, and int weight.
 * It contains an overridden toString() method that returns a String representation of a Person
 * as well as all getters and setters.
 *
 *
 * @author Mickey Clarke (abc123)
 * UTSA CS 3443
 * - Lab 1 Spring 2023
 */
public abstract class Person {
    private String name; //Persons name
    private int height; //Persons height
    private int weight; //Persons weight

    /**
     * Person constructor
     *
     * @param name - String
     * @param height - int
     * @param weight - int
     */
    public Person(String name, int height, int weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    /**
     * @return s - String representation of a person object
     */
    @Override
    public String toString() {
        //TODO
        String s = "Name: " + getName() + "\n Height: " + getHeight() + "\n Weight: " + getWeight();
        return s;
    }


    /**
     * @return - String name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name - String
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return - int height
     */
    public int getHeight() {
        return height;
    }

    /**
     * @param height - int
     */
    public void setHeight(int height) {
        this.height = height;
    }

    /**
     * @return - int weight
     */
    public int getWeight() {
        return weight;
    }

    /**
     * @param weight - int
     */
    public void setWeight(int weight) {
        this.weight = weight;
    }
}

