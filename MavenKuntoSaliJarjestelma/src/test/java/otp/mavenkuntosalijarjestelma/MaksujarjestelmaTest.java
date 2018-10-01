/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package otp.mavenkuntosalijarjestelma;

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
public class MaksujarjestelmaTest {
    
    public MaksujarjestelmaTest() {
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
     * Test of getMaksuJarjestelmaID method, of class Maksujarjestelma.
     */
    @Test
    public void testGetMaksuJarjestelmaID() {
        System.out.println("getMaksuJarjestelmaID");
        Maksujarjestelma instance = new Maksujarjestelma();
        int expResult = 0;
        int result = instance.getMaksuJarjestelmaID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMaksuJarjestelmaID method, of class Maksujarjestelma.
     */
    @Test
    public void testSetMaksuJarjestelmaID() {
        System.out.println("setMaksuJarjestelmaID");
        int maksuJarjestelmaID = 0;
        Maksujarjestelma instance = new Maksujarjestelma();
        instance.setMaksuJarjestelmaID(maksuJarjestelmaID);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTilillaJaljella method, of class Maksujarjestelma.
     */
    @Test
    public void testGetTilillaJaljella() {
        System.out.println("getTilillaJaljella");
        Maksujarjestelma instance = new Maksujarjestelma();
        int expResult = 0;
        int result = instance.getTilillaJaljella();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTilillaJaljella method, of class Maksujarjestelma.
     */
    @Test
    public void testSetTilillaJaljella() {
        System.out.println("setTilillaJaljella");
        int tilillaJaljella = 0;
        Maksujarjestelma instance = new Maksujarjestelma();
        instance.setTilillaJaljella(tilillaJaljella);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTulot method, of class Maksujarjestelma.
     */
    @Test
    public void testGetTulot() {
        System.out.println("getTulot");
        Maksujarjestelma instance = new Maksujarjestelma();
        int expResult = 0;
        int result = instance.getTulot();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTulot method, of class Maksujarjestelma.
     */
    @Test
    public void testSetTulot() {
        System.out.println("setTulot");
        int tulot = 0;
        Maksujarjestelma instance = new Maksujarjestelma();
        instance.setTulot(tulot);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMenot method, of class Maksujarjestelma.
     */
    @Test
    public void testGetMenot() {
        System.out.println("getMenot");
        Maksujarjestelma instance = new Maksujarjestelma();
        int expResult = 0;
        int result = instance.getMenot();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMenot method, of class Maksujarjestelma.
     */
    @Test
    public void testSetMenot() {
        System.out.println("setMenot");
        int menot = 0;
        Maksujarjestelma instance = new Maksujarjestelma();
        instance.setMenot(menot);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
