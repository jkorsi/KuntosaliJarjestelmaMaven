/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package otp.mavenkuntosalijarjestelma;

import static java.lang.System.out;
import java.util.logging.Logger;
import javafx.stage.Stage;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import static otp.mavenkuntosalijarjestelma.MainApp.main;

/**
 *
 * @author Juho Suni
 */
@Ignore
public class MainAppTest {
    
    /**
     *
     */
    public MainAppTest() {
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
     * Test of init method, of class MainApp.
     */
    @Test
    public void testInit() {
        out.println("init");
        MainApp instance = new MainApp();
        instance.init();
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of start method, of class MainApp.
     * @throws java.lang.Exception
     */
    @Test
    public void testStart() throws Exception {
        out.println("start");
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
        out.println("main");
        String[] args = null;
        main(args);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of stop method, of class MainApp.
     */
    @Test
    public void testStop() {
        out.println("stop");
        MainApp instance = new MainApp();
        instance.stop();
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    private static final Logger LOG = Logger.getLogger(MainAppTest.class.getName());
    
}
