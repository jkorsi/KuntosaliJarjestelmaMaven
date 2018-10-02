/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Juho Suni
 */
public class JasenMaksuTest {
    
    public JasenMaksuTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getKkHinta method, of class JasenMaksu.
     */
    @Test
    public void testGetKkHinta() {
        System.out.println("getKkHinta");
        JasenMaksu instance = new JasenMaksu();
        int expResult = 0;
        int result = instance.getKkHinta();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setKkHinta method, of class JasenMaksu.
     */
    @Test
    public void testSetKkHinta() {
        System.out.println("setKkHinta");
        int kkHinta = 0;
        JasenMaksu instance = new JasenMaksu();
        instance.setKkHinta(kkHinta);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getKertaHinta method, of class JasenMaksu.
     */
    @Test
    public void testGetKertaHinta() {
        System.out.println("getKertaHinta");
        JasenMaksu instance = new JasenMaksu();
        int expResult = 0;
        int result = instance.getKertaHinta();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setKertaHinta method, of class JasenMaksu.
     */
    @Test
    public void testSetKertaHinta() {
        System.out.println("setKertaHinta");
        int kertaHinta = 0;
        JasenMaksu instance = new JasenMaksu();
        instance.setKertaHinta(kertaHinta);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getJasenID method, of class JasenMaksu.
     */
    @Test
    public void testGetJasenID() {
        System.out.println("getJasenID");
        JasenMaksu instance = new JasenMaksu();
        int expResult = 0;
        int result = instance.getJasenID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setJasenID method, of class JasenMaksu.
     */
    @Test
    public void testSetJasenID() {
        System.out.println("setJasenID");
        int jasenID = 0;
        JasenMaksu instance = new JasenMaksu();
        instance.setJasenID(jasenID);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
