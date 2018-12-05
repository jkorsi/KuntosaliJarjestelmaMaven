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
public class KertaJasenTest {
    
    KertaJasen kertajasen;
    
    /**
     *
     */
    public KertaJasenTest() {
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
        kertajasen = new KertaJasen();
    }
    
    /**
     *
     */
    @After
    public void tearDown() {
    }

    /**
     * Test of getKayntikertojaJaljella method, of class KertaJasen.
     */
    @Test
    public void testGetKayntikertojaJaljella() {
        out.println("getKayntikertojaJaljella");
        kertajasen.setKayntikertojaJaljella(10);
        int expResult = 10;
        int result = kertajasen.getKayntikertojaJaljella();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setKayntikertojaJaljella method, of class KertaJasen.
     */
    @Test
    public void testSetKayntikertojaJaljella() {
        out.println("setKayntikertojaJaljella");
        kertajasen.setKayntikertojaJaljella(10);
        int expResult = 10;
        int result = kertajasen.getKayntikertojaJaljella();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    private static final Logger LOG = Logger.getLogger(KertaJasenTest.class.getName());
    
}
