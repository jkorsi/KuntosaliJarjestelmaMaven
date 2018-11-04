/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package otp.mavenkuntosalijarjestelma;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import org.hibernate.SessionFactory;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;
import static org.loadui.testfx.Assertions.verifyThat;
import org.loadui.testfx.GuiTest;
import static org.loadui.testfx.controls.TableViews.containsCell;

/**
 *
 * @author Juho Suni
 */
//@Ignore
public class FXMLControllerTest extends GuiTest {

    long time = System.currentTimeMillis();
    String sTime = Long.toString(time);

    public FXMLControllerTest() {
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

    @Override
    protected Parent getRootNode() {
        Parent parent = null;
        try {
            parent = FXMLLoader.load(getClass().getResource("/fxml/Scene.fxml"));
        } catch (IOException ex) {
            Logger.getLogger(FXMLControllerTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        return parent;

    }

    @Test
    public void testLisaaJasen() {
        TextField nimi = find("#JasenNimiField");
        click(nimi);
        type(sTime);

        RadioButton kkJas = find("#KausiJasen");
        click(kkJas);

        RadioButton kk1 = find("#Aikaa1KK");
        click(kk1);

        RadioButton mTapa = find("#MaksuKateinen");
        click(mTapa);

        Button lisBtn = find("#JasenLisausButton");
        click(lisBtn);

        verifyThat(".table-view", containsCell(sTime));

    }

    /**
     * Test of getSessionFactory method, of class FXMLController.
     */
    @Test
    public void testGetSessionFactory() {
        System.out.println("getSessionFactory");
        FXMLController instance = new FXMLController();
        SessionFactory expResult = instance.getSessionFactory();
        SessionFactory result = instance.getSessionFactory();
        assertEquals(expResult, result);

    }

    /**
     * Test of Aikaa1KKAction method, of class FXMLController.
     */
    @Test
    public void testAikaa1KKAction() {
        System.out.println("Aikaa1KKAction");
        ActionEvent event = null;
        FXMLController instance = new FXMLController();
        instance.Aikaa1KKAction(event);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of Aikaa3KKAction method, of class FXMLController.
     */
    @Test
    public void testAikaa3KKAction() {
        System.out.println("Aikaa3KKAction");
        ActionEvent event = null;
        FXMLController instance = new FXMLController();
        instance.Aikaa3KKAction(event);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of JasenLisausButtonAction method, of class FXMLController.
     */
    @Ignore
    @Test
    public void testJasenLisausButtonAction() {
        System.out.println("JasenLisausButtonAction");
        ActionEvent event = null;
        FXMLController instance = new FXMLController();
        instance.JasenLisausButtonAction(event);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of JasenPoistoButtonAction method, of class FXMLController.
     */
    @Ignore
    @Test
    public void testJasenPoistoButtonAction() {
        
        

    }

    /**
     * Test of KausiJäsenAction method, of class FXMLController.
     */
    @Ignore
    @Test
    public void testKausiJäsenAction() {
        System.out.println("KausiJ\u00e4senAction");
        ActionEvent event = null;
        FXMLController instance = new FXMLController();
        instance.KausiJäsenAction(event);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of Kerrat10Action method, of class FXMLController.
     */
    @Test
    public void testKerrat10Action() {
        System.out.println("Kerrat10Action");
        ActionEvent event = null;
        FXMLController instance = new FXMLController();
        instance.Kerrat10Action(event);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of Kerrat1Action method, of class FXMLController.
     */
    @Test
    public void testKerrat1Action() {
        System.out.println("Kerrat1Action");
        ActionEvent event = null;
        FXMLController instance = new FXMLController();
        instance.Kerrat1Action(event);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of KertaJasenAction method, of class FXMLController.
     */
    @Ignore
    @Test
    public void testKertaJasenAction() {
        System.out.println("KertaJasenAction");
        ActionEvent event = null;
        FXMLController instance = new FXMLController();
        instance.KertaJasenAction(event);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of MaksutapaKorttiAction method, of class FXMLController.
     */
    @Test
    public void testMaksutapaKorttiAction() {
        System.out.println("MaksutapaKorttiAction");
        ActionEvent event = null;
        FXMLController instance = new FXMLController();
        instance.MaksutapaKorttiAction(event);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of MaksutapaKäteinenAction method, of class FXMLController.
     */
    @Test
    public void testMaksutapaKäteinenAction() {
        System.out.println("MaksutapaKäteinenAction");
        ActionEvent event = null;
        FXMLController instance = new FXMLController();
        instance.MaksutapaKäteinenAction(event);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of initialize method, of class FXMLController.
     */
    @Ignore
    @Test
    public void testInitialize() {
        System.out.println("initialize");
        FXMLController instance = new FXMLController();
        instance.initialize();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

}
