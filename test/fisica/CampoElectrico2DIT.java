/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fisica;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Miguel
 */
public class CampoElectrico2DIT {
    
    public CampoElectrico2DIT() {
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
     * Test of getPuntoDeCarga method, of class CampoElectrico2D.
     */
    @Test
    public void testGetPuntoDeCarga() {
        System.out.println("getPuntoDeCarga");
        CampoElectrico2D instance = null;
        Point2D expResult = null;
        Point2D result = instance.getPuntoDeCarga();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPuntoDeCarga method, of class CampoElectrico2D.
     */
    @Test
    public void testSetPuntoDeCarga() {
        System.out.println("setPuntoDeCarga");
        Point2D p = null;
        CampoElectrico2D instance = null;
        instance.setPuntoDeCarga(p);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getList method, of class CampoElectrico2D.
     */
    @Test
    public void testGetList() {
        System.out.println("getList");
        CampoElectrico2D instance = null;
        ArrayList<Carga> expResult = null;
        ArrayList<Carga> result = instance.getList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setList method, of class CampoElectrico2D.
     */
    @Test
    public void testSetList() {
        System.out.println("setList");
        ArrayList<Carga> l = null;
        CampoElectrico2D instance = null;
        instance.setList(l);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getE method, of class CampoElectrico2D.
     */
    @Test
    public void testGetE() {
        System.out.println("getE");
        CampoElectrico2D instance = null;
        double expResult = 0.0;
        double result = instance.getE();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAngleE method, of class CampoElectrico2D.
     */
    @Test
    public void testGetAngleE() {
        System.out.println("getAngleE");
        CampoElectrico2D instance = null;
        double expResult = 0.0;
        double result = instance.getAngleE();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEx method, of class CampoElectrico2D.
     */
    @Test
    public void testGetEx() {
        System.out.println("getEx");
        CampoElectrico2D instance = null;
        double expResult = 0.0;
        double result = instance.getEx();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEy method, of class CampoElectrico2D.
     */
    @Test
    public void testGetEy() {
        System.out.println("getEy");
        CampoElectrico2D instance = null;
        double expResult = 0.0;
        double result = instance.getEy();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class CampoElectrico2D.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        CampoElectrico2D instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
