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
import org.junit.Ignore;

/**
 *
 * @author Juho Suni
 */
@Ignore
public class JasenTest {
    
    public JasenTest() {
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
     * Test of getNimi method, of class Jasen.
     */
    @Test
    public void testGetNimi() {
        System.out.println("getNimi");
        Jasen instance = new JasenImpl();
        String expResult = "";
        String result = instance.getNimi();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setNimi method, of class Jasen.
     */
    @Test
    public void testSetNimi() {
        System.out.println("setNimi");
        String nimi = "";
        Jasen instance = new JasenImpl();
        instance.setNimi(nimi);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getJasenID method, of class Jasen.
     */
    @Test
    public void testGetJasenID() {
        System.out.println("getJasenID");
        Jasen instance = new JasenImpl();
        int expResult = 0;
        int result = instance.getJasenID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setJasenID method, of class Jasen.
     */
    @Test
    public void testSetJasenID() {
        System.out.println("setJasenID");
        int jasenID = 0;
        Jasen instance = new JasenImpl();
        instance.setJasenID(jasenID);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getMaksuTapa method, of class Jasen.
     */
    @Test
    public void testGetMaksuTapa() {
        System.out.println("getMaksuTapa");
        Jasen instance = new JasenImpl();
        String expResult = "";
        String result = instance.getMaksuTapa();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setMaksuTapa method, of class Jasen.
     */
    @Test
    public void testSetMaksuTapa() {
        System.out.println("setMaksuTapa");
        String maksuTapa = "";
        Jasen instance = new JasenImpl();
        instance.setMaksuTapa(maksuTapa);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of isOnkoJasenyysVoimassa method, of class Jasen.
     */
    @Test
    public void testIsOnkoJasenyysVoimassa() {
        System.out.println("isOnkoJasenyysVoimassa");
        Jasen instance = new JasenImpl();
        boolean expResult = false;
        boolean result = instance.isOnkoJasenyysVoimassa();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setOnkoJasenyysVoimassa method, of class Jasen.
     */
    @Test
    public void testSetOnkoJasenyysVoimassa() {
        System.out.println("setOnkoJasenyysVoimassa");
        boolean onkoJasenyysVoimassa = false;
        Jasen instance = new JasenImpl();
        instance.setOnkoJasenyysVoimassa(onkoJasenyysVoimassa);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    public class JasenImpl extends Jasen {
    }
    
}
