/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package no.ntnu;

import java.util.List;
import java.util.logging.Logger;

/**
 *
 * @author asty
 */
public abstract class Animal
{
    
    // Whether the rabbit is alive or not.
    private boolean alive;
    // The rabbit's position.
    private Location location;
    // The field occupied.
    private Field field;   
    
    private static final Logger log = Logger.getLogger(Animal.class.getName());

    public Animal(Field field, Location location)
    {
        //this.location = location;
        this.field = field;
        this.alive = true;
        setLocation(location);
    }
    
    
    protected Field getField()
    {
        return this.field;
    }
    
    /**
     * Check whether the rabbit is alive or not.
     * @return true if the rabbit is still alive.
     */
    public boolean isAlive()
    {
        return alive;
    }
    
    /**
     * Indicate that the rabbit is no longer alive.
     * It is removed from the field.
     */
    public void setDead()
    {
        alive = false;
        if(location != null) {
            field.clear(location);
            location = null;
            field = null;
        }
    }
        
        /**
     * Return the rabbit's location.
     * @return The rabbit's location.
     */
    public Location getLocation()
    {
        return location;
    }
    
    /**
     * Place the rabbit at the new location in the given field.
     * @param newLocation The rabbit's new location.
     */
    protected final void setLocation(Location newLocation)
    {
        if(location != null) {
            field.clear(location);
        }
        location = newLocation;
        field.place(this, newLocation);
        log.info("Location set to " + this.location.toString());
    }
    
   public abstract void act(List<Animal> newKids);
    
}
