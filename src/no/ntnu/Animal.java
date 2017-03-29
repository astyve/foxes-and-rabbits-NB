/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package no.ntnu;

/**
 *
 * @author arne
 */
public class Animal
{
    
    // Whether the animal is alive or not.
    private boolean alive;
    // The animal's position.
    private Location location;
    // The field occupied.
    private Field field;

    public Animal(Field field, Location location)
    {
        this.alive = true;
        this.field = field;
        setLocation(location);
    }

    /**
     * Check whether the animal is alive or not.
     * @return True if the fox is still alive.
     */
    public boolean isAlive()
    {
        return alive;
    }

    /**
     * Return the animal's location.
     * @return The animal's location.
     */
    public Location getLocation()
    {
        return location;
    }

    /**
     * Place the fox at the new location in the given field.
     * @param newLocation The animal's new location.
     */
    protected void setLocation(Location newLocation)
    {
        if (location != null)
        {
            field.clear(location);
        }
        location = newLocation;
        field.place(this, newLocation);
    }

    /**
     * Indicate that the animal is no longer alive.
     * It is removed from the field.
     */
    protected void setDead()
    {
        alive = false;
        if (location != null)
        {
            field.clear(location);
            location = null;
            field = null;
        }
    }
    
    /**
     * Returns the field.
     * @return the field
     */
    protected Field getField()
    {
        return this.field;
    }
    
}
