/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.rdvmedecin.ejb;

import com.rdvmedecin.rdvmedecinentities.MedecinCrenaux;
import com.rdvmedecin.rdvmedecinentities.Patient;
import com.rdvmedecin.rdvmedecinentities.Personne;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author nicole
 */
@Local
public interface PatientFacadeLocal {

    public String createPatient(String wscaller, String nom, Integer num_secu, String adresse, String email, String telephone, String code_postal);
    
    public Personne getPatientByNumeroSecu(String wscaller, Integer num_secu);
    
    public String createMedecin(String wscaller, String nom, Integer num_secu, String adresse, String email, String telephone, String code_postal, String cabinet, String specialite);
    
    public List<MedecinCrenaux> getCrenauxSpecialite(String wscaller, String specialite);
    
    void create(Patient patient);

    void edit(Patient patient);

    void remove(Patient patient);

    Patient find(Object id);

    List<Patient> findAll();

    List<Patient> findRange(int[] range);

    int count();
    
}
