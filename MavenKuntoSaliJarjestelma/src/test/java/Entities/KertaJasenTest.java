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
public class KertaJasenTest {
    
    public KertaJasenTest() {
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
     * Test of getKayntikertojaJaljella method, of class KertaJasen.
     */
    @Test
    public void testGetKayntikertojaJaljella() {
        System.out.println("getKayntikertojaJaljella");
        KertaJasen instance = new KertaJasen();
        int expResult = 0;
        int result = instance.getKayntikertojaJaljella();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setKayntikertojaJaljella method, of class KertaJasen.
     */
    @Test
    public void testSetKayntikertojaJaljella() {
        System.out.println("setKayntikertojaJaljella");
        int kayntikertojaJaljella = 0;
        KertaJasen instance = new KertaJasen();
        instance.setKayntikertojaJaljella(kayntikertojaJaljella);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
