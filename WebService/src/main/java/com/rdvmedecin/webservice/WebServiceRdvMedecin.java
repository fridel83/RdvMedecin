/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.rdvmedecin.webservice;

import com.rdvmedecin.rdvmedecinejb.PatientFacade;
import com.rdvmedecin.rdvmedecinejb.PatientFacadeLocal;
import com.rdvmedecin.rdvmedecinentities.MedecinCrenaux;
import com.rdvmedecin.rdvmedecinentities.Patient;
import com.rdvmedecin.rdvmedecinentities.Personne;
import java.util.List;
import javax.ejb.EJB;
import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 *
 * @author nicole
 */
@WebService
public class WebServiceRdvMedecin implements PatientFacadeLocal 
{
    
    @EJB
    private PatientFacade patientFacade;
    
    @WebMethod
    @Override
     public String createPatient(String nom, Integer num_secu, String adresse, String email, String telephone, String code_postal) {
       return patientFacade.createPatient(nom, num_secu, adresse, email, telephone, code_postal);
    }
    
    /**
     *
     * @param num_secu
     * @return
     */
    @WebMethod
    @Override
    public Personne getPatientByNumeroSecu(Integer num_secu) {
        return patientFacade.getPatientByNumeroSecu(num_secu);
    }
    @WebMethod
    @Override
    public String createMedecin(String nom, Integer num_secu, String adresse, String email, String telephone, String code_postal, String cabinet, String specialite) {
        return patientFacade.createMedecin(nom, num_secu, adresse, email, telephone, code_postal, cabinet, specialite);
    }
    @WebMethod
    @Override
    public List<MedecinCrenaux> getCrenauxSpecialite(String specialite) {
        return patientFacade.getCrenauxSpecialite(specialite);
    }

    @Override
    public void create(Patient patient) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void edit(Patient patient) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remove(Patient patient) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Patient find(Object id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Patient> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Patient> findRange(int[] range) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int count() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
