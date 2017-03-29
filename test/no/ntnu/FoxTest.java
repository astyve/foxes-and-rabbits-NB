/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package no.ntnu;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author arne
 */
public class FoxTest
{
    private Fox fox;
    private Field field;
    private Location location;
    
    public FoxTest()
    {
    }
    
    @BeforeClass
    public static void setUpClass()
    {
    }
    
    @AfterClass
    public static void tearDownClass()
    {
    }
    
    @Before
    public void setUp()
    {
        this.field = new Field(100, 100);
        this.location = new Location(45, 45);
        this.fox = new Fox(true, field, location);
    }
    
    @After
    public void tearDown()
    {
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
        System.out.println("getLocation");
        Location expResult = this.location;
        Location result = this.fox.getLocation();
        assertEquals(expResult, result);
    }
    
}
