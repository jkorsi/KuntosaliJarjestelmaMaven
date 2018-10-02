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
public class KuntosalilaiteTest {
    
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
        Kuntosalilaite instance = new Kuntosalilaite();
        int expResult = 0;
        int result = instance.getIka();
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
        int ika = 0;
        Kuntosalilaite instance = new Kuntosalilaite();
        instance.setIka(ika);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getKunto method, of class Kuntosalilaite.
     */
    @Test
    public void testGetKunto() {
        System.out.println("getKunto");
        Kuntosalilaite instance = new Kuntosalilaite();
        String expResult = "";
        String result = instance.getKunto();
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
        String kunto = "";
        Kuntosalilaite instance = new Kuntosalilaite();
        instance.setKunto(kunto);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of isTarvitseeHuollon method, of class Kuntosalilaite.
     */
    @Test
    public void testIsTarvitseeHuollon() {
        System.out.println("isTarvitseeHuollon");
        Kuntosalilaite instance = new Kuntosalilaite();
        boolean expResult = false;
        boolean result = instance.isTarvitseeHuollon();
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
        boolean tarvitseeHuollon = false;
        Kuntosalilaite instance = new Kuntosalilaite();
        instance.setTarvitseeHuollon(tarvitseeHuollon);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getKayttakerrat method, of class Kuntosalilaite.
     */
    @Test
    public void testGetKayttakerrat() {
        System.out.println("getKayttakerrat");
        Kuntosalilaite instance = new Kuntosalilaite();
        int expResult = 0;
        int result = instance.getKayttakerrat();
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
        int kayttakerrat = 0;
        Kuntosalilaite instance = new Kuntosalilaite();
        instance.setKayttakerrat(kayttakerrat);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getViimeisinHuoltoPvm method, of class Kuntosalilaite.
     */
    @Test
    public void testGetViimeisinHuoltoPvm() {
        System.out.println("getViimeisinHuoltoPvm");
        Kuntosalilaite instance = new Kuntosalilaite();
        String expResult = "";
        String result = instance.getViimeisinHuoltoPvm();
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
        String viimeisinHuoltoPvm = "";
        Kuntosalilaite instance = new Kuntosalilaite();
        instance.setViimeisinHuoltoPvm(viimeisinHuoltoPvm);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getTila method, of class Kuntosalilaite.
     */
    @Test
    public void testGetTila() {
        System.out.println("getTila");
        Kuntosalilaite instance = new Kuntosalilaite();
        Tila expResult = null;
        Tila result = instance.getTila();
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
        Tila tila = null;
        Kuntosalilaite instance = new Kuntosalilaite();
        instance.setTila(tila);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}
