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

public class KuukausiJasenTest {
    
    KuukausiJasen kuukausijasen;
    
    /**
     *
     */
    public KuukausiJasenTest() {
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
        kuukausijasen = new KuukausiJasen();
    }
    
    /**
     *
     */
    @After
    public void tearDown() {
    }

    /**
     * Test of getKuukausiaJaljella method, of class KuukausiJasen.
     */
    @Test
    public void testGetKuukausiaJaljella() {
        out.println("getKuukausiaJaljella");
        kuukausijasen.setKuukausiaJaljella(3);
        int expResult = 3;
        int result = kuukausijasen.getKuukausiaJaljella();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setKuukausiaJaljella method, of class KuukausiJasen.
     */
    @Test
    public void testSetKuukausiaJaljella() {
        out.println("setKuukausiaJaljella");
        kuukausijasen.setKuukausiaJaljella(3);
        int expResult = 3;
        int result = kuukausijasen.getKuukausiaJaljella();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    private static final Logger LOG = Logger.getLogger(KuukausiJasenTest.class.getName());
    
}
