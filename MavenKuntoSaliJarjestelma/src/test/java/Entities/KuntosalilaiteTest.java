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
public class KuntosalilaiteTest {
    
    Kuntosalilaite kuntosalilaite;
    
    public KuntosalilaiteTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        kuntosalilaite = new Kuntosalilaite();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getIka method, of class Kuntosalilaite.
     */
    @Test
    public void testGetIka() {
        System.out.println("getIka");
        kuntosalilaite.setIka(3);
        int expResult = 3;
        int result = kuntosalilaite.getIka();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setIka method, of class Kuntosalilaite.
     */
    @Test
    public void testSetIka() {
        System.out.println("setIka");
        kuntosalilaite.setIka(3);
        int expResult = 3;
        int result = kuntosalilaite.getIka();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getKunto method, of class Kuntosalilaite.
     */
    @Test
    public void testGetKunto() {
        System.out.println("getKunto");
        kuntosalilaite.setKunto("HYVÄ");
        String expResult = "HYVÄ";
        String result = kuntosalilaite.getKunto();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setKunto method, of class Kuntosalilaite.
     */
    @Test
    public void testSetKunto() {
        System.out.println("setKunto");
        kuntosalilaite.setKunto("HYVÄ");
        String expResult = "HYVÄ";
        String result = kuntosalilaite.getKunto();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of isTarvitseeHuollon method, of class Kuntosalilaite.
     */
    @Test
    public void testIsTarvitseeHuollon() {
        System.out.println("isTarvitseeHuollon");
        kuntosalilaite.setTarvitseeHuollon(true);
        boolean expResult = true;
        boolean result = kuntosalilaite.isTarvitseeHuollon();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setTarvitseeHuollon method, of class Kuntosalilaite.
     */
    @Test
    public void testSetTarvitseeHuollon() {
        System.out.println("setTarvitseeHuollon");
        kuntosalilaite.setTarvitseeHuollon(true);
        boolean expResult = true;
        boolean result = kuntosalilaite.isTarvitseeHuollon();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getKayttakerrat method, of class Kuntosalilaite.
     */
    @Test
    public void testGetKayttakerrat() {
        System.out.println("getKayttakerrat");
        kuntosalilaite.setKayttakerrat(10);
        int expResult = 10;
        int result = kuntosalilaite.getKayttakerrat();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setKayttakerrat method, of class Kuntosalilaite.
     */
    @Test
    public void testSetKayttakerrat() {
        System.out.println("setKayttakerrat");
        kuntosalilaite.setKayttakerrat(10);
        int expResult = 10;
        int result = kuntosalilaite.getKayttakerrat();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getViimeisinHuoltoPvm method, of class Kuntosalilaite.
     */
    @Test
    public void testGetViimeisinHuoltoPvm() {
        System.out.println("getViimeisinHuoltoPvm");
        kuntosalilaite.setViimeisinHuoltoPvm("PERJANTAI");
        String expResult = "PERJANTAI";
        String result = kuntosalilaite.getViimeisinHuoltoPvm();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setViimeisinHuoltoPvm method, of class Kuntosalilaite.
     */
    @Test
    public void testSetViimeisinHuoltoPvm() {
        System.out.println("setViimeisinHuoltoPvm");
        kuntosalilaite.setViimeisinHuoltoPvm("PERJANTAI");
        String expResult = "PERJANTAI";
        String result = kuntosalilaite.getViimeisinHuoltoPvm();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getTila method, of class Kuntosalilaite.
     */
    @Test
    public void testGetTila() {
        System.out.println("getTila");
        Tila tila = new Tila();
        kuntosalilaite.setTila(tila);
        Tila expResult = tila;
        Tila result = kuntosalilaite.getTila();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setTila method, of class Kuntosalilaite.
     */
    @Test
    public void testSetTila() {
        System.out.println("setTila");
        Tila tila = new Tila();
        kuntosalilaite.setTila(tila);
        Tila expResult = tila;
        Tila result = kuntosalilaite.getTila();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}
