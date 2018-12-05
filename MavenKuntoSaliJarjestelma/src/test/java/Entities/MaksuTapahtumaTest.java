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
public class MaksuTapahtumaTest {
    
    MaksuTapahtuma maksutapahtuma;
    
    /**
     *
     */
    public MaksuTapahtumaTest() {
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
        maksutapahtuma = new MaksuTapahtuma();
    }
    
    /**
     *
     */
    @After
    public void tearDown() {
    }

    /**
     * Test of getTapahtumaAika method, of class MaksuTapahtuma.
     */
    @Test
    public void testGetTapahtumaAika() {
        out.println("getTapahtumaAika");
        maksutapahtuma.setTapahtumaAika(01011450);
        int expResult = 01011450;
        int result = maksutapahtuma.getTapahtumaAika();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setTapahtumaAika method, of class MaksuTapahtuma.
     */
    @Test
    public void testSetTapahtumaAika() {
        out.println("setTapahtumaAika");
        maksutapahtuma.setTapahtumaAika(01011450);
        int expResult = 01011450;
        int result = maksutapahtuma.getTapahtumaAika();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getMaara method, of class MaksuTapahtuma.
     */
    @Test
    public void testGetMaara() {
        out.println("getMaara");
        maksutapahtuma.setMaara(2);
        int expResult = 2;
        int result = maksutapahtuma.getMaara();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setMaara method, of class MaksuTapahtuma.
     */
    @Test
    public void testSetMaara() {
        out.println("setMaara");
        maksutapahtuma.setMaara(2);
        int expResult = 2;
        int result = maksutapahtuma.getMaara();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getTuloVaiMeno method, of class MaksuTapahtuma.
     */
    @Test
    public void testGetTuloVaiMeno() {
        out.println("getTuloVaiMeno");
        maksutapahtuma.setTuloVaiMeno(1);
        int expResult = 1;
        int result = maksutapahtuma.getTuloVaiMeno();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setTuloVaiMeno method, of class MaksuTapahtuma.
     */
    @Test
    public void testSetTuloVaiMeno() {
        out.println("setTuloVaiMeno");
        maksutapahtuma.setTuloVaiMeno(1);
        int expResult = 1;
        int result = maksutapahtuma.getTuloVaiMeno();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getKommentti method, of class MaksuTapahtuma.
     */
    @Test
    public void testGetKommentti() {
        out.println("getKommentti");
        maksutapahtuma.setKommentti("Hello");
        String expResult = "Hello";
        String result = maksutapahtuma.getKommentti();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setKommentti method, of class MaksuTapahtuma.
     */
    @Test
    public void testSetKommentti() {
        out.println("setKommentti");
        maksutapahtuma.setKommentti("Hello");
        String expResult = "Hello";
        String result = maksutapahtuma.getKommentti();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getViite method, of class MaksuTapahtuma.
     */
    @Test
    public void testGetViite() {
        out.println("getViite");
        maksutapahtuma.setViite(123456);
        int expResult = 123456;
        int result = maksutapahtuma.getViite();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setViite method, of class MaksuTapahtuma.
     */
    @Test
    public void testSetViite() {
        out.println("setViite");
        maksutapahtuma.setViite(123456);
        int expResult = 123456;
        int result = maksutapahtuma.getViite();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getMaksuTapa method, of class MaksuTapahtuma.
     */
    @Test
    public void testGetMaksuTapa() {
        out.println("getMaksuTapa");
        maksutapahtuma.setMaksuTapa("KORTTI");
        String expResult = "KORTTI";
        String result = maksutapahtuma.getMaksuTapa();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setMaksuTapa method, of class MaksuTapahtuma.
     */
    @Test
    public void testSetMaksuTapa() {
        out.println("setMaksuTapa");
        maksutapahtuma.setMaksuTapa("KORTTI");
        String expResult = "KORTTI";
        String result = maksutapahtuma.getMaksuTapa();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    private static final Logger LOG = Logger.getLogger(MaksuTapahtumaTest.class.getName());
    
}
