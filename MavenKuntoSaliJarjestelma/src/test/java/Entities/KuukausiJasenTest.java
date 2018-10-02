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
public class KuukausiJasenTest {
    
    public KuukausiJasenTest() {
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
     * Test of getKuukausiaJaljella method, of class KuukausiJasen.
     */
    @Test
    public void testGetKuukausiaJaljella() {
        System.out.println("getKuukausiaJaljella");
        KuukausiJasen instance = new KuukausiJasen();
        int expResult = 0;
        int result = instance.getKuukausiaJaljella();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setKuukausiaJaljella method, of class KuukausiJasen.
     */
    @Test
    public void testSetKuukausiaJaljella() {
        System.out.println("setKuukausiaJaljella");
        int kuukausiaJaljella = 0;
        KuukausiJasen instance = new KuukausiJasen();
        instance.setKuukausiaJaljella(kuukausiaJaljella);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
