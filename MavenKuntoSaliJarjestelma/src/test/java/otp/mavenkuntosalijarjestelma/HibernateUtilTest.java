/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package otp.mavenkuntosalijarjestelma;

import static java.lang.System.out;
import java.util.logging.Logger;
import org.hibernate.SessionFactory;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import static otp.mavenkuntosalijarjestelma.HibernateUtil.getSessionFactory;
import static otp.mavenkuntosalijarjestelma.HibernateUtil.shutdown;

/**
 *
 * @author Juho Suni
 */
@Ignore
public class HibernateUtilTest {
    
    /**
     *
     */
    public HibernateUtilTest() {
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
     * Test of getSessionFactory method, of class HibernateUtil.
     */
    @Test
    public void testGetSessionFactory() {
        out.println("getSessionFactory");
        SessionFactory expResult = null;
        SessionFactory result = getSessionFactory();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of shutdown method, of class HibernateUtil.
     */
    @Test
    public void testShutdown() {
        out.println("shutdown");
        shutdown();
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    private static final Logger LOG = Logger.getLogger(HibernateUtilTest.class.getName());
    
}
