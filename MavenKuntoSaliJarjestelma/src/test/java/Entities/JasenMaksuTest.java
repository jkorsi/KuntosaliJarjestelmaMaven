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
public class JasenMaksuTest {
    
    JasenMaksu jasenmaksu;
    
    /**
     *
     */
    public JasenMaksuTest() {
    }
    
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
        jasenmaksu = new JasenMaksu();
    }
    
    /**
     *
     */
    @After
    public void tearDown() {
    }

    /**
     * Test of getKkHinta method, of class JasenMaksu.
     */
    @Test
    public void testGetKkHinta() {
        out.println("getKkHinta");
        jasenmaksu.setKkHinta(20);
        int expResult = 20;
        int result = jasenmaksu.getKkHinta();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setKkHinta method, of class JasenMaksu.
     */
    @Test
    public void testSetKkHinta() {
        out.println("setKkHinta");
        jasenmaksu.setKkHinta(20);
        int expResult = 20;
        int result = jasenmaksu.getKkHinta();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getKertaHinta method, of class JasenMaksu.
     */
    @Test
    public void testGetKertaHinta() {
        out.println("getKertaHinta");
        jasenmaksu.setKertaHinta(5);
        int expResult = 5;
        int result = jasenmaksu.getKertaHinta();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setKertaHinta method, of class JasenMaksu.
     */
    @Test
    public void testSetKertaHinta() {
        out.println("setKertaHinta");
        jasenmaksu.setKertaHinta(5);
        int expResult = 5;
        int result = jasenmaksu.getKertaHinta();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getJasenID method, of class JasenMaksu.
     */
    @Test
    public void testGetJasenID() {
        out.println("getJasenID");
        jasenmaksu.setJasenID(4);
        int expResult = 4;
        int result = jasenmaksu.getJasenID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setJasenID method, of class JasenMaksu.
     */
    @Test
    public void testSetJasenID() {
        out.println("setJasenID");
        out.println("getJasenID");
        jasenmaksu.setJasenID(4);
        int expResult = 4;
        int result = jasenmaksu.getJasenID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    private static final Logger LOG = Logger.getLogger(JasenMaksuTest.class.getName());
    
}
