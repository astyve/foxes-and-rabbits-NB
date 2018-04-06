/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package no.ntnu;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author asty
 */
public class FoxTest
{
    Fox fox;
    Location location;
    Field field;
    
    public FoxTest()
    {
    }
    
    @Before
    public void setUp()
    {
        field = new Field(100, 100);
        location = new Location(45, 45);
        fox = new Fox(true, field, location);
    }

    /**
     * Test of hunt method, of class Fox.
     */
    @Test
    public void testHunt()
    {
        fail("Test not implemented");
    }

    /**
     * Test of isAlive method, of class Fox.
     */
    @Test
    public void testIsAlive()
    {
        System.out.println("isAlive");
        
        boolean expResult = true;
        boolean result = this.fox.isAlive();
        assertEquals(expResult, result);
    }

    /**
     * Test of getLocation method, of class Fox.
     */
    @Test
    public void testGetLocation()
    {
        System.out.println("getLocation()");
        Location expResult = this.location;
        Location result = this.fox.getLocation();
        // Since Location has redefined equals()
        // and hashCode(), we can now compare
        assertEquals(expResult, result);
    }
    
}
