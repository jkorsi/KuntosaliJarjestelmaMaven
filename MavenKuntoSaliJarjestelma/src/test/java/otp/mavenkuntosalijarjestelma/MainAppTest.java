/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package otp.mavenkuntosalijarjestelma;

import javafx.stage.Stage;
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
public class MainAppTest {
    
    public MainAppTest() {
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
     * Test of init method, of class MainApp.
     */
    @Test
    public void testInit() {
        System.out.println("init");
        MainApp instance = new MainApp();
        instance.init();
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of start method, of class MainApp.
     */
    @Test
    public void testStart() throws Exception {
        System.out.println("start");
        Stage stage = null;
        MainApp instance = new MainApp();
        instance.start(stage);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class MainApp.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        MainApp.main(args);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}
