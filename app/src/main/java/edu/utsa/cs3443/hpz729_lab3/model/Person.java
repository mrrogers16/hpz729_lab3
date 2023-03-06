package edu.utsa.cs3443.hpz729_lab3.model;

/**
 * The Person.java class is abstract and contains a String name, int height, and int weight.
 * It contains an overridden toString() method that returns a String representation of a Person
 * as well as all getters and setters.
 *
 * @author Mickey Clarke (abc123)
 * UTSA CS 3443
 * - Lab 1 Spring 2023
 */
public abstract class Person {
    private String name; //Persons name
    private String height_inches;
    private String height_feet;//Persons height
    private float weight; //Persons weight
    private String gender;
    /**
     * Person constructor
     *
     * @param name          - String
     * @param height_inches - int
     * @param height_feet   - int
     * @param weight        - float
     */
    public Person(String name, String height_inches, String height_feet, float weight, String gender) {
        this.name = name;
        this.height_inches = height_inches;
        this.height_feet = height_feet;
        this.weight = weight;
        this.gender = gender;
    }

    /**
     * Overridden toString method that returns a string representation of a Person object.
     * @return s - String representation of a person object
     */
    @Override
    public String toString() {

        String s = "Name: " + getName() + "\n Height: " + getHeight_feet() + " "
                + getHeight_inches() + "\n Weight: " + getWeight();
        return s;
    }


    /**
     * Name getter
     * @return name - String
     */
    public String getName() {
        return name;
    }

    /**
     * Name setter
     * @param name - String
     */
    public void setName(String name) {
        this.name = name;
    }


    public float getWeight() {
        return weight;
    }

    /**
     * Weight setter
     * @param weight - int
     */
    public void setWeight(float weight) {
        this.weight = weight;
    }

    /**
     * height_inches getter
     * @return height_inches - String
     */
    public String getHeight_inches() {
        return height_inches;
    }

    /**
     * height_inches setter
     * @param height_inches - String
     */
    public void setHeight_inches(String height_inches) {
        this.height_inches = height_inches;
    }

    /**
     * height_feet getter
     * @return height_feet - String
     */
    public String getHeight_feet() {
        return height_feet;
    }

    /**
     * height_feet setter
     * @param height_feet - String
     */
    public void setHeight_feet(String height_feet) {
        this.height_feet = height_feet;
    }
}

