/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package no.ntnu;

import java.util.List;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author asty
 */
public class FoxTest
{
    
    public FoxTest()
    {
    }
    
    @Before
    public void setUp()
    {
    }

    /**
     * Test of hunt method, of class Fox.
     */
    @Test
    public void testHunt()
    {
        System.out.println("hunt");
        List<Animal> newFoxes = null;
        Fox instance = null;
        instance.act(newFoxes);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
