/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Entities.KertaJasen;
import static java.lang.System.out;
import java.util.List;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

/**
 *
 * @author Juho Suni
 */
@Ignore
public class KertaJasenDaoTest {
    
    /**
     *
     */
    public KertaJasenDaoTest() {
    }

    /**
     *
     */
    @Ignore
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
    }
    
    /**
     *
     */
    @After
    public void tearDown() {
    }

    /**
     * Test of createKertaJasen method, of class KertaJasenDao.
     */
    @Test
    public void testCreateKertaJasen() {
        out.println("createKertaJasen");
        KertaJasen jasen = null;
        KertaJasenDao instance = null;
        instance.createKertaJasen(jasen);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of deleteKertaJasen method, of class KertaJasenDao.
     */
    @Test
    public void testDeleteKertaJasen() {
        out.println("deleteKertaJasen");
        int JasenId = 0;
        KertaJasenDao instance = null;
        instance.deleteKertaJasen(JasenId);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of updateKertaJasen method, of class KertaJasenDao.
     */
    @Test
    public void testUpdateKertaJasen() {
        out.println("updateKertaJasen");
        KertaJasen jasen = null;
        KertaJasenDao instance = null;
        instance.updateKertaJasen(jasen);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getKertajasen method, of class KertaJasenDao.
     */
    @Test
    public void testGetKertajasen() {
        out.println("getKertajasen");
        int jasenId = 0;
        KertaJasenDao instance = null;
        KertaJasen expResult = null;
        KertaJasen result = instance.getKertajasen(jasenId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getALLKertajasen method, of class KertaJasenDao.
     */
    @Test
    public void testGetALLKertajasen() {
        out.println("getALLKertajasen");
        KertaJasenDao instance = null;
        List<KertaJasen> expResult = null;
        List<KertaJasen> result = instance.getALLKertajasen();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    private static final Logger LOG = Logger.getLogger(KertaJasenDaoTest.class.getName());
    
}
