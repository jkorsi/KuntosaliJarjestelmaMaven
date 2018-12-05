/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import static java.lang.System.out;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Juho Suni
 */
public class TilaMaksuTest {
    
    /**
     *
     */
    public TilaMaksuTest() {
    }
    
    TilaMaksu tilamaksu; 
    
    /**
     *
     */
    @BeforeClass
    public static void setUpClass() {
    }
    
    /**
     *
     */
    @AfterClass
    public static void tearDownClass() {
    }
    
    /**
     *
     */
    @Before
    public void setUp() {
        tilamaksu = new TilaMaksu();
    }
    
    /**
     *
     */
    @After
    public void tearDown() {
    }

    /**
     * Test of getTilaID method, of class TilaMaksu.
     */
    @Test
    public void testGetTilaID() {
        out.println("getTilaID");
        tilamaksu.setTilaID(5);
        int expResult = 5;
        int result = tilamaksu.getTilaID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setTilaID method, of class TilaMaksu.
     */
    @Test
    public void testSetTilaID() {
        out.println("setTilaID");
        tilamaksu.setTilaID(5);
        int expResult = 5;
        int result = tilamaksu.getTilaID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    private static final Logger LOG = Logger.getLogger(TilaMaksuTest.class.getName());
    
}
