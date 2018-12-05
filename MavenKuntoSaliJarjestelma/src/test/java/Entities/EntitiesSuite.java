/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Juho Suni
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({Entities.KuntosalilaiteTest.class, Entities.TilaMaksuTest.class, Entities.JasenMaksuTest.class, Entities.KuukausiJasenTest.class, Entities.JasenTest.class, Entities.MaksuTapahtumaTest.class, Entities.KertaJasenTest.class, Entities.TilaTest.class})
public class EntitiesSuite {

    /**
     *
     * @throws Exception
     */
    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    /**
     *
     * @throws Exception
     */
    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    /**
     *
     * @throws Exception
     */
    @Before
    public void setUp() throws Exception {
    }

    /**
     *
     * @throws Exception
     */
    @After
    public void tearDown() throws Exception {
    }
    private static final Logger LOG = Logger.getLogger(EntitiesSuite.class.getName());
    
}
