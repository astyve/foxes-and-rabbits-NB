/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package no.ntnu;

import java.util.List;

/**
 *
 * @author asty
 */
public class Bear extends Animal
{

    public Bear(Field field, Location location)
    {
        super(field, location);
    }

    @Override
    public void act(List<Animal> newKids)
    {
    }
        
}
