/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package otp.mavenkuntosalijarjestelma;

import javafx.event.ActionEvent;
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
public class ControllerTest {
    
    public ControllerTest() {
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
     * Test of initialize method, of class Controller.
     */
    @Test
    public void testInitialize() {
        System.out.println("initialize");
        Controller instance = new Controller();
        instance.initialize();
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of JasenLisausButtonAction method, of class Controller.
     */
    @Test
    public void testJasenLisausButtonAction() {
        System.out.println("JasenLisausButtonAction");
        ActionEvent event = null;
        Controller instance = new Controller();
        instance.JasenLisausButtonAction(event);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of KausiJäsenAction method, of class Controller.
     */
    @Test
    public void testKausiJäsenAction() {
        System.out.println("KausiJ\u00e4senAction");
        ActionEvent event = null;
        Controller instance = new Controller();
        instance.KausiJäsenAction(event);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of Kerrat10Action method, of class Controller.
     */
    @Test
    public void testKerrat10Action() {
        System.out.println("Kerrat10Action");
        ActionEvent event = null;
        Controller instance = new Controller();
        instance.Kerrat10Action(event);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of Kerrat1Action method, of class Controller.
     */
    @Test
    public void testKerrat1Action() {
        System.out.println("Kerrat1Action");
        ActionEvent event = null;
        Controller instance = new Controller();
        instance.Kerrat1Action(event);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of KertaJasenAction method, of class Controller.
     */
    @Test
    public void testKertaJasenAction() {
        System.out.println("KertaJasenAction");
        ActionEvent event = null;
        Controller instance = new Controller();
        instance.KertaJasenAction(event);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of MaksutapaKorttiAction method, of class Controller.
     */
    @Test
    public void testMaksutapaKorttiAction() {
        System.out.println("MaksutapaKorttiAction");
        ActionEvent event = null;
        Controller instance = new Controller();
        instance.MaksutapaKorttiAction(event);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of MaksutapaKäteinenAction method, of class Controller.
     */
    @Test
    public void testMaksutapaKäteinenAction() {
        System.out.println("MaksutapaK\u00e4teinenAction");
        ActionEvent event = null;
        Controller instance = new Controller();
        instance.MaksutapaKäteinenAction(event);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
