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
public class MaksuTapahtumaTest {
    
    public MaksuTapahtumaTest() {
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
     * Test of getTapahtumaAika method, of class MaksuTapahtuma.
     */
    @Test
    public void testGetTapahtumaAika() {
        System.out.println("getTapahtumaAika");
        MaksuTapahtuma instance = new MaksuTapahtuma();
        int expResult = 0;
        int result = instance.getTapahtumaAika();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setTapahtumaAika method, of class MaksuTapahtuma.
     */
    @Test
    public void testSetTapahtumaAika() {
        System.out.println("setTapahtumaAika");
        int tapahtumaAika = 0;
        MaksuTapahtuma instance = new MaksuTapahtuma();
        instance.setTapahtumaAika(tapahtumaAika);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getMaara method, of class MaksuTapahtuma.
     */
    @Test
    public void testGetMaara() {
        System.out.println("getMaara");
        MaksuTapahtuma instance = new MaksuTapahtuma();
        int expResult = 0;
        int result = instance.getMaara();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setMaara method, of class MaksuTapahtuma.
     */
    @Test
    public void testSetMaara() {
        System.out.println("setMaara");
        int maara = 0;
        MaksuTapahtuma instance = new MaksuTapahtuma();
        instance.setMaara(maara);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getTuloVaiMeno method, of class MaksuTapahtuma.
     */
    @Test
    public void testGetTuloVaiMeno() {
        System.out.println("getTuloVaiMeno");
        MaksuTapahtuma instance = new MaksuTapahtuma();
        int expResult = 0;
        int result = instance.getTuloVaiMeno();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setTuloVaiMeno method, of class MaksuTapahtuma.
     */
    @Test
    public void testSetTuloVaiMeno() {
        System.out.println("setTuloVaiMeno");
        int tuloVaiMeno = 0;
        MaksuTapahtuma instance = new MaksuTapahtuma();
        instance.setTuloVaiMeno(tuloVaiMeno);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getKommentti method, of class MaksuTapahtuma.
     */
    @Test
    public void testGetKommentti() {
        System.out.println("getKommentti");
        MaksuTapahtuma instance = new MaksuTapahtuma();
        String expResult = "";
        String result = instance.getKommentti();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setKommentti method, of class MaksuTapahtuma.
     */
    @Test
    public void testSetKommentti() {
        System.out.println("setKommentti");
        String kommentti = "";
        MaksuTapahtuma instance = new MaksuTapahtuma();
        instance.setKommentti(kommentti);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getViite method, of class MaksuTapahtuma.
     */
    @Test
    public void testGetViite() {
        System.out.println("getViite");
        MaksuTapahtuma instance = new MaksuTapahtuma();
        int expResult = 0;
        int result = instance.getViite();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setViite method, of class MaksuTapahtuma.
     */
    @Test
    public void testSetViite() {
        System.out.println("setViite");
        int viite = 0;
        MaksuTapahtuma instance = new MaksuTapahtuma();
        instance.setViite(viite);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getMaksuTapa method, of class MaksuTapahtuma.
     */
    @Test
    public void testGetMaksuTapa() {
        System.out.println("getMaksuTapa");
        MaksuTapahtuma instance = new MaksuTapahtuma();
        String expResult = "";
        String result = instance.getMaksuTapa();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setMaksuTapa method, of class MaksuTapahtuma.
     */
    @Test
    public void testSetMaksuTapa() {
        System.out.println("setMaksuTapa");
        String maksuTapa = "";
        MaksuTapahtuma instance = new MaksuTapahtuma();
        instance.setMaksuTapa(maksuTapa);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}
