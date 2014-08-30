/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.rdvmedecin;

import com.rdvmedecin.rdvmedecinentities.MedecinCrenaux;
import com.rdvmedecin.response.PatientByNumeroSecuResponse;
import java.util.List;
import javax.ejb.embeddable.EJBContainer;
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
public class MonWebServiceIT {
    
    public MonWebServiceIT() {
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
     * Test of createPatient method, of class MonWebService.
     */
    @Test
    public void testCreatePatient() throws Exception {
        System.out.println("createPatient");
        String wscaller = "";
        String nom = "";
        Integer num_secu = null;
        String adresse = "";
        String email = "";
        String telephone = "";
        String code_postal = "";
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        MonWebService instance = (MonWebService)container.getContext().lookup("java:global/classes/MonWebService");
        String expResult = "";
        String result = instance.createPatient(wscaller, nom, num_secu, adresse, email, telephone, code_postal);
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPatientByNumeroSecu method, of class MonWebService.
     */
    @Test
    public void testGetPatientByNumeroSecu() throws Exception {
        System.out.println("getPatientByNumeroSecu");
        String wscaller = "";
        Integer num_secu = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        MonWebService instance = (MonWebService)container.getContext().lookup("java:global/classes/MonWebService");
        PatientByNumeroSecuResponse expResult = null;
        PatientByNumeroSecuResponse result = instance.getPatientByNumeroSecu(wscaller, num_secu);
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createMedecin method, of class MonWebService.
     */
    @Test
    public void testCreateMedecin() throws Exception {
        System.out.println("createMedecin");
        String wscaller = "";
        String nom = "";
        Integer num_secu = null;
        String adresse = "";
        String email = "";
        String telephone = "";
        String code_postal = "";
        String cabinet = "";
        String specialite = "";
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        MonWebService instance = (MonWebService)container.getContext().lookup("java:global/classes/MonWebService");
        String expResult = "";
        String result = instance.createMedecin(wscaller, nom, num_secu, adresse, email, telephone, code_postal, cabinet, specialite);
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCrenauxSpecialite method, of class MonWebService.
     */
    @Test
    public void testGetCrenauxSpecialite() throws Exception {
        System.out.println("getCrenauxSpecialite");
        String wscaller = "";
        String specialite = "";
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        MonWebService instance = (MonWebService)container.getContext().lookup("java:global/classes/MonWebService");
        List<MedecinCrenaux> expResult = null;
        List<MedecinCrenaux> result = instance.getCrenauxSpecialite(wscaller, specialite);
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
