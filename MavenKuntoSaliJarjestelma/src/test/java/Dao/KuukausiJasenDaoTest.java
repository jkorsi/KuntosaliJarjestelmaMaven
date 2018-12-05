/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Entities.KuukausiJasen;
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
public class KuukausiJasenDaoTest {
    
    /**
     *
     */
    public KuukausiJasenDaoTest() {
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
    }
    
    /**
     *
     */
    @After
    public void tearDown() {
    }
    
    /**
     * Test of createKuukausiJasen method, of class KuukausiJasenDao.
     */
    @Test
    public void testCreateKuukausiJasen() {
        out.println("createKuukausiJasen");
        KuukausiJasen jasen = null;
        KuukausiJasenDao instance = null;
        instance.createKuukausiJasen(jasen);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of deleteKuukausiJasen method, of class KuukausiJasenDao.
     */
    @Test
    public void testDeleteKuukausiJasen() {
        out.println("deleteKuukausiJasen");
        int JasenId = 0;
        KuukausiJasenDao instance = null;
        instance.deleteKuukausiJasen(JasenId);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of updateKuukausiJasen method, of class KuukausiJasenDao.
     */
    @Test
    public void testUpdateKuukausiJasen() {
        out.println("updateKuukausiJasen");
        KuukausiJasen jasen = null;
        KuukausiJasenDao instance = null;
        instance.updateKuukausiJasen(jasen);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getKuukausiJasen method, of class KuukausiJasenDao.
     */
    @Test
    public void testGetKuukausiJasen() {
        out.println("getKuukausiJasen");
        int jasenId = 0;
        KuukausiJasenDao instance = null;
        KuukausiJasen expResult = null;
        KuukausiJasen result = instance.getKuukausiJasen(jasenId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getALLKuukausiJasen method, of class KuukausiJasenDao.
     */
    @Test
    public void testGetALLKuukausiJasen() {
        out.println("getALLKuukausiJasen");
        KuukausiJasenDao instance = null;
        List<KuukausiJasen> expResult = null;
        List<KuukausiJasen> result = instance.getALLKuukausiJasen();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    private static final Logger LOG = Logger.getLogger(KuukausiJasenDaoTest.class.getName());
    
}
