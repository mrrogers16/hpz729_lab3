package edu.utsa.cs3443.hpz729_lab3.model;

/**
 * @author Mickey Clarke hpz729
 */
public class Avenger extends Person
{
    private String alias;
    private String current_location;
    private boolean powers;

    /**
     * @param name
     * @param height
     * @param weight
     * @param alias
     * @param current_location
     * @param powers
     */
    public Avenger(String name, int height, int weight, String alias,
                   String current_location, boolean powers)
    {
        super(name, height, weight);
        this.alias = alias;
        this.current_location = current_location;
        this.powers = powers;
    }
    /**
     * @return
     */
    public boolean isPowers() {
        return powers;
    }
    /**
     * @param powers
     */
    public void setPowers(boolean powers) {
        this.powers = powers;
    }

    /**
     * @return
     */
    public String getCurrent_location() {
        return current_location;
    }

    /**
     * @param current_location
     */
    public void setCurrent_location(String current_location) {
        this.current_location = current_location;
    }

    /**
     * @return
     */
    public String getAlias() {
        return alias;
    }

    /**
     * @param alias
     */
    public void setAlias(String alias) {
        this.alias = alias;
    }
}
