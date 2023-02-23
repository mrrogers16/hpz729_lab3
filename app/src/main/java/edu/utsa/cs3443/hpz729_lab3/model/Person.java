package edu.utsa.cs3443.hpz729_lab3.model;

/**
 * TODO//toString()
 *
 *
 *
 *
 * @author Mickey Clarke (abc123)
 * UTSA CS 3443
 * - Lab 1 Spring 2023
 *
 */
public abstract class Person
{
    private String name; //Persons name
    private int height; //Persons height
    private int weight; //Persons weight

    /**
     * Person constructor
     * @param name
     * @param height
     * @param weight
     */
    public Person(String name, int height, int weight)
    {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    /**
     * @return s
     */
    public String toString()
    {
        //TODO
        String s = "";
        return s;
    }


    /**
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return
     */
    public int getHeight() {
        return height;
    }

    /**
     * @param height
     */
    public void setHeight(int height) {
        this.height = height;
    }

    /**
     * @return
     */
    public int getWeight() {
        return weight;
    }

    /**
     * @param weight
     */
    public void setWeight(int weight) {
        this.weight = weight;
    }
}

