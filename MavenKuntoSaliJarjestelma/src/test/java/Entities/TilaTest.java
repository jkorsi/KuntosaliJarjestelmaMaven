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
public class TilaTest {
    
    public TilaTest() {
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
     * Test of getTilaID method, of class Tila.
     */
    @Test
    public void testGetTilaID() {
        System.out.println("getTilaID");
        Tila instance = new Tila();
        int expResult = 0;
        int result = instance.getTilaID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setTilaID method, of class Tila.
     */
    @Test
    public void testSetTilaID() {
        System.out.println("setTilaID");
        int tilaID = 0;
        Tila instance = new Tila();
        instance.setTilaID(tilaID);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getSuosituinKuntoSaliLaite method, of class Tila.
     */
    @Test
    public void testGetSuosituinKuntoSaliLaite() {
        System.out.println("getSuosituinKuntoSaliLaite");
        Tila instance = new Tila();
        int expResult = 0;
        int result = instance.getSuosituinKuntoSaliLaite();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setSuosituinKuntoSaliLaite method, of class Tila.
     */
    @Test
    public void testSetSuosituinKuntoSaliLaite() {
        System.out.println("setSuosituinKuntoSaliLaite");
        int suosituinKuntoSaliLaite = 0;
        Tila instance = new Tila();
        instance.setSuosituinKuntoSaliLaite(suosituinKuntoSaliLaite);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getLaitteidenMaara method, of class Tila.
     */
    @Test
    public void testGetLaitteidenMaara() {
        System.out.println("getLaitteidenMaara");
        Tila instance = new Tila();
        int expResult = 0;
        int result = instance.getLaitteidenMaara();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setLaitteidenMaara method, of class Tila.
     */
    @Test
    public void testSetLaitteidenMaara() {
        System.out.println("setLaitteidenMaara");
        int laitteidenMaara = 0;
        Tila instance = new Tila();
        instance.setLaitteidenMaara(laitteidenMaara);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getTilanKulut method, of class Tila.
     */
    @Test
    public void testGetTilanKulut() {
        System.out.println("getTilanKulut");
        Tila instance = new Tila();
        int expResult = 0;
        int result = instance.getTilanKulut();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setTilanKulut method, of class Tila.
     */
    @Test
    public void testSetTilanKulut() {
        System.out.println("setTilanKulut");
        int tilanKulut = 0;
        Tila instance = new Tila();
        instance.setTilanKulut(tilanKulut);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getKuntosalilaite method, of class Tila.
     */
    @Test
    public void testGetKuntosalilaite() {
        System.out.println("getKuntosalilaite");
        Tila instance = new Tila();
        Kuntosalilaite[] expResult = null;
        Kuntosalilaite[] result = instance.getKuntosalilaite();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setKuntosalilaite method, of class Tila.
     */
    @Test
    public void testSetKuntosalilaite() {
        System.out.println("setKuntosalilaite");
        Kuntosalilaite[] kuntosalilaite = null;
        Tila instance = new Tila();
        instance.setKuntosalilaite(kuntosalilaite);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}
