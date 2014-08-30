/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.rdvmedecin.proprietes;

import com.rdvmedecin.response.ReturnCode;
import org.dom4j.DocumentException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author nicole
 */
public class PropertiesIT {
    
    public PropertiesIT() {
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
     * Test of getProp method, of class Properties.
     */
    @Test
    public void testGetProp() throws DocumentException {
        System.out.println("getProp");
        Properties instance = new Properties();
        String[] expResult = null;
        String[] result = instance.getProp();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setProp method, of class Properties.
     */
    @Test
    public void testSetProp() throws DocumentException {
        System.out.println("setProp");
        String[] prop = null;
        Properties instance = new Properties();
        instance.setProp(prop);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getReturn_code method, of class Properties.
     */
    @Test
    public void testGetReturn_code() throws DocumentException {
        System.out.println("getReturn_code");
        Properties instance = new Properties();
        ReturnCode expResult = null;
        ReturnCode result = instance.getReturn_code();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setReturn_code method, of class Properties.
     */
    @Test
    public void testSetReturn_code() throws DocumentException {
        System.out.println("setReturn_code");
        ReturnCode return_code = null;
        Properties instance = new Properties();
        instance.setReturn_code(return_code);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCaller method, of class Properties.
     */
    @Test
    public void testGetCaller() throws DocumentException {
        System.out.println("getCaller");
        Properties instance = new Properties();
        String[] expResult = null;
        String[] result = instance.getCaller();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCaller method, of class Properties.
     */
    @Test
    public void testSetCaller() throws DocumentException {
        System.out.println("setCaller");
        String[] Caller = null;
        Properties instance = new Properties();
        instance.setCaller(Caller);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
